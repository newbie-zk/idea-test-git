package com.newbie.controller;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String dateStr) {
        Date date = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = dateFormat.parse(dateStr);
        } catch (ParseException e) {
            //e.printStackTrace();
            dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                date = dateFormat.parse(dateStr);
            } catch (ParseException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
        return date;
    }
}
