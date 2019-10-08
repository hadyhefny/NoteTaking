package com.example.hodhod.notes.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampUtil {

    public static String getCurrentTimestamp() {

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-yyyy");
            String currentDate = dateFormat.format(new Date());
            return currentDate;
        } catch (Exception e) {
            return null;
        }
    }

}
