package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

class FilmManagerTest {

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
    FilmItem film11 = new FilmItem(11, 111, "Адвокат");

    @Test
    void shouldFindAll() {
        FilmManager manager = new FilmManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);

        FilmItem[] actual = manager.findAll();
        FilmItem[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindAll1() {
        FilmManager manager = new FilmManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);

        FilmItem[] actual = manager.findAll();
        FilmItem[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindAll2() {
        FilmManager manager = new FilmManager();

        manager.add(film1);


        FilmItem[] actual = manager.findAll();
        FilmItem[] expected = {film1};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindAll3() {
        FilmManager manager = new FilmManager();

        FilmItem[] actual = manager.findAll();
        FilmItem[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldGetAll() {
    }

    @Test
    void shouldFindLast() {
        FilmManager manager = new FilmManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        FilmItem[] actual = manager.findLast();
        FilmItem[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindLast1() {
        FilmManager manager = new FilmManager();

        manager.add(film5);

        FilmItem[] actual = manager.findLast();
        FilmItem[] expected = {film5};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindLast3() {
        FilmManager manager = new FilmManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);


        FilmItem[] actual = manager.findLast();
        FilmItem[] expected = {film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindLast4() {
        FilmManager manager = new FilmManager();

        FilmItem[] actual = manager.findLast();
        FilmItem[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindLast5() {
        FilmManager manager = new FilmManager(5);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);

        FilmItem[] actual = manager.findLast();
        FilmItem[] expected = {film10, film9, film8, film7, film6};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindLast6() {
        FilmManager manager = new FilmManager(10);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        FilmItem[] actual = manager.findLast();
        FilmItem[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindLast7() {
        FilmManager manager = new FilmManager(12);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        FilmItem[] actual = manager.findLast();
        FilmItem[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(actual, expected);
    }
}