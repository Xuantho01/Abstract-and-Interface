public class Circle extends Shap implements Resizeable,getArea{
    private double radius = 1.0;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "A circle with radius = "
                + getRadius()
                + " , Which is a subclass of "
                +super.toString();
    }

    @Override
    public void resize(double percent) {
           this.radius = this.radius*percent/100;
    }

    @Override
    public double get_Area() {
        return this.radius*this.radius*Math.PI;
    }
}
