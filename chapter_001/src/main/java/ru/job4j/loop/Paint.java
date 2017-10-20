package ru.job4j.loop;

public class Paint {

    public static String piramid(int height) {
        int startHeight;
        int startWidth;
        int doubleHeight = height * 2;
        int num = 0;
        StringBuilder strBuilder = new StringBuilder();
        String rsl;
        for (startHeight = 0; startHeight < height; startHeight++) {
            for (startWidth = 1; startWidth < doubleHeight; startWidth++) {
                if ((startWidth >= height - startHeight) && (startWidth <= height + startHeight))
                    strBuilder.append("^");
                else
                    strBuilder.append(" ");
            }num++;
            if (num != height)
                strBuilder.append(System.getProperty("line.separator"));
        }
        rsl = strBuilder.toString();
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(piramid(1));
        System.out.println(piramid(2));
        System.out.println(piramid(3));
        System.out.println(piramid(4));
    }
}
