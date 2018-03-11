package br.com.icaropinho.algamoney.api.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.icaropinho.algamoney.api.model.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByEmail(String email);
	
}
