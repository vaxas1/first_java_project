package mypath;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        System.out.println("Круг: ");
        System.out.println("Площадь: " + circle1.getArea());
        System.out.println("Периметр: " + circle1.getPerimeter());

        System.out.println("\n");

        Rectangle rectangle1 = new Rectangle(4, 40);
        System.out.println("Прямоугольник 1:");
        System.out.println("Ширина: " + rectangle1.width);
        System.out.println("Высота: " + rectangle1.height);
        System.out.println("Площадь: " + rectangle1.getArea());
        System.out.println("Периметр: " + rectangle1.getPerimeter());

        System.out.println("\n");

        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("Прямоугольник 2:");
        System.out.println("Ширина: " + rectangle2.width);
        System.out.println("Высота: " + rectangle2.height);
        System.out.println("Площадь: " + rectangle2.getArea());
        System.out.println("Периметр: " + rectangle2.getPerimeter());

        System.out.println("\n");

        Stock stock = new Stock("SBER", "ПАО Сбербанк");
        stock.previousClosingPrice = 281.50;
        stock.currentPrice = 282.87;
        System.out.println("Изменение стоимости акций: " + stock.getChangePercent() + "%");
    }
}
