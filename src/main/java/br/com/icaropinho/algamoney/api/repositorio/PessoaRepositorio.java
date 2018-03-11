package br.com.icaropinho.algamoney.api.repositorio;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.icaropinho.algamoney.api.model.Pessoa;

@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {

	public Page<Pessoa> findByNomeContaining(String nome, Pageable pageable);

}
