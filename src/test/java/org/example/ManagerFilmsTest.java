package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFilmsTest {
    @Test
    public void addSeveralFilms() {


        ManagerFilms manager = new ManagerFilms();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilms() {


        ManagerFilms manager = new ManagerFilms();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFilms() {
        ManagerFilms manager = new ManagerFilms();
        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");

        String[] expected = {"Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void maxFilms() {
        ManagerFilms manager = new ManagerFilms(10);
        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");

        String[] expected = {"Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }
    @Test
    public void minFilms() {
        ManagerFilms manager = new ManagerFilms(2);
        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");

        String[] expected = {"Film IV", "Film III"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);



    }
    @Test
    public void moreFilms() {
        ManagerFilms manager = new ManagerFilms(15);
        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");

        String[] expected = {"Film IV", "Film III","Film II","Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);



    }


}
















