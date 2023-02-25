package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFilmsTest {
    @Test
    public void addSeveralFilms() {


        ManagerFilms manager = new ManagerFilms();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
    }

    @Test
    public void addOneFilm() {


        ManagerFilms manager = new ManagerFilms();

        manager.addFilm("Film 4");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4"};
        String[] actual = manager.findAll();
    }

    @Test
    public void replayAddFilm() {


        ManagerFilms manager = new ManagerFilms();

        manager.addFilm("Film 2");


        String[] expected = {"Film 1", "Film 2", "Film 2", "Film 3", "Film 4"};
        String[] actual = manager.findAll();

    }

    @Test
    public void minlimitFilms() {
        ManagerFilms manager = new ManagerFilms();
        int resultLength = 3;

        int expected = 3;
        String[] actual = manager.findLast();


    }

    @Test
    public void maxlimitFilms() {
        ManagerFilms manager = new ManagerFilms();
        int resultLength = 12;

        int expected = 10;
        String[] actual = manager.findLast();
    }

    @Test
    public void limitFilms() {
        ManagerFilms manager = new ManagerFilms();
        int resultLength = 10;

        int expected = 10;
        String[] actual = manager.findLast();


    }
}