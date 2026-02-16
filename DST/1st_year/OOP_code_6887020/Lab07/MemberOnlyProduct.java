package Lab07;
//Name: Tanuphat Sojindamanee
//ID: 6887020
//Section: 1
public class MemberOnlyProduct extends Product {
  private boolean MemberOnly;

  public MemberOnlyProduct(String name, double price, boolean member){
    super(name, price);
    this.MemberOnly = member;

    System.out.println("Creating Member-Only Product...");

  }
  public boolean isEligible(boolean isMember){
    return isMember;
  }

  @Override
	public String toString() {
		// YOUR CODE HERE
		//
		//
    String name = this.getName();
    double price = this.getPrice();
		return "Name: " + name + ", price: " + price + ", Member status: " + this.MemberOnly;
	}
  
}
