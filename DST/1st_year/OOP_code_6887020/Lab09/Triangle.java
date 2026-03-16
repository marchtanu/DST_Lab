public class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle(){
        super();
        this.base = 0;
        this.height = 0;

    }
    public Triangle(String color, double base, double height){
        super(color);
        this.base = base;
        this.height = height;

    }
    @Override
    public double getArea(){
        return 0.5 * this.base * this.height;
    }
    public double getArea(double base, double height){
        this.base = base;
        this.height = height;
        return getArea();
    }
    
    @Override
    public String toString(){
        return "Triangle[base="+ this.base + ",height="+ this.height + ",Shape[color="+super.getColor()+"]]";
    }
}