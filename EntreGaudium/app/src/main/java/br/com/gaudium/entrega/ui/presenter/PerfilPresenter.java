package br.com.gaudium.entrega.ui.presenter;

import br.com.gaudium.entrega.model.ModelPerfil;
import br.com.gaudium.entrega.model.ModelPerfilInterface;
import br.com.gaudium.entrega.model.UsuarioObj;

public class PerfilPresenter implements PerfilPresenterInterface, ModelPerfilInterface.View, ModelPerfilInterface.OnFinishListernner{

    private ModelPerfilInterface.View view;
    private ModelPerfilInterface modelUsu;



    @Override
    public void onDestroy() {
        this.view = null;
    }

    @Override
    public void requestData() {
        modelUsu.getDataUser(this);
    }

    public PerfilPresenter(ModelPerfilInterface.View view) {
        this.view = view;
        this.modelUsu = new ModelPerfil();
    }

    @Override
    public void onFinished(UsuarioObj usuarioObj) {
        view.onSucess(usuarioObj);
    }

    @Override
    public void onFailure(Throwable t) {
        view.onResponseFailure(t);
    }

    @Override
    public void onResponseFailure(Throwable throwable) {
    }

    @Override
    public void onSucess(UsuarioObj usuario) {
    }
}
