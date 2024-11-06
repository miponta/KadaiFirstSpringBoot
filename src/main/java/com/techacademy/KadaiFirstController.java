package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/{date}")
    public String disDayOfWeek(@PathVariable String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(4,6));
        int day = Integer.parseInt(date.substring(6,8));

        LocalDate localdate = LocalDate.of(year, month, day);
        DayOfWeek dayofweek = localdate.getDayOfWeek();
        String formattedDay = dayofweek.getDisplayName(TextStyle.FULL,Locale.ENGLISH);

        return formattedDay;
    }

    @GetMapping("/plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public int calcMinus(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public int calcTimes(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public int calcDivide(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return res;
    }
}
