public class Main {
//First level: 1. Создать иерархию классов геометрических фигур
//Должны быть следующие классы
//Figure, Square, Circle, Triangle, Rectangle

//У каждой фигуры должен быть метод public void show(), который распечатывает сообщение, какая именно фигура, например, "I'm a square!"
    //Создать каждую фигуру и вызвать метод.

        public static void main(String[] args) {

            Square square = new Square("Square " ,5);
            Circle circle = new Circle("Circle " , 2);
            Triangle triangle = new Triangle("Triangle", 3);
            Rectangle rectangle = new Rectangle("Rectangle", 5,6);

            square.show();
            circle.show();
            triangle.show();
            rectangle.show();
        }
    }
