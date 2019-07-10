package org.dimigo.oop2;

public class MediaPlayer {
    private int volum;
    private static MediaPlayer instance = new MediaPlayer();

    private MediaPlayer() {

    }

    public static MediaPlayer getInstance() {
        return instance;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }
}
