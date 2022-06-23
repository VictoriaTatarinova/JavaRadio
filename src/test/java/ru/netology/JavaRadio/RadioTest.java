package ru.netology.JavaRadio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radioman = new Radio(10);
    Radio radioman2 = new Radio(20);
    Radio radioman3 = new Radio();

    @Test
    void shouldSetStationNew() {
        radioman2.setCurrentStation(15);
        Assertions.assertEquals(15, radioman2.getCurrentStation());
    }

    @Test
    void shouldChangeStation() {
        radioman.setCurrentStation(5);
        Assertions.assertEquals(5, radioman.getCurrentStation());
    }

    @Test
    void shouldChangeStation2() {
        radioman3.setCurrentStation(5);
        Assertions.assertEquals(5, radioman3.getCurrentStation());
    }

    @Test
    void shouldSetStationUnderMinStation() {

        radioman.setCurrentStation(-1);
        Assertions.assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    void shouldSetStationOverMaxStation() {
        radioman.setCurrentStation(10);
        Assertions.assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    void shouldNextStation() {
        radioman.setCurrentStation(9);
        radioman.nextStation();
        Assertions.assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    void shouldOverMaxStation1() {
        radioman.setCurrentStation(9);
        radioman.nextStation();
        Assertions.assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    void shouldOverMaxStation2() {
        radioman.setCurrentStation(10);
        radioman.nextStation();
        Assertions.assertEquals(1, radioman.getCurrentStation());
    }

    @Test
    void shouldPrevStation() {
        radioman.setCurrentStation(9);
        radioman.prevStation();
        Assertions.assertEquals(8, radioman.getCurrentStation());
    }

    @Test
    void shouldBeforeMinStation1() {
        radioman.setCurrentStation(0);
        radioman.prevStation();
        Assertions.assertEquals(9, radioman.getCurrentStation());
    }

    @Test
    void shouldBeforeMinStation2() {
        radioman.setCurrentStation(-1);
        radioman.prevStation();
        Assertions.assertEquals(9, radioman.getCurrentStation());
    }

    @Test
    void shouldChangeVolume() {
        Assertions.assertEquals(0, radioman.getCurrentVolume());
        radioman.setCurrentVolume(5);
        Assertions.assertEquals(5, radioman.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        radioman.setCurrentVolume(9);
        radioman.increaseVolume();
        Assertions.assertEquals(10, radioman.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolume1() {
        radioman.setCurrentVolume(100);
        radioman.increaseVolume();
        Assertions.assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolume2() {
        radioman.setCurrentVolume(101);
        radioman.increaseVolume();
        Assertions.assertEquals(1, radioman.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radioman.setCurrentVolume(60);
        radioman.decreaseVolume();
        Assertions.assertEquals(59, radioman.getCurrentVolume());
    }

    @Test
    void shouldBeforeMinVolume1() {
        radioman.setCurrentVolume(0);
        radioman.decreaseVolume();
        Assertions.assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    void shouldBeforeMinVolume2() {
        radioman.setCurrentVolume(-1);
        radioman.decreaseVolume();
        assertEquals(0, radioman.getCurrentVolume());
    }
}
