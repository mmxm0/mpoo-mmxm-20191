package br.com.mpoo;

import java.text.SimpleDateFormat;

import java.util.Calendar;


public class HelloWorld {
	
	private String nome;
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void imprimir() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdtformat = new SimpleDateFormat("HH:mm:ss");
		
		System.out.println(sdtformat.format(cal.getTime())+" - Olá "+this.nome+". Você acabou de fazer seu primeiro Hello World"
				+ "em Java. Parabéns!");
	}
	

}
