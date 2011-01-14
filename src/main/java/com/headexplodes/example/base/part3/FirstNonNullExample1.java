package com.headexplodes.example.base.part3;

public class FirstNonNullExample1 {

    private static final String UNKNOWN_GPS_COORDINATES = "";

    public String getCoordinatesAsText() {
        return getGpsCoordinates() != null ? getGpsCoordinates() : UNKNOWN_GPS_COORDINATES;
    }

    public String getGpsCoordinates() {
        return null;  //
    }


}
