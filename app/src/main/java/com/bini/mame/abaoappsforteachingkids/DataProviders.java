package com.bini.mame.abaoappsforteachingkids;

/**
 * Created by Mame on 6/9/2016.
 */
public class DataProviders {
    private String number;
    private String points;
    private String date;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public DataProviders(String lakkofsa, String qabxiikee, String guyyoota)
    {
        this.number = lakkofsa;
        this.points = qabxiikee;
        this.date = guyyoota;

    }
}
