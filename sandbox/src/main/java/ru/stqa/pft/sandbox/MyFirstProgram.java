package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Andrey");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p1 = new Point();
    p1.x1 = 1;
    p1.y1 = 2;

    Point p2 = new Point();
    p2.x2 = 3;
    p2.y2 = 4;
  }
  
  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }


}