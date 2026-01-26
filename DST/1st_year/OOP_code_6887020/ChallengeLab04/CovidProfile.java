package ChallengeLab04;
//Name: Tanuphat Sojindamanee

//ID: 6887020
//Section: 1

public class CovidProfile {
  public static int ProfileCount;
  protected String date = "2020-01-18";
  protected String location = "Thailand";
  protected int accumulatedCases = 17023;
  protected int cureCases = 11396;
  protected int deathCases = 76;

  public CovidProfile() {
    ProfileCount += 1;
    this.date = "none";
    this.location = "none";
    this.accumulatedCases = 0;
    this.cureCases = 0;
    this.deathCases = 0;
  }

  public CovidProfile(String date, String location, int noACC, int noCured, int noDeath) {
    ProfileCount += 1;
    this.date = date;
    this.location = location;
    this.accumulatedCases = noACC;
    this.cureCases = noCured;
    this.deathCases = noDeath;

  }

  public String getLocation() {
    return this.location;
  };

  public int getAccumulatedCases() {
    return this.accumulatedCases;
  };

  public int getCureCases() {
    return this.cureCases;
  };

  public int getDeathCases() {
    return this.deathCases;
  };

  public void setLocation(String loc) {
    this.location = loc;
  };

  public void setAccumulatedCases(int value) {
    this.accumulatedCases = value;
  };

  public void setCureCases(int value) {
    this.cureCases = value;
  };

  public void setDeathCases(int value) {
    this.deathCases = value;

  };

  public void printCovidinfo() {
    System.out.println(String.format("""
        %s at %s
        Accumulative Patient: %d
        Cured Patient: %d
        Death Case: %d
        """,
        this.location.toUpperCase(),
        this.date,
        this.accumulatedCases,
        this.cureCases,
        this.deathCases));
  }

  public boolean isSevere() {
    return this.deathCases > 10000;
  }
}
