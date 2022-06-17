package ru.netology.JavaRadio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio radioman = new Radio();

    @Test
    void shouldChangeStation() {
        Assertions.assertEquals(0, radioman.getCurrentStation());
        radioman.setCurrentStation(5);
        Assertions.assertEquals(5, radioman.getCurrentStation());
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
        radioman.setCurrentStation(6);
        radioman.nextStation();
        Assertions.assertEquals(7, radioman.getCurrentStation());
    }

    @Test
    void shouldOverMaxStation1() {
        radioman.setCurrentStation(9);
        radioman.nextStation();
        Assertions.assertEquals(0, radioman.getCurrentStation());
    }

    //@Test
    //void shouldOverMaxStation2() {
     //   radioman.setCurrentStation(10);
     //   radioman.nextStation();
      //  assertEquals(1, radioman.getCurrentStation());
    //}

    @Test
    void shouldPrevStation() {
        radioman.setCurrentStation(4);
        radioman.prevStation();
        Assertions.assertEquals(3, radioman.getCurrentStation());
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
        radioman.setCurrentVolume(10);
        radioman.increaseVolume();
        Assertions.assertEquals(10, radioman.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolume2() {
        radioman.setCurrentVolume(11);
        radioman.increaseVolume();
        Assertions.assertEquals(1, radioman.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radioman.setCurrentVolume(6);
        radioman.decreaseVolume();
        Assertions.assertEquals(5, radioman.getCurrentVolume());
    }

    @Test
    void shouldBeforeMinVolume1() {
        radioman.setCurrentVolume(0);
        radioman.decreaseVolume();
        Assertions.assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    void shouldBeforeinVolume2() {
        radioman.setCurrentVolume(-1);
        radioman.decreaseVolume();
        assertEquals(0, radioman.getCurrentVolume());
    }
}
