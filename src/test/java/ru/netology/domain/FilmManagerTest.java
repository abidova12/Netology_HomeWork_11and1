package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    Register first = new Register("Бладшот");
    Register second = new Register("Вперед");
    Register third = new Register("Отель 'Белград'");
    Register fourth = new Register("Джентельмены");
    Register fifth = new Register("Человек-невидимка");
    Register sixth = new Register("Тролли");
    Register seventh = new Register("Номер один");
    Register eighth = new Register("Ночь");
    Register ninth = new Register("День");
    Register tenth = new Register("Маска");
    Register eleventh = new Register("Воскресение");
    Register twelfth = new Register("Человек-паук");


    @Test
    public void findLastDefined() {
        FilmManager manager = new FilmManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

        Register[] actual = manager.findLast();
        Register[] expected = {twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLastLessTen() {
        FilmManager manager = new FilmManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);


        Register[] actual = manager.findLast();
        Register[] expected = {ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastCinemaIntentionally() {

        FilmManager manager = new FilmManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

        Register[] actual = manager.findLast();
        Register[] expected = {twelfth, eleventh, tenth, ninth, eighth};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCreate() {
        Register reg = new Register();
        reg.getName();
    }

}

