package com.who.app;

import java.util.HashMap;
import java.util.Map;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class HomePage implements Handler {
    public static final String URL = "/";
    private static final String TEMPLATE = ("templates/index.html");

    @Override
    public void handle(Context context) throws Exception {
        Map<String, Object> model = new HashMap<>();

        model.put("data", JDBCConnection.getCountries());

        context.render(TEMPLATE, model);
    }
}