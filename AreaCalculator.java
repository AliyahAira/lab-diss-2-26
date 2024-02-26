public class AreaCalculator {

    //comp area of rec
    public Double computeArea(Double side1, Double side2){
        return side1 * side2;
    }

    //square
    public Double computeArea(Double side){
        return side*side;
    }

    //circle
    public Double computeArea( String circle, Double radius){
        if (circle.equals("circle")){
            return 3.1416 * (radius*radius);
        }
        else {
            return null;
        }



    }
}
