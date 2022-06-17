package ru.netology.JavaRadio;


public class Radio {

    private int currentStation;
    private int currentVolume;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation >= 9) {
            setCurrentStation(0);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (currentStation <= 0) {
            setCurrentStation(9);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0 || currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
