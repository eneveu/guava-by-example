package com.headexplodes.example.base.part3;

public class FirstNonNullExample1 {

    private static final String UNKNOWN_COORDINATES = "Unknown coordinates";

    public String getCoordinatesAsText() {
        return getGpsCoordinates() != null ? getGpsCoordinates() : UNKNOWN_COORDINATES;
    }

    public String getGpsCoordinates() {
        // retrieve GPS coordinates from satellite
        return null;
    }


}
