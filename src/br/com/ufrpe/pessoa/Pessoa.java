package br.com.ufrpe.pessoa;

import java.util.Date;

public class Pessoa implements Aluno, Professor{
	private String nome;
	private String cpf;
	private Date dataAdmissao;
	private int anoEntrada;
	private int periodoEntrada;
	

	@Override
	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
		
	}

	@Override
	public int getAnoEntrada() {
		return this.anoEntrada;
	}

	@Override
	public void setPeriodoEntrada(int periodoEntrada) {
		this.periodoEntrada = periodoEntrada;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int getPeriodoEntrada() {
		
		return this.periodoEntrada;
	}

	@Override
	public void setDataAdmissao(Date data) {
		this.dataAdmissao = data;
	}

	@Override
	public Date getDataAdmissao() {
		return this.dataAdmissao;
	}
	
}
