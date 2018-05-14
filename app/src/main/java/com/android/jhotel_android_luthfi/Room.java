package com.android.jhotel_android_luthfi;

/**
 * Created by Luthfi Musthafa on 5/3/2018.
 */

public class Room {
    private String roomNumber;
    private String statusKamar;
    private double dailyTariff;
    private String tipeKamar;

    public Room(String roomNumber, String statusKamar, double dailyTariff, String tipeKamar) {
        this.roomNumber = roomNumber;
        this.statusKamar = statusKamar;
        this.dailyTariff = dailyTariff;
        this.tipeKamar = tipeKamar;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getStatusKamar() {
        return statusKamar;
    }

    public double getDailyTariff() {
        return dailyTariff;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setStatusKamar(String statusKamar) {
        this.statusKamar = statusKamar;
    }

    public void setDailyTariff(double dailyTariff) {
        this.dailyTariff = dailyTariff;
    }

    public void setTipeKamar(String tipeKamar) {
        this.tipeKamar = tipeKamar;
    }
}
