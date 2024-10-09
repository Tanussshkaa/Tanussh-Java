package org.example;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
// Задание 1
        System.out.println("\nЗадание 1");
        Button button = new Button();
        button.click();
        button.click();
        button.click();

// Задание 2
        System.out.println("\nЗадание 2");
        Balance balance = new Balance();

        balance.addLeft(5);
        balance.addRight(3);
        balance.result();
        balance.addRight(2);
        balance.result();
        balance.addRight(1);
        balance.result();

// Задание 3
        System.out.println("\nЗадание 3");
        Bell bell = new Bell();
        for (int i = 0; i < 10; i++) {
            bell.sound();
        }

// Задание 4
        System.out.println("\n Задание 4");
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);
        separator.addNumber(5);
        separator.addNumber(6);

        separator.even();
        separator.odd();

// Задание 5
        System.out.println("\n Задание 5");
        // Создаем таблицу с 3 строками и 4 столбцами
        Table table = new Table(3, 4);

        // Выводим количество строк и столбцов
        System.out.println("Количество строк: " + table.rows());
        System.out.println("Количество столбцов: " + table.cols());

        // Выводим таблицу в строку
        System.out.println("Таблица: \n" + table.toString());

        // Задаем значения в ячейках
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(0, 2, 3);
        table.setValue(0, 3, 4);
        table.setValue(1, 0, 5);
        table.setValue(1, 1, 6);
        table.setValue(1, 2, 7);
        table.setValue(1, 3, 8);
        table.setValue(2, 0, 9);
        table.setValue(2, 1, 10);
        table.setValue(2, 2, 11);
        table.setValue(2, 3, 12);

        // Выводим таблицу в строку после задания значений
        System.out.println("Таблица после задания значений: \n" + table.toString());

        // Выводим среднее арифметическое всех значений таблицы
        System.out.println("Среднее арифметическое: " + table.average());

        // Читаем значение из ячейки
        System.out.println("Значение в ячейке (1, 2): " + table.getValue(1, 2));


    }
}

class Button {
    private int clicks;

    public Button() {
        this.clicks = 0;
    }

    public void click() {
        this.clicks++;
        System.out.println("Тык! Текущее количество нажатий: " + this.clicks);
    }
}

class Balance {
    private int leftWeight;
    private int rightWeight;

    public Balance() {
        this.leftWeight = 0;
        this.rightWeight = 0;
    }

    public void addLeft(int weight) {
        this.leftWeight += weight;
    }

    public void addRight(int weight) {
        this.rightWeight += weight;
    }

    public void result() {
        if (this.leftWeight == this.rightWeight) {
            System.out.println("=");
        } else if (this.leftWeight > this.rightWeight) {
            System.out.println("L");
        } else {
            System.out.println("R");
        }
    }
}

class Bell {
    private boolean Ding = true;

    public void sound() {
        if (Ding) {
            System.out.println("ding");
            Ding = false;
        } else {
            System.out.println("dong");
            Ding = true;
        }
    }
}

class OddEvenSeparator {
    private List<Integer> numbers;
    private List<Integer> evenNumbers;
    private List<Integer> oddNumbers;

    public OddEvenSeparator() {
        numbers = new ArrayList<>();
        evenNumbers = new ArrayList<>();
        oddNumbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }
    }

    public void even() {
        System.out.println("Чётные числа: " + evenNumbers);
    }

    public void odd() {
        System.out.println("Нечётные числа: " + oddNumbers);
    }
}

class Table {
    private int[][] table;
    private int rows;
    private int cols;

    public Table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.table = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                table[i][j] = 0;
            }
        }
    }

    public int rows() {
        return rows;
    }

    public int cols() {
        return cols;
    }

    public void setValue(int row, int col, int value) {
        table[row][col] = value;
    }

    public int getValue(int row, int col) {
        return table[row][col];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(table[i][j] + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += table[i][j];
            }
        }
        return (double) sum / (rows * cols);
    }
}



