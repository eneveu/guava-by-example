package com.headexplodes.example.base.part3;

import com.google.common.base.Objects;

public class FirstNonNullExample3 {

    private static final String UNKNOWN_COORDINATES = "Unknown coordinates";

    public String getCoordinatesAsText() {
        return Objects.firstNonNull(getGpsCoordinates(), UNKNOWN_COORDINATES);
    }

    public String getGpsCoordinates() {
        // retrieve GPS coordinates from satellite
        return null;
    }


}
