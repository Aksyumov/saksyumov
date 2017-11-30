package ru.job4j.array;

public class ArrayToArray {
    public int[] arrayPlusArray(int[] first, int[] second) {
        int [] result = new int[first.length + second.length];
        int firstIndex = 0;
        int secondIndex = 0;
        for(int i=0; i < result.length; i++) {
            if(firstIndex >= first.length){
                result[i] = second[secondIndex];
                secondIndex ++;
            }else if(secondIndex >= second.length){
                result[i] = first[firstIndex];
                firstIndex ++;
            }else if( first[firstIndex]<second[secondIndex]){
                result[i] = first[firstIndex];
                firstIndex ++;
            }else{
                result[i] = second[secondIndex];
                secondIndex ++;
            }

    } return result;
}
}