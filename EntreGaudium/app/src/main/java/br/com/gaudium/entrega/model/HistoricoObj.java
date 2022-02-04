package br.com.gaudium.entrega.model;

import com.google.gson.annotations.SerializedName;

public class HistoricoObj {

    @SerializedName("quando")
    private String quando;
    @SerializedName("valor")
    private Float valor;
    @SerializedName("qtd")
    private int qtd;
    @SerializedName("avaliacao")
    private int avaliacao;

    public HistoricoObj(String quando, Float valor, int qtd, int avaliacao) {
        this.quando = quando;
        this.valor = valor;
        this.qtd = qtd;
        this.avaliacao = avaliacao;
    }

    public String getQuando() {
        return quando;
    }

    public void setQuando(String quando) {
        this.quando = quando;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "HistoricoObj{" +
                "quando='" + quando + '\'' +
                ", valor=" + valor +
                ", qtd=" + qtd +
                ", avaliacao=" + avaliacao +
                '}';
    }
}
