// package br.edu.iftm.SmartSchool.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.config.YamlProcessor.ResolutionMethod;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;

// import br.edu.iftm.SmartSchool.helper.Utils;
// import br.edu.iftm.SmartSchool.model.Aluno;
// import br.edu.iftm.SmartSchool.repository.AlunoRepository;

// @Controller
// public class AdminAtualizaAlunoController {
    
//     @Autowired
//     AlunoRepository repo;

//     @RequestMapping ("/cadastroaluno")
//     String cadastroAluno(Model model){
//         model.addAttribute("aluno", new Aluno());
//         return "cadastroAluno";
//     }

//     @RequestMapping (value = "/cadastroaluno", method = RequestMethod.POST)
//     public String gravarAluno(Aluno aluno, RedirectAttributes ra){
//         System.out.println(aluno.getCpf().length());
//         if(aluno.getCpf().length() != 11){
//             ra.addFlashAttribute("dangermensage", "CPF INVALIDO!");
//         }else {
//             repo.gravaAluno(aluno);
//             ra.addFlashAttribute("sucessmensage", "Aluno cadastrado com sucesso!");
//         }
//         return "redirect:/cadastroaluno";
//     }

//     @RequestMapping (value = "/manteralunos", method = RequestMethod.GET)
// 	public String buscaDadosAluno(@RequestParam(value = "identidadeAluno", required = false) String identidadeAluno, Model model) {
//         Aluno aluno = new Aluno();
//         if(identidadeAluno == null || identidadeAluno.isEmpty()){
//             model.addAttribute("aluno", aluno);
//             return "manterAlunos";
//         }
//         identidadeAluno = identidadeAluno.replace(".", "").replace("-", "");
// 		if(Utils.isLong(identidadeAluno)){
//             if(identidadeAluno.length() < 11 || identidadeAluno.length() > 11){
//                 model.addAttribute("aluno", aluno);
//                 return "manterAlunos";
//             }
//             aluno = repo.buscaPorCpf(identidadeAluno);
//         } else{
//             aluno = repo.buscaPorNome(identidadeAluno);
//         }
//         model.addAttribute("aluno", aluno);
// 		return "manterAlunos";
// 	}

//     @RequestMapping(value = "/manteralunos", method = RequestMethod.POST)
// 	public String atualizarAluno(@RequestParam(value = "cpf", required = true) String cpf, Aluno aluno, Model model) {
// 		Integer result = repo.atualizarAluno(cpf, aluno);
//         System.out.println(result);
//         if(result != null && result > 0){
//             model.addAttribute("sucessmensage", "Aluno atualizado com sucesso!");
//         }
//         model.addAttribute("alunoModel", new Aluno());
// 		return "manterAlunos";
// 	}

// 	@RequestMapping(value = "/manteralunos", method = RequestMethod.DELETE)
// 	public String excluirAluno(@RequestParam(value = "cpf", required = true) String cpf, Model model, RedirectAttributes ra) {
// 		Integer result = repo.excluirAluno(cpf);
//         System.out.println(result);
//         if(result != null && result > 0){
//             ra.addFlashAttribute("sucessmensage", "Aluno excluido com sucesso!");
//         }
// 		return "redirect:/manteralunos";
// 	}
// }
