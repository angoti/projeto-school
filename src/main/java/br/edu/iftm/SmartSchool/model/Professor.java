package br.edu.iftm.SmartSchool.model;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int cod_professor;
    private String login;
    private Usuario usuario;
    private List<Aluno> ListaAlunos;

    public Professor(int cod_professor, String login, Usuario usuario) {
        this.cod_professor = cod_professor;
        this.login = login;
        this.usuario = usuario;
        this.ListaAlunos = new ArrayList<Aluno>();
    }


    public int getCod_professor() {
        return this.cod_professor;
    }

    public void setCod_professor(int cod_professor) {
        this.cod_professor = cod_professor;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Aluno> getListaAlunos() {
        return this.ListaAlunos;
    }

    public void setListaAlunos(List<Aluno> ListaAlunos) {
        this.ListaAlunos = ListaAlunos;
    }
    
}
