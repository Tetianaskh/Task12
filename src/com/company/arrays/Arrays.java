package com.company.arrays;

public class Arrays {
    private int[] arraysOne = getRandomArray(15);
    private int[] arraysTwo = getRandomArray(10);
    private int[] arraysThree = getRandomArray(20);

    public int[] getRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        return array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arrays arrays = (Arrays) o;
        return java.util.Arrays.equals(arraysOne, arrays.arraysOne) && java.util.Arrays.equals(arraysTwo, arrays.arraysTwo) && java.util.Arrays.equals(arraysThree, arrays.arraysThree);
    }

    @Override
    public int hashCode() {
        int result = java.util.Arrays.hashCode(arraysOne);
        result = 31 * result + java.util.Arrays.hashCode(arraysTwo);
        result = 31 * result + java.util.Arrays.hashCode(arraysThree);
        return result;
    }

    public int[] getArraysOne() {
        return arraysOne;
    }

    public void setArraysOne(int[] arraysOne) {
        this.arraysOne = arraysOne;
    }

    public int[] getArraysTwo() {
        return arraysTwo;
    }

    public void setArraysTwo(int[] arraysTwo) {
        this.arraysTwo = arraysTwo;
    }

    public int[] getArraysThree() {
        return arraysThree;
    }

    public void setArraysThree(int[] arraysThree) {
        this.arraysThree = arraysThree;
    }
}
