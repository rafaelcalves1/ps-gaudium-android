package br.com.gaudium.entrega.model;

public interface ModelPerfilInterface {

    interface OnFinishListernner{
        void onFinished(UsuarioObj usuarioObj);

        void onFailure(Throwable t);
    }

    interface View{
        void onResponseFailure (Throwable throwable);

        void onSucess(UsuarioObj usuario);
    }

    void getDataUser(OnFinishListernner onFinishListernner);


}
