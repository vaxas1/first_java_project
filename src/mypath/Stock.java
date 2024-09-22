package mypath;

//        +--------------------------------------------------+
//        |                      Stock                      |
//        +--------------------------------------------------+
//        | - symbol: String                                 |
//        | - name: String                                   |
//        | - previousClosingPrice: double                   |
//        | - currentPrice: double                           |
//        +--------------------------------------------------+
//        | + Stock(symbol: String, name: String)            |
//        | + getChangePercent(): double                     |
//        +--------------------------------------------------+


public class Stock {
    String symbol; // обозначение акций
    String name;   // наименование акций
    double previousClosingPrice; // стоимость на момент закрытия предыдущего дня
    double currentPrice; // текущая стоимость акций

    /** Конструктор, создающий акции с указанными символом и названием */
    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    /** Метод, возвращающий процент изменения стоимости акций */
    double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
