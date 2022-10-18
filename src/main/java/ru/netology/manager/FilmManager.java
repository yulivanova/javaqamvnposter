package ru.netology.manager;

import ru.netology.domain.FilmItem;
import ru.netology.repository.FilmRepository;

public class FilmManager {
    private final FilmRepository repo;

    public FilmManager(FilmRepository repo) {
        this.repo = repo;
    }

    public void add(FilmItem item) {
        repo.save(item);
    }

    public FilmItem[] getAll() {
        FilmItem[] items = repo.findAll();
        FilmItem[] result = new FilmItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public void removeById(int id) {
        repo.removeById(id);
    }
}


