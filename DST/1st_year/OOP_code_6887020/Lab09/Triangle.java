public class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle(){
        super();
        this('','');

    }
    public Triangle(String color, double base, double height){
        super(color);
        this(base, height);

    }
    @Override();
    public double getArea(){
        return 0.5 * this.base * this.height;
    }
    public double getArea(double base, double height){
        return 0.5 * base * height;
    }
    
    @Override();
    public String toString(){
        return 'Triangle[base='+ this.base + ',height='+ this.height + ',Shape[color='+super.getColor()+']]'
    }
}