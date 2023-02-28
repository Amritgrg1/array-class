public class Shape {


    // Default Constructor
    Shape() {
          width = 10;
          height = 20;
    }

    // Parameterized Constructor

    Shape(int w, int h) {
        width = w;
        height = h;

    }

    public void area() {
        System.out.println("This is multiplication of width and height:");
        System.out.println(width*height);

    }

}

