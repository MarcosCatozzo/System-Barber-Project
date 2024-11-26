package com.projectdevs.barber.Controller;

import com.projectdevs.barber.DTO.CadastroDeUsuarioDto;
import com.projectdevs.barber.Entity.CadastroUsuario;
import com.projectdevs.barber.Repository.CadastroUsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro")
public class CadastroUsuariosController {

	@Autowired
	public CadastroUsuarioRepository repository;

	@PostMapping
	@Transactional
	public ResponseEntity cadastraUsuario(@RequestBody @Valid CadastroDeUsuarioDto cadastroDeUsuarioDto){
		var cadastra = repository.save(new CadastroUsuario(cadastroDeUsuarioDto));
		return ResponseEntity.ok().build();
	}
}
