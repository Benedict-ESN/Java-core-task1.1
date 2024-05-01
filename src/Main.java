import java.util.function.*;

public class Main {
    public static void main (String[] args) {
        // Создание экземпляра класса Calculator через вызов статической переменной instance
        Calculator calc = Calculator.instance.get();

        // Произведение нескольких математических операций над числами
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = 0;
        try {
            c = calc.divide.apply(a, b); // Попытка деления
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage()); // Обработка исключения при делении на ноль
        }

        // Вывод результата в консоль
        calc.println.accept(c);
    }
}

