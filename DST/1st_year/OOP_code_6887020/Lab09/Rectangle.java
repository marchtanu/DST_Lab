public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(){
        super();
        this('','');
    }

    public Rectangle(String color,double length,double width){
        super(color);
        this(length,width);
    }

    @Override();
    public double getArea(){
        return this.length * this.width;
    }

    public double getArea(double length, double width){
        return length * width;
    }
    @Override();
    public String toString(){
        return 'Rectangle[length='+this.length+', width='+this.width+',Shape[color='+super.getColor()+']]'
    }



}