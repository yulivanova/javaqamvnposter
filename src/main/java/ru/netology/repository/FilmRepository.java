package ru.netology.repository;

import ru.netology.domain.FilmItem;

public class FilmRepository {
    private FilmItem[] items = new FilmItem[0];

    public FilmItem[] findAll() {

        return items;
    }

    public void save(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmItem findById(int id) {
        for (FilmItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void removeById(int id) {
        FilmItem[] tmp = new FilmItem[items.length - 1];
        int index = 0;
        for (FilmItem item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    public void removeAll() {
        items = new FilmItem[0];
    }
}
