package ru.netology.manager;

import ru.netology.domain.FilmItem;

public class FilmManager {
    private FilmItem[] items = new FilmItem[0];
    private int limit;

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public FilmManager() {
        this.limit = 10;
    }

    public void add(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmItem[] findAll() {

        return items;
    }

    public FilmItem[] findLast() {
        FilmItem[] items = findAll();
        FilmItem[] result;
        if (limit < items.length) {
            result = new FilmItem[limit];
        } else {
            result = new FilmItem[items.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}