package com.example.caisse.backend;

import com.google.gson.Gson;
/**
 * convert a json from string to object
 */
public class JsonToObjectConvertor {
    Gson gson = new Gson();
    String jsonString  ;

    public JsonToObjectConvertor(String jsonString) {
        this.jsonString = jsonString;
    }

    public ProductFake transform()  {
        ProductFake product = gson.fromJson(jsonString, ProductFake.class) ;
        return product ;
    }
}
