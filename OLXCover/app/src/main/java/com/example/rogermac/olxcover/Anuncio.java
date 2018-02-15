package com.example.rogermac.olxcover;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * Created by rogermac on 15/02/18.
 */

@Entity
public class Anuncio {
    @Id
    private long id;
    private String titulo;
    private double valor;
    private String localizacao;

    public Anuncio() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
