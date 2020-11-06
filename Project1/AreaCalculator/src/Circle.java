public class Circle {

    private double radius;

    /**
     * Constructor.
     * @param radius
     */
    Circle (double radius){
        this.radius = radius;

    }
    /**
     * Set the radius of this circle.
     * @param radius
     */
    void setCircle (double radius){
        this.radius = radius;
    }

    /**
     * Get the radius of this circle.
     * @return
     */
    double getRadius(){
        return radius;
    }

    /**
     * Get the area of the circle.
     * @return
     */
    double getArea(){
        return Math.PI * radius * radius;
    }


    /**
     * Print the parameters of this circle on the screen.
     */
    void print(){
        System.out.print("I am a circle, my radius is "+ radius);
        System.out.printf( ", and my area is %.2f\n", getArea());
    }


}
