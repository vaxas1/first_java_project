package mypath;

//        +----------------------------------+
//        |          Rectangle               |
//        +----------------------------------+
//        | - width: double                  |
//        | - height: double                 |
//        |----------------------------------|
//        | + Rectangle()                    |
//        | + Rectangle(width: double, height: double) |
//        | + getArea(): double              |
//        | + getPerimeter(): double         |
//        +----------------------------------+

public class Rectangle {
    double width;
    double height;

    /** Безаргументный конструктор, создающий прямоугольник с шириной и высотой -1 */
    Rectangle() {
        width = -1;
        height = -1;
    }

    /** Конструктор, создающий прямоугольник с указанной шириной и высотой */
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    /** Возвращает площадь прямоугольника */
    double getArea() {
        return width * height;
    }

    /** Возвращает периметр прямоугольника */
    double getPerimeter() {
        return 2 * (width + height);
    }
}

