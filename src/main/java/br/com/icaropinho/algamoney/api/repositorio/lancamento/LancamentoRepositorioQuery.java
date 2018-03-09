package br.com.icaropinho.algamoney.api.repositorio.lancamento;
	
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.icaropinho.algamoney.api.model.Lancamento;
import br.com.icaropinho.algamoney.api.repositorio.filter.LancamentoFilter;

public interface LancamentoRepositorioQuery {

	public Page<Lancamento> filtrar(LancamentoFilter filtro, Pageable pageable);
	
}
