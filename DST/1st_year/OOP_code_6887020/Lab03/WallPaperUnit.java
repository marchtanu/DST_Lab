public class WallPaperUnit {
  protected String name;
  protected double length;

  public String getName() {
    System.out.println(this.name);
    return name;
  };

  public double getLength() {
    System.out.println(length);
    return length;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public void setLength(double newLength) {
    this.length = newLength;
  }
}
