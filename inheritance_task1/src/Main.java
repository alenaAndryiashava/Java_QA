public class Main {
//First level: 1. Создать иерархию классов геометрических фигур
//Должны быть следующие классы
//Figure, Square, Circle, Triangle, Rectangle

//У каждой фигуры должен быть метод public void show(), который распечатывает сообщение, какая именно фигура, например, "I'm a square!"
    //Создать каждую фигуру и вызвать метод.

        public static void main(String[] args) {
            System.out.println("__________________");

            Square square = new Square();
            square.show();
            Circle circle = new Circle();
            circle.show();
            Triangle triangle = new Triangle();
            triangle.show();
            Rectangle rectangle = new Rectangle();
            rectangle.show();

            System.out.println("-----------------");
            Figure figure = new Triangle();
            figure.show();
            Rectangle rectangle1 = new Square();
            rectangle1.show();





        }
    }
