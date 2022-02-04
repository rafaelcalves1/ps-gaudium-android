package br.com.gaudium.entrega.Request;

import br.com.gaudium.entrega.model.UsuarioObj;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiClient {

    @GET("ps/perfil.php")
    Call<ResponseBody> getUser();


}
