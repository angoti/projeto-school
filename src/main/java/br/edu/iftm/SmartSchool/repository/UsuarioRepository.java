package br.edu.iftm.SmartSchool.repository;

import java.lang.annotation.Retention;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.edu.iftm.SmartSchool.model.Usuario;

@Repository
public class UsuarioRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    // public String validaUsuario(Usuario usuario){
    //     String consulta = "INSERT INTO usuario(login, senha) VALUES (?,?)";
    //     return JdbcTemplate.update(consulta, usuario.getLogin(), usuario.getSenha());
    // }
}
