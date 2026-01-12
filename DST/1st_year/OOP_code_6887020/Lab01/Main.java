package Lab01;
//Name: Tanuphat Sojindamanee
//ID: 6887020
//Section: 1

public class Main {
  public static void sayS() {
    System.out.println(
        """
              XXXXX
              X
              XXXXX
                   X
              XXXXX
            """);
  }

  public static void sayDST() {
    System.out.println(
      """
        XXX   xxxx  xxxxx      x   x
        X  x  x       x 
        X  x  xxxx    x    x           x
        x  X     x    x      xx     xx
        XXX   xxxx    x        xxxxx
      """);
  };
    
  public static void sayProblem() {  
    System.out.println(
        """
            Who is your "Advanced Programming" instructor?
              a.) Aj. Tipajin
              b.) Aj. Suppawong
              c.) Aj. Punyanuch
                        """);
  };
  public static void Sum(double a, double b){
    System.out.println(a + b);
  }

  public static void main(String[] args) {
    Sum(5, 2);
  };
};
