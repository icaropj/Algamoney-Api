package br.com.icaropinho.algamoney.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.icaropinho.algamoney.api.model.Pessoa;
import br.com.icaropinho.algamoney.api.repositorio.PessoaRepositorio;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepositorio pessoaRepositorio;
	
	public Pessoa atualizar(Pessoa pessoa, Long codigo) {
		Pessoa pessoaSalva = buscarPeloCodigo(codigo);
		BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
		return pessoaRepositorio.save(pessoaSalva);
	}

	public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {
		Pessoa pessoaSalva = buscarPeloCodigo(codigo);
		pessoaSalva.setAtivo(ativo);
		pessoaRepositorio.save(pessoaSalva);
	}
	
	public Pessoa buscarPeloCodigo(Long codigo) {
		Pessoa pessoaSalva = pessoaRepositorio.findOne(codigo);
		if(pessoaSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return pessoaSalva;
	}
	
}
