import java.util.Scanner ;

class Main{
    public static void main(String[] args){
        Rectangle ob2  = new Rectangle() ;
        Triangle ob1 = new Triangle() ;
        Circle ob3 = new Circle() ;
        ob2.printArea() ;
        ob1.printArea() ;
        ob3.printArea() ;
        System.out.println("Vaibhav Dhar" )  ;
        System.out.print("1BM23CD068") ;
    }
}

abstract class Shape{
    Scanner sc = new Scanner(System.in) ;
    int dimension1 , dimension2  ;
    abstract void printArea();
}

class Rectangle extends Shape{

    Rectangle(){
        System.out.println("Enter the dimensions of the rectangle(Length and Breadth): " ) ;
        dimension1 = sc.nextInt() ;
        dimension2 = sc.nextInt() ;
    }

    void printArea(){
        System.out.print("The area of the rectangle is = ") ;
        System.out.println(dimension1*dimension2) ;
    }
}

class Triangle extends Shape{
    Triangle(){
        System.out.println("Enter the dimensions of the triangle(base and height): " ) ;
        dimension1 = sc.nextInt() ;
        dimension2 = sc.nextInt() ;
    }

    void printArea(){
        System.out.print("The area of the Triangle is = ") ;
        System.out.println(0.5*dimension1*dimension2) ;
    }
}
class Circle extends Shape{
    Circle(){
        System.out.println("Enter the dimension of the circle(radius): ")  ;
        dimension1 = sc.nextInt() ;

    }

    void printArea(){
        System.out.print("The area of the Circle is = ") ;
        System.out.println(3.1415926535897*dimension1*dimension1) ;
    }
}