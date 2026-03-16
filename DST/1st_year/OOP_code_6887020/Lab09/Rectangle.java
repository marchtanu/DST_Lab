public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(){
        super();
        this.length = 0;
        this.width =0;
    }

    public Rectangle(String color,double length,double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return this.length * this.width;
    }

    public double getArea(double length, double width){
        this.length = length;
        this.width = width;
        return getArea();
    }
    @Override
    public String toString(){
        return "Rectangle[length="+this.length+", width="+this.width+",Shape[color="+super.getColor()+"]]";
    }



}