package ru.job4j.array;

/**
 * Программа по поиску одной строки в другой
 * @author Aksyumov Sergey (aksyumov@yandex.ru)
 * @version 0.1
 * @since 16.11.2017
 */
public class StringToArray {
    public boolean contains(String origin, String sub){
        char[] originArray = origin.toCharArray();
        char[] subArray = sub.toCharArray();
        boolean result = true;
        for (int originIndex = 0; originIndex < originArray.length; originIndex++){
            for (int subIndex = 0; subIndex < subArray.length; subIndex++){
                if (originArray[originIndex] != subArray[subIndex]) {
                    result = false;
                    break;
                } else {
                    result = true;
                    originIndex++;
                }
            }
            if (result){
                break;
            }
        } return result;
    }

}
