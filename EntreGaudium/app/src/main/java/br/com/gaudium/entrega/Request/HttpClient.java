package br.com.gaudium.entrega.Request;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpClient {

    public static final String BASE_URL = "https://dbgapi-desenv.taximachine.com.br/";
    private static Retrofit retrofit = null;

    public static Retrofit getData() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
