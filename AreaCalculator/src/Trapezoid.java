public class Trapezoid {

    private double upperBase;
    private double bottomBase;
    private double high;

    /**
     * Constructor.
     * @param upperBase
     * @param bottomBase
     * @param high
     */
    Trapezoid(double upperBase, double bottomBase, double high){
        this.high = high;
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
    }


    /**
     * Set the parameters of the trapezoid.
     */

    void setUpperBase(double upperBase){
        this.upperBase = upperBase;
    }
    void setBottomBase(double bottomBase){
        this.bottomBase = bottomBase;
    }
    void setHigh(double high){
        this.high = high;
    }

    /**
     * Get the parameters of the trapezoid.
     */
    double getUpperBase(){
        return upperBase;
    }
    double getBottomBase(){
        return bottomBase;
    }
    double getHigh(){
        return high;
    }

    /**
     * Get the area of the trapezoid.
     */
    double getArea(){
        return (bottomBase + upperBase) * high *0.5;
    }

    /**
     * Print the parameters of this trapezoid on the screen.
     */

    void print(){
        System.out.printf("I am a trapezoid, my upperBase is " + upperBase);
        System.out.print(", my bottomBase is " + bottomBase);
        System.out.print(", my high is " + high);
        System.out.println(", and my area is " + getArea());
    }


}
