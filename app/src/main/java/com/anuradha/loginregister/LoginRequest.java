package com.anuradha.loginregister;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by anuomharini on 11/21/16.
 */

public class LoginRequest extends StringRequest {
//    private static final String LOGIN_REQUEST_URL = "http://tonikamitv.hostei.com/Login.php";
    private static final String LOGIN_REQUEST_URL = "http://anoowebhost.000webhostapp.com/Login.php";
    private Map<String, String> params;

    LoginRequest(String username, String password, Response.Listener<String> listener) {
        super(Method.POST, LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
