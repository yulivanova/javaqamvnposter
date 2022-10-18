package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.repository.FilmRepository;
import ru.netology.domain.FilmItem;

import static org.mockito.Mockito.*;

class FilmManagerTest {

    FilmRepository repo = Mockito.mock(FilmRepository.class);
    FilmManager manager = new FilmManager(repo);

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

    @BeforeEach
    public void setUp() {
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
    }

    @Test
    public void shouldLastRemove() {

        FilmItem[] items = new FilmItem[]{film1, film2, film4, film5, film6, film7, film8, film9, film10, film11};

        manager.removeById(film3.getId());

        doReturn(items).when(repo).findAll();
        doNothing().when(repo).removeById(film3.getId());

        FilmItem[] expected = new FilmItem[]{film11, film10, film9, film8, film7, film6, film5, film4, film2, film1};
        FilmItem[] actual = manager.getAll();
        Assertions.assertArrayEquals(expected, actual);

        verify(repo).removeById(film3.getId());
    }
}


