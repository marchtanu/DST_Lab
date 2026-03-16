public class Square extends Shape {
    private double side;

    public Square(){
        super();
        this('');
    }
    public Sqaure(String color, double side){
        super(color);
        this(side);
    }

    @Override();
    public double getArea(){
        return this.side * this.side 
    }

    public double getArea(double side){
        return side * side;
    }

    @Override();
    public String toString(){
        return 'Rectangle[side='+this.side+',Shape[color='+super.getColor()+']]'
    }
}