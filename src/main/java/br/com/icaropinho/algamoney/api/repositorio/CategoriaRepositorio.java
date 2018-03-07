package br.com.icaropinho.algamoney.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.icaropinho.algamoney.api.model.Categoria;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Long>{

}
