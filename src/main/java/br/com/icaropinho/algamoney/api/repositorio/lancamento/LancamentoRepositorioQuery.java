package br.com.icaropinho.algamoney.api.repositorio.lancamento;

import java.util.List;

import br.com.icaropinho.algamoney.api.model.Lancamento;
import br.com.icaropinho.algamoney.api.repositorio.filter.LancamentoFilter;

public interface LancamentoRepositorioQuery {

	public List<Lancamento> filtrar(LancamentoFilter filtro);
	
}
