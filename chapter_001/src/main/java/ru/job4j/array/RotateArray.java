package ru.job4j.array;

public class RotateArray {
    public int[][] rotate(int[][] array) {
        int [][] tempArray = new int[array[0].length][array.length];
        int tempArrayX = 0;
        int tempArrayY = array.length - 1;
        for (int [] arrayX : array){
            for (int arrayY  : arrayX)
                tempArray[tempArrayX++][tempArrayY] = arrayY ;
            tempArrayX = 0;
            tempArrayY--;
        }
        return tempArray;
    }
}