package com.headexplodes.example.base.part3;

public class FirstNonNullExample2 {

    private static final String UNKNOWN_COORDINATES = "Unknown coordinates";

    public String getCoordinatesAsText() {
        String gpsCoordinates = getGpsCoordinates();
        return gpsCoordinates != null ? gpsCoordinates : UNKNOWN_COORDINATES;
    }

    public String getGpsCoordinates() {
        // retrieve GPS coordinates from satellite
        return null;
    }


}
