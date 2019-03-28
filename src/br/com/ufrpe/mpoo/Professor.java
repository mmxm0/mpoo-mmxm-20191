package br.com.ufrpe.mpoo;

import java.util.Date;

public class Professor extends Pessoa {
	private Date dataAdmissao;

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public void helloWorld() {
		System.out.println("Olá eu sou um professor!");
	}
	
}
