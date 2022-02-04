package br.com.gaudium.entrega.model;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import br.com.gaudium.entrega.Request.ApiClient;
import br.com.gaudium.entrega.Request.HttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ModelPerfil implements ModelPerfilInterface {

    private final String TAG = "PerfilPresenter";

    @Override
    public void getDataUser(OnFinishListernner onFinishListernner) {
        ApiClient apiService = HttpClient.getData().create(ApiClient.class);
        Call<ResponseBody> call = apiService.getUser();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                UsuarioObj usuarioObj = new UsuarioObj();
                if (response.code() == 200) {
                    try {
                        assert response.body() != null;
                        JSONObject dataArray = new JSONObject(response.body().string());
                        usuarioObj.setNome(dataArray.getJSONObject("response").getString("nome"));
                        usuarioObj.setCargo(dataArray.getJSONObject("response").getString("cargo"));
                        usuarioObj.setDescricao(dataArray.getJSONObject("response").getString("descricao"));
                        usuarioObj.setHistorico(dataArray.getJSONObject("response").getJSONArray("historico"));
                    } catch (IOException | JSONException e) {
                        e.printStackTrace();
                    }
                }
                onFinishListernner.onFinished(usuarioObj);
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, t.toString());
                onFinishListernner.onFailure(t);
            }
        });

    }
}
