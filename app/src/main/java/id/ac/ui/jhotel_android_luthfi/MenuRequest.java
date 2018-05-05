package id.ac.ui.jhotel_android_luthfi;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

/**
 * Created by Luthfi Musthafa on 5/3/2018.
 */

public class MenuRequest extends StringRequest {
    private static final String Menu_URL = "http://192.168.1.100:8080/vacantrooms";

    public MenuRequest(Response.Listener<String> listener) {
        super(Method.GET, Menu_URL, listener, null);
    }
}
