package br.com.gaudium.entrega.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.json.JSONArray;

import br.com.gaudium.entrega.R;
import br.com.gaudium.entrega.model.ModelPerfilInterface;
import br.com.gaudium.entrega.model.UsuarioObj;
import br.com.gaudium.entrega.ui.presenter.PerfilPresenter;

public class PerfilUserActivity extends Activity implements ModelPerfilInterface.View {

    private TextView nomePerfil, cargoPerfil, descricaoPerfil, qtdEntregas, saldoTotalPerfil, avaliacaoPerfil;
    private PerfilPresenter perfilPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_entregador);

        nomePerfil = findViewById(R.id.textView_nome_perfil);
        cargoPerfil = findViewById(R.id.textView_cargo_perfil);
        descricaoPerfil = findViewById(R.id.textView_descricao_perfil);
        qtdEntregas = findViewById(R.id.textView_qtd_entregas_perfil);
        saldoTotalPerfil = findViewById(R.id.textView_saldo_perfil);
        avaliacaoPerfil = findViewById(R.id.textView_avaliacao_perfil);

        perfilPresenter = new PerfilPresenter(this);
        perfilPresenter.requestData();
    }

    @Override
    public void onResponseFailure(Throwable throwable) {
        Log.d("ERRO", throwable.getMessage());
    }

    @Override
    public void onSucess(UsuarioObj usuario) {
        nomePerfil.setText(usuario.getNome());
        cargoPerfil.setText(usuario.getCargo());
        descricaoPerfil.setText(usuario.getDescricao());
        JSONArray array = usuario.getHistorico();
    }
}
