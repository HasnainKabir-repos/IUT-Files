package com.HasnainKabir.Race;

import com.HasnainKabir.Track.Track;

public class Sprint extends Race{
    @Override
    protected void startLine(Track track) {
        System.out.println("Sprint race start line at ");
        track.trackInfo();
    }

    @Override
    protected void finishLine(Track track) {
        System.out.println("Sprint race finish line at ");
        track.trackInfo();
    }
}
