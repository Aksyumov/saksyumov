package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array){
        for (int x = array.length - 1; x > 0; x--){
            for (int y = 0; y < x; y++){
                if (array[y] > array [y + 1]){
                    int temp = array[y];
                    array[y] = array [y + 1];
                    array[y + 1] = temp;
                }
            }
        }return array;
    }
}
