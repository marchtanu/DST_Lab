package Lab07;
//Name: Tanuphat Sojindamanee
//ID: 6887020
//Section: 1
import java.util.ArrayList;

public class ShoppingCart {

  private ArrayList<Product> products;
  private int customerAge;
  private boolean isMember;

  public ShoppingCart(int customerAge, boolean isMember) {
    this.products = new ArrayList<Product>();
    this.customerAge = customerAge;
    this.isMember = isMember;
    System.out.println("Shopping Cart is created ... ");
  }

  public void setCustomerAge(int age) {
    this.customerAge = age;
  }

  public void setMember(boolean member) {
    this.isMember = member;
  }

  public int getCustomerAge() {
    return this.customerAge;
  }

  public boolean getMember() {
    return this.isMember;
  }

  // TODO 5: add product
  public void addProduct(Product product) {
    // YOUR CODE HERE
    //
    //
    if (product instanceof AgeRestrictedProduct) {
      AgeRestrictedProduct newProduct = (AgeRestrictedProduct) product;
      if (newProduct.isEligible(this.customerAge)) {
        System.out.println("You are not eligible to purchase " + product.getName());

      } else {
        System.out.println(product.getName() + " added to cart");
        this.products.add(product);

      }
      return;
    }
    if (product instanceof MemberOnlyProduct) {
      MemberOnlyProduct newProduct = (MemberOnlyProduct) product;
      if (newProduct.isEligible(this.isMember)) {
        this.products.add(newProduct);
        System.out.println(product.getName() + " added to cart");
      } else {
        System.out.println("Only member can purchase " + product.getName());
      }
      return;
    }

    this.products.add(product);
    System.out.println(product.getName() + " added to cart");

  }

  // TODO 6: calculate total price
  public double calculateTotalPrice() {
    // YOUR CODE HERE
    //
    //
    double total = 0;
    for (Product i : products) {
      total += i.getPrice();

    }
    return total;
  }

  public void clear() {
    products.clear();
    System.out.println("Shopping Cart is cleared ... ");
  }

  // DO NOT MODIFY MAIN
  public static void main(String[] args) {
    System.out.println("Creating Products");
    Product candy = new Product("Candy", 25.00);
    AgeRestrictedProduct wine = new AgeRestrictedProduct("Wine", 999, 21);
    MemberOnlyProduct sticker = new MemberOnlyProduct("sticker", 20, true);
    System.out.println("------------------------------------------\n");

    ShoppingCart cart = new ShoppingCart(20, false);
    cart.addProduct(candy);
    cart.addProduct(wine);
    cart.addProduct(sticker);

    System.out.println("\nChecking out (Age:" + cart.getCustomerAge() + ")");
    System.out.println("\nChecking out (Member:" + cart.getMember() + ")");
    System.out.println("Total price: " + cart.calculateTotalPrice());
    System.out.println("------------------------------------------\n");

    cart.clear(); // clear shopping cart (remove all products in the cart)
    cart.setCustomerAge(35); // change the customer age to 35 years old
    cart.setMember(true); // change the customer age to 35 years old
    cart.addProduct(candy);
    cart.addProduct(wine);
    cart.addProduct(sticker);

    System.out.println("\nChecking out (Age:" + cart.getCustomerAge() + ")");
    System.out.println("\nChecking out (Member:" + cart.getMember() + ")");
    System.out.println("Total price: " + cart.calculateTotalPrice());
    System.out.println("------------------------------------------\n");

  }

}
