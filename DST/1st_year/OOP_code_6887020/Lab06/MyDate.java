public class MyDate {
  public int year;
  public int month;
  public int day;
  public int objectNumber;
  public static int objectCount = 0;
  public static String[] strMonths = { "January", "February", "March", "April", "May", "June", "July", "August",
      "September", "October", "November", "December" };
  public MyDate() {
    this.year = 1900;
    this.month = 1;
    this.day = 1;
    objectCount++;
    this.objectNumber = objectCount;
  }
  public MyDate(int aYear, int aMonth, int aDay) {
    this.year = aYear;
    this.month = aMonth;
    this.day = aDay;
    objectCount++;
    this.objectNumber = objectCount;
  }
  public static boolean isLeapYear(int year) {
    return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
  }
  public int getObjectNumber() {
    return this.objectNumber;
  }
  public void setDate(int aYear, int aMonth, int aDay) {
    this.year = aYear;
    this.month = aMonth;
    this.day = aDay;
  }
  public void setYear(int aYear) {
    this.year = aYear;
  }
  public void setMonth(int aMonth) {
    this.month = aMonth;
  }
  public void setDay(int aDay) {
    this.day = aDay;
  }
  public int getYear() {
    return this.year;
  }
  public int getMonth() {
    return this.month;
  }
  public int getDay() {
    return this.day;
  }
  public String toString() {
    return this.day + " " + strMonths[this.month - 1].substring(0, 3) + " " + this.year;
  }
  // Challenge Task Bonus Methods
  public MyDate nextDay() {
    if (this.month == 2 && isLeapYear(this.year)) {
      if (this.day < 29) {
        this.day += 1;
        return this;
      } else {
        this.day = 1;
        this.month += 1;
        return this;
      }
    }
    if (this.month == 2 && !isLeapYear(this.year)) {
      if (this.day < 28) {
        this.day += 1;
        return this;
      } else {
        this.day = 1;
        this.month += 1;
        return this;
      }
    }
    if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
      if (this.day < 30) {
        this.day += 1;
        return this;
      } else {
        this.day = 1;
        this.month += 1;
        return this;
      }
    }
    if (this.day < 31) {
      this.day += 1;
    } else {
      this.day = 1;
      if (this.month < 12) {
        this.month += 1;
      } else {
        this.month = 1;
        this.year += 1;
      }
    }
    return this;
  }
  public MyDate nextMonth() {
    if (this.month < 12) {
      this.month += 1;
    } else {
      this.month = 1;
      this.year += 1;
    }
    return this;
  }
  public MyDate nextYear() {
    this.year += 1;
    return this;
  }
  public MyDate previousDay() {
    if (this.month == 3) {
      if (isLeapYear(this.year)) {
        if (this.day > 1) {
          this.day -= 1;
          return this;
        } else {
          this.day = 29;
          this.month -= 1;
          return this;
        }
      } else {
        if (this.day > 1) {
          this.day -= 1;
          return this;
        } else {
          this.day = 28;
          this.month -= 1;
          return this;
        }
      }
    }
    if (this.month == 1 && this.day == 1) {
      this.day = 31;
      this.month = 12;
      this.year -= 1;
      return this;
    }
    if (this.month == 5 || this.month == 7 || this.month == 10 || this.month == 12) {
      if (this.day == 1) {
        this.day = 30;
        this.month -= 1;
        return this;
      } else {
        this.day -= 1;
        return this;
      }
    } else {
      if (this.day == 1) {
        this.day = 31;
        this.month -= 1;
        return this;
      } else {
        this.day -= 1;
        return this;
      }
    }
  }
  public MyDate previousMonth() {
    if (this.month > 1) {
      this.month -= 1;
    } else {
      this.month = 12;
      this.year -= 1;
    }
    return this;
  }
  public MyDate previousYear() {
    if (this.month == 2 && this.day == 29 && !isLeapYear(this.year - 1)) {
      this.day = 28;
    }
    this.year -= 1;
    return this;
  }
}