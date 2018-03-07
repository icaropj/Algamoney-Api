package br.com.icaropinho.algamoney.api.resource;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.icaropinho.algamoney.api.model.Categoria;
import br.com.icaropinho.algamoney.api.repositorio.CategoriaRepositorio;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaRepositorio categoriaRepositorio;
	
	@GetMapping
	public List<Categoria> listar() {
		return categoriaRepositorio.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Categoria> criar(@RequestBody @Valid Categoria categoria) {
		Categoria categoriaSalva = categoriaRepositorio.save(categoria);
		URI uri = ServletUriComponentsBuilder
			.fromCurrentRequestUri()
			.path("/{codigo}")
			.buildAndExpand(categoriaSalva.getCodigo())
			.toUri();
		
		return ResponseEntity.created(uri).body(categoriaSalva);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<?> buscarPeloCodigo(@PathVariable("codigo") Long codigo) {
		Categoria categoria = categoriaRepositorio.findOne(codigo);
		return categoria != null ? ResponseEntity.ok(categoria) : ResponseEntity.notFound().build();
	}
	
}
