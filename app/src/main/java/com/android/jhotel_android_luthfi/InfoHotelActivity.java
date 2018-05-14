package com.android.jhotel_android_luthfi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import static com.android.volley.toolbox.Volley.newRequestQueue;

public class InfoHotelActivity extends Activity{
    private ArrayList<Hotel> listHotel = new ArrayList<>();
    private ArrayList<Room> listRoom = new ArrayList<>();

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_hotel_layout);

        /*
        final TextView namaHotel = findViewById(R.id.nama_hotel);
        final TextView lokasiHotel = findViewById(R.id.lokasi);
        final TextView bintangHotel = findViewById(R.id.bintang);
        final TextView nomorKamar1 = findViewById(R.id.nomor_kamar1);
        final TextView statusKamar1 = findViewById(R.id.status_kamar1);
        final TextView dailyTariff1 = findViewById(R.id.daily_tariff1);
        final TextView tipeKamar1 = findViewById(R.id.tipe_kamar1);
        final TextView nomorKamar2 = findViewById(R.id.nomor_kamar2);
        final TextView statusKamar2 = findViewById(R.id.status_kamar2);
        final TextView dailyTariff2 = findViewById(R.id.daily_tariff2);
        final TextView tipeKamar2 = findViewById(R.id.tipe_kamar2);
        final TextView nomorKamar3 = findViewById(R.id.nomor_kamar3);
        final TextView statusKamar3 = findViewById(R.id.status_kamar3);
        final TextView dailyTariff3 = findViewById(R.id.daily_tariff3);
        final TextView tipeKamar3 = findViewById(R.id.tipe_kamar3);


        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONArray jsonResponse = new JSONArray(response);
                    JSONObject hotel = jsonResponse.getJSONObject(0).getJSONObject("hotel");
                    JSONObject lokasi = hotel.getJSONObject("lokasi");
                    Hotel h = new Hotel(hotel.getInt("id"), hotel.getString("nama"),
                            new Lokasi(lokasi.getDouble("x"), lokasi.getDouble("y"), lokasi.getString("deskripsi")),
                            hotel.getInt("bintang"));
                    listHotel.add(h);

                    for (int i = 0; i < jsonResponse.length(); i++) {
                        JSONObject room = jsonResponse.getJSONObject(i);
                        Room room1 = new Room(room.getString("nomorKamar"), room.getString("statusKamar"),
                                room.getDouble("dailyTariff"), room.getString("tipeKamar"));
                        listRoom.add(room1);
                    }
                }catch (JSONException e1) {
                    e1.printStackTrace();
                }
            }
        };
        MenuRequest menuRequest = new MenuRequest(responseListener);
        RequestQueue queue = newRequestQueue(this);
        queue.add(menuRequest);


        Hotel h1 = listHotel.get(0);
        namaHotel.setText(h1.getNama());
        lokasiHotel.setText(h1.getLokasi().getDeskripsi());
        bintangHotel.setText(String.valueOf(h1.getBintang()));

        Room r1 = listRoom.get(0);
        nomorKamar1.setText(r1.getRoomNumber());
        statusKamar1.setText(r1.getStatusKamar());
        dailyTariff1.setText(String.valueOf(r1.getDailyTariff()));
        tipeKamar1.setText(r1.getTipeKamar());

        Room r2 = listRoom.get(0);
        nomorKamar2.setText(r2.getRoomNumber());
        statusKamar2.setText(r2.getStatusKamar());
        dailyTariff2.setText(String.valueOf(r2.getDailyTariff()));
        tipeKamar2.setText(r2.getTipeKamar());

        Room r3 = listRoom.get(0);
        nomorKamar3.setText(r3.getRoomNumber());
        statusKamar3.setText(r3.getStatusKamar());
        dailyTariff3.setText(String.valueOf(r3.getDailyTariff()));
        tipeKamar3.setText(r3.getTipeKamar());
        */
    }
}
