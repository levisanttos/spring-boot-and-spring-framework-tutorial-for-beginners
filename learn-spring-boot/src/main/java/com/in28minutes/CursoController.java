package com.in28minutes;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursoController {

	@GetMapping
	public List<Curso> getCursos() {
		
		return Arrays.asList(
				new Curso(1l, "Aprendendo AWS", "Impacta"),
				new Curso(2l, "Analise e Desenvolvimento de Sistemas", "Fiap")
				);
	}
}
