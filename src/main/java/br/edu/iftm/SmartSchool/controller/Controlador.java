package br.edu.iftm.SmartSchool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.iftm.SmartSchool.model.Aluno;
import br.edu.iftm.SmartSchool.repository.AlunoRepository;

@Controller
public class Controlador {

    @Autowired
    AlunoRepository alunoRepository;

    @RequestMapping("/")
    String inicio() {
        return "index";
    }

    @RequestMapping("/login")
    String login() {
        return "login";
    }

    @RequestMapping("/auth")
    String auth() {
        return "loginAuth";
    }

    @RequestMapping("/aluno")
    String aluno() {
        return "pagAluno";
    }

    @RequestMapping("/ajustealuno")
    String ajuste() {
        return "ajuste";
    }

    @RequestMapping("/salas")
    String salas() {
        return "salas";
    }

    @RequestMapping("/respostasala")
    String respostasalas() {
        return "respostaSala";
    }

    @RequestMapping("/manterprofessores")
    String manterprofessores() {
        return "manterProfessores";
    }

    @RequestMapping("/mantersala")
    String mantersala() {
        return "manterSalas";
    }

    @RequestMapping("/cadastrosala")
    String cadastroSala() {
        return "cadastroSala";
    }

    @RequestMapping("/cadastroprofessor")
    String cadastroProfessor() {
        return "cadastroProfessor";
    }

    @RequestMapping("/gerenciamensalidade")
    String gerenciaMensalidade() {
        return "gerenciaMensalidade";
    }

    @GetMapping("lista-todos-alunos")
    String todosAlunos(Model modelo) {
        List<Aluno> lista = alunoRepository.buscaTodosAlunos();
        modelo.addAttribute("alunos", lista);
        return "listaDeAlunos";
    }
}