class Circle {

    double radius;

    public double getDiameter() {
        return this.radius * 2.0;
    }

    public double getLength() {
        return this.getDiameter() * Math.PI;
    }
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
