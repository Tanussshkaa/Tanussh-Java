package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Button myButton = new Button();
        myButton.click(); // Вывод: Кнопка нажата! Текущее количество нажатий: 1
        myButton.click(); // Вывод: Кнопка нажата! Текущее количество нажатий: 2
        System.out.println("Общее количество нажатий: " + myButton.getClickCount()); // Вывод: Общее количество нажатий: 2
    }
}

class Button {
    private int clickCount;

    public Button() {
        this.clickCount = 0;
    }

    public void click() {
        clickCount++;
        System.out.println("Кнопка нажата! Текущее количество нажатий: " + clickCount);
    }

    public int getClickCount() {
        return clickCount;
    }
}
