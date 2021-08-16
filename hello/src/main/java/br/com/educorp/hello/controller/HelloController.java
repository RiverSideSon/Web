package br.com.educorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.educorp.hello.model.Produto;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World em Spring Boot!! É Nóis!";
	}

	@PostMapping("/novoproduto")
	public String cadastrarProduto (@RequestBody Produto novo) {
		System.out.println("Produto: "+novo.getId()+"/"+novo.getDescricao()+"/"+novo.getPreco());
		return "ok";
	}
	
}
