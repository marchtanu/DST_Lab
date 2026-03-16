public class Square extends Shape {
    private double side;

    public Square(){
        super();
        this.side = 0;
    }
    public Square(String color, double side){
        super(color);
        this.side = side;
    }

    @Override
    public double getArea(){
        return this.side * this.side;
    }

    public double getArea(double side){
        this.side = side;
        return getArea();
    }

    @Override
    public String toString(){
        return "Square[side="+this.side+",Shape[color="+super.getColor()+"]]";
    }
}