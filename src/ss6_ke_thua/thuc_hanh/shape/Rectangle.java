package ss6_ke_thua.thuc_hanh.shape;

public abstract class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;
    public Rectangle(){}
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return 2*(this.width + this.length);
    }
    @Override
    public String toString(){
        return "A Rectangle with =" + getWidth() + " and length= " + getLength() + ", which is a " + super.toString();
    }

    public abstract void setLenght(double lenght);
}
