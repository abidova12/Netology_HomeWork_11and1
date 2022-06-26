package ru.netology.domain;

public class FilmManager {
    private Register[] cinemas = new Register[0];

    private int resultLength;

    public FilmManager() {
        resultLength = 10;
    }

    public FilmManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public void add(Register cinema) {
        int length = cinemas.length + 1;
        Register[] tmp = new Register[length];
        System.arraycopy(cinemas, 0, tmp, 0, cinemas.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = cinema;
        cinemas = tmp;
    }

    public Register[] findAll() {
        return cinemas;
    }

    public Register[] findLast() {
        Register[] result;
        if (resultLength < cinemas.length) {
            result = new Register[resultLength];
        } else {
            result = new Register[cinemas.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = cinemas.length - i - 1;
            result[i] = cinemas[index];
        }
        return result;
    }
}