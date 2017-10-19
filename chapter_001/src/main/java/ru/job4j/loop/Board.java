package ru.job4j.loop;

public class Board {

    public String paint(int width, int height) {
        int startWidth;
        int startHeight;
        StringBuilder strBuilder = new StringBuilder();
        String rsl;
        for (startHeight = 1; startHeight <= height; startHeight++) {
            if (startHeight % 2 != 0) {
                for (startWidth = 1; startWidth <= width; startWidth++) {
                    if (startWidth % 2 != 0) {
                        strBuilder.append("x");
                    } else strBuilder.append(" ");
                }
            } else for (startWidth = 1; startWidth <= width; startWidth++) {
                if (startWidth % 2 == 0) {
                    strBuilder.append("x");
                } else strBuilder.append(" ");
            }
            if (startWidth > width) {
                strBuilder.append(System.getProperty("line.separator"));
            }

        }rsl = strBuilder.toString();
        return rsl;
    }
}