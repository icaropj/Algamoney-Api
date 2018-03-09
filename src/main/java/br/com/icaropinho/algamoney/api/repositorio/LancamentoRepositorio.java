package br.com.icaropinho.algamoney.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.icaropinho.algamoney.api.model.Lancamento;
import br.com.icaropinho.algamoney.api.repositorio.lancamento.LancamentoRepositorioQuery;

@Repository
public interface LancamentoRepositorio extends JpaRepository<Lancamento, Long>, LancamentoRepositorioQuery{

}
