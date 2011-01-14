package com.headexplodes.example.base.part3;

public class FirstNonNullExample2 {

    private static final String UNKNOWN_GPS_COORDINATES = "";

    public String getCoordinatesAsText() {
        String gpsCoordinates = getGpsCoordinates();
        return gpsCoordinates != null ? gpsCoordinates : UNKNOWN_GPS_COORDINATES;
    }

    public String getGpsCoordinates() {
        return null;  // TODO ...
    }


}
