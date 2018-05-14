package com.android.jhotel_android_luthfi;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Luthfi Musthafa on 5/6/2018.
 */

public class PesananBatalRequest extends StringRequest {
    private static final String PesananBatal_URL = "http://192.168.1.101:8080/cancelpesanan";
    private Map<String, String> params;

    public PesananBatalRequest(String id_pesanan, Response.Listener<String> listener) {
        super(Method.POST, PesananBatal_URL, listener, null);
        params = new HashMap<>();
        params.put("id_pesanan",id_pesanan);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
