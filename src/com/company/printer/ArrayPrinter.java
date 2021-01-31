package com.company.printer;

import java.util.Arrays;

/**
 * Описать класс ArrayPrinter, содержащий 2 метода
 * 1) публичный метод print(int[] array) выводящий массив
 * 2) защищенный метод printElem(int elem) для вывода одного элемента (в базовом классе пуст)
 */
public class ArrayPrinter {

    public void print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
        }
    }

    protected void printElem(int elem) {

    }
}
