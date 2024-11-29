package com.projectdevs.barber.Controller;

import com.projectdevs.barber.DTO.AtualizaCadastro;
import com.projectdevs.barber.DTO.CadastroDeUsuarioDto;
import com.projectdevs.barber.DTO.DetalhamentoCadastro;
import com.projectdevs.barber.Entity.CadastroUsuario;
import com.projectdevs.barber.Repository.CadastroUsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/servicos")
public class CadastroUsuariosController {

	CadastroUsuario cadastroUsuario;

	@Autowired
	public CadastroUsuarioRepository repository;

	@PostMapping("/cadastro")
	@Transactional
	public ResponseEntity cadastraUsuario(@RequestBody @Valid CadastroDeUsuarioDto cadastroDeUsuarioDto, UriComponentsBuilder uriComponentsBuilder) {
		var cadastra = repository.save(new CadastroUsuario(cadastroDeUsuarioDto));
		var uri = uriComponentsBuilder.path("servicos/cadastro/{id}").buildAndExpand(cadastra.getId()).toUri();
		return ResponseEntity.created(uri).body(new DetalhamentoCadastro(cadastra));
	}

	@PutMapping("/atualiza")
	@Transactional
	public ResponseEntity atualizaCadastro(@RequestBody @Valid AtualizaCadastro atualizaCadastro) {
		var usuario = repository.getReferenceById(atualizaCadastro.id());
		usuario.atualizaCadastro(atualizaCadastro);
		return ResponseEntity.noContent().build();
	}

}
