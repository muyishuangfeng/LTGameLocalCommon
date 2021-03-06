package com.gnetop.ltgamecommon.net;


import com.gnetop.ltgamecommon.net.retrofit.BaseApiImpl;

public class Api extends BaseApiImpl {

    private static final String BASE_URL = "http://login.gdpgold.com";

    private static Api api = new Api(BASE_URL);

    private Api(String baseUrl) {
        super(baseUrl);
    }

    public static RetrofitService getInstance() {
        return api.getRetrofit().create(RetrofitService.class);
    }


}
