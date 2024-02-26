public class TestAreaCalculator {
    public static void main(String[] args){
        AreaCalculator square = new AreaCalculator();
        System.out.println("Area of square:" + square.computeArea(12.0));

        System.out.println();

        AreaCalculator rectangle = new AreaCalculator();
        System.out.println("Area of rectangle: " + rectangle.computeArea(10.0, 12.0));

        System.out.println();
        AreaCalculator circle = new AreaCalculator();
        System.out.println("Area of circle: " + circle
                .computeArea("circle", 10.0));
    }
}

