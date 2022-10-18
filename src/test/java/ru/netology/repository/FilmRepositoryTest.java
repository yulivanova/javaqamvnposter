package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

public class FilmRepositoryTest {

    FilmItem film1 = new FilmItem(1, 11, "Бладшот");
    FilmItem film2 = new FilmItem(2, 22, "Вперед");
    FilmItem film3 = new FilmItem(3, 33, "Отель Белград");
    FilmItem film4 = new FilmItem(4, 44, "Джентельмены");
    FilmItem film5 = new FilmItem(5, 55, "Человек-неведимка");
    FilmItem film6 = new FilmItem(6, 66, "Тролли.Мировой тур");
    FilmItem film7 = new FilmItem(7, 77, "Номер один");
    FilmItem film8 = new FilmItem(8, 88, "Бой с тенью");
    FilmItem film9 = new FilmItem(9, 99, "Море");
    FilmItem film10 = new FilmItem(10, 100, "Пианист");
    FilmItem film11 = new FilmItem(11, 111, "<Большой Куш>");

    @Test
    public void shouldFindAll() {
        FilmRepository repo = new FilmRepository();

        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);
        repo.findAll();

        FilmItem[] actual = repo.findAll();
        FilmItem[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldSave() {
        FilmRepository repo = new FilmRepository();

        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);

        FilmItem[] actual = repo.findAll();
        FilmItem[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindById() {
        FilmRepository repo = new FilmRepository();

        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);
        repo.findById(film3.getId());

        FilmItem actual = repo.findById(film3.getId());
        FilmItem expected = film3;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNullFindById() {
        FilmRepository repo = new FilmRepository();

        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);
        repo.findById(12);

        FilmItem actual = repo.findById(12);
        FilmItem expected = null;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldRemoveById() {
        FilmRepository repo = new FilmRepository();

        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);
        repo.removeById(film3.getId());

        FilmItem[] actual = repo.findAll();
        FilmItem[] expected = {film1, film2, film4, film5, film6, film7, film8, film9, film10, film11};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldRemoveAll() {
        FilmRepository repo = new FilmRepository();

        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);
        repo.removeAll();

        FilmItem[] actual = repo.findAll();
        FilmItem[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }
}



