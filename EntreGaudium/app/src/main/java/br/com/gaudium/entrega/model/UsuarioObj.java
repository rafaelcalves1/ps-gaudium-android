package br.com.gaudium.entrega.model;

import com.google.gson.JsonArray;
import com.google.gson.annotations.SerializedName;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class UsuarioObj {
    @SerializedName("nome")
    private String nome;
    @SerializedName("cargo")
    private String cargo;
    @SerializedName("descricao")
    private String descricao;
    @SerializedName("historico")
    private JSONArray historico;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public JSONArray getHistorico() {
        return historico;
    }

    public void setHistorico(JSONArray historico) {
        this.historico = historico;
    }

    @Override
    public String toString() {
        return "UsuarioObj{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", historico=" + historico +
                '}';
    }
}

