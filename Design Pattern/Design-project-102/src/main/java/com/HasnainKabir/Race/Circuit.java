package com.HasnainKabir.Race;

import com.HasnainKabir.Track.Track;

public class Circuit extends Race{
    @Override
    protected void startLine(Track track) {
        System.out.println("Circuit race start line at ");
        track.trackInfo();
    }

    @Override
    protected void finishLine(Track track) {
        System.out.println("Crossing start line of circuit race at ");
        track.trackInfo();
    }
}
