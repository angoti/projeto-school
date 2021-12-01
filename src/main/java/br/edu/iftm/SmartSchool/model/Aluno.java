package br.edu.iftm.SmartSchool.model;

import org.springframework.format.annotation.DateTimeFormat;

public class Aluno {
    private int matricula;
    private String nome_mae;
    private String nome_pai;
    @DateTimeFormat (pattern="dd/MM/yyyy")
    private String data_matricula;   
    private int tel_responsavel;
    private String login;
    private Usuario usuario;

    public Aluno(int matricula, String nome_mae, String nome_pai, String data_matricula, int tel_responsavel, String login, Usuario usuario) {
        this.matricula = matricula;
        this.nome_mae = nome_mae;
        this.nome_pai = nome_pai;
        this.data_matricula = data_matricula;
        this.tel_responsavel = tel_responsavel;
        this.login = login;
        this.usuario = usuario;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome_mae() {
        return this.nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public String getNome_pai() {
        return this.nome_pai;
    }

    public void setNome_pai(String nome_pai) {
        this.nome_pai = nome_pai;
    }

    public String getData_matricula() {
        return this.data_matricula;
    }

    public void setData_matricula(String data_matricula) {
        this.data_matricula = data_matricula;
    }

    public int getTel_responsavel() {
        return this.tel_responsavel;
    }

    public void setTel_responsavel(int tel_responsavel) {
        this.tel_responsavel = tel_responsavel;
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
}
