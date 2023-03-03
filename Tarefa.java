package model;

import java.util.*;
import java.util.Collections;

public class Tarefa {

    //ATRIBUTOS
    private String nome;
    private String descricao;
    private String prazo;


    //MÉTODOS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public int compareTo(Tarefa outraTarefa) {
        return this.nome.compareTo(outraTarefa.nome);
    }
}



