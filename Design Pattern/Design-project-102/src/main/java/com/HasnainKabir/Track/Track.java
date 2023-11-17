package com.HasnainKabir.Track;

public abstract class Track {
    public abstract void trackInfo();

    public void startLine() {
        System.out.println("Starting Line of the Track");
    }

    public void finishLine() {
        System.out.println("Finish Line of the Track");
    }
}
