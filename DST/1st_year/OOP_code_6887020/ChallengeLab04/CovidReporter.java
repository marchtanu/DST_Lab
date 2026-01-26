package ChallengeLab04;

//Name: Tanuphat Sojindamanee
//ID: 6887020
//Section: 1
public class CovidReporter {
  public static CovidProfile obj1 = new CovidProfile();
  public static CovidProfile obj2 = new CovidProfile("2026-01-26", "Thailand", 100, 0, 100000);

  public static void main(String[] args) {
    System.out.println(obj1.isSevere());
    System.out.println(obj2.isSevere());
    System.out.println(CovidProfile.ProfileCount);

  }
}