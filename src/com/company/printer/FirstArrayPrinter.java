package com.company.printer;

import com.company.arrays.Arrays;

public class FirstArrayPrinter extends ArrayPrinter {
    private final Arrays arrays = new Arrays();

    @Override
    protected void printElem(int elem) {
        System.out.println("[" + arrays.getArraysOne() + "]");
    }
}
