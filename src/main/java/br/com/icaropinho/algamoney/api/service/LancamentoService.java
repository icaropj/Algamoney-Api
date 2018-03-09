package br.com.icaropinho.algamoney.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.icaropinho.algamoney.api.exception.PessoaInexistenteOuInativaException;
import br.com.icaropinho.algamoney.api.model.Lancamento;
import br.com.icaropinho.algamoney.api.model.Pessoa;
import br.com.icaropinho.algamoney.api.repositorio.LancamentoRepositorio;
import br.com.icaropinho.algamoney.api.repositorio.PessoaRepositorio;

@Service
public class LancamentoService {
	
	@Autowired
	private LancamentoRepositorio lancamentoRepositorio;
	
	@Autowired
	private PessoaRepositorio pessoaRepositorio;
	
	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepositorio.findOne(lancamento.getPessoa().getCodigo());
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		
		return lancamentoRepositorio.save(lancamento);
	}

}
