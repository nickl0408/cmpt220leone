
class Circle {

    private double x;
    private double y;
    private double radius;

    public Circle(Circle c) {
        this(c.getX(), c.getY(), c.getRadius());
    }
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle() {
        this(0, 0, 1);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {

        return 2 * radius * Math.PI;

    }
    
    public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + 
		Math.pow(y - this.y, 2))  < radius;
	}
	
	public boolean contains(Circle circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
		Math.pow(circle.getY() - y, 2)) <= Math.abs(radius - circle.getRadius());
	}
	
	public boolean overlaps(Circle circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
		Math.pow(circle.getY() - y, 2)) <= radius + circle.getRadius();
	}
}
