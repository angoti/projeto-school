package br.edu.iftm.SmartSchool.model;

public class Secretaria {
    private int cod_secretaria;
    private String login;
    private Usuario usuario;

    public Secretaria(int cod_secretaria, String login, Usuario usuario) {
        this.cod_secretaria = cod_secretaria;
        this.login = login;
        this.usuario = usuario;
    }

    public int getCod_secretaria() {
        return this.cod_secretaria;
    }

    public void setCod_secretaria(int cod_secretaria) {
        this.cod_secretaria = cod_secretaria;
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
