package br.com.icaropinho.algamoney.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
}
