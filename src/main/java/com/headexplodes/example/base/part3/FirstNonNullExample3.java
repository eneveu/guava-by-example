package com.headexplodes.example.base.part3;

import com.google.common.base.Objects;

public class FirstNonNullExample3 {

    private static final String UNKNOWN_GPS_COORDINATES = "";

    public String getCoordinatesAsText() {
        return Objects.firstNonNull(getGpsCoordinates(),
                                    UNKNOWN_GPS_COORDINATES);
    }

    public String getGpsCoordinates() {
        return null;  // TODO ...
    }


}
