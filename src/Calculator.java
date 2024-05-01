import java.util.function.*;

public class Calculator {
    // Создание статической переменной типа Supplier для получения экземпляра класса Calculator
    static Supplier<Calculator> instance = Calculator::new;

    // Переменные типа BinaryOperator для математических операций над двумя числами
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    // Добавляем проверку деления на ноль
    BinaryOperator<Integer> divide = (x, y) -> {
        if (y == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return x / y;
    };

    // Переменные типа UnaryOperator для математических операций над одним числом
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    // Переменная типа Predicate для определения положительного числа
    Predicate<Integer> isPositive = x -> x > 0;

    // Переменная типа Consumer для вывода числа в консоль
    Consumer<Integer> println = System.out::println;

    // Приватный конструктор, чтобы запретить создание экземпляров класса вне него
    private Calculator() {}

}
