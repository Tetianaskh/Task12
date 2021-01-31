package com.company.printer;

import com.company.arrays.Arrays;

public class SecondArrayPrinter extends ArrayPrinter{
    private final Arrays arrays = new Arrays();

    @Override
    protected void printElem(int elem) {
        System.out.println("{" + arrays.getArraysTwo() + "}");
    }
}
