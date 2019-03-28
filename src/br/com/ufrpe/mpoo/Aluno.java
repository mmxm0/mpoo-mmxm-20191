package br.com.ufrpe.mpoo;

public class Aluno extends Pessoa{
		private int anoEntrada;
		private int periodoEntrada;
		
		
		public int getAnoEntrada() {
			return anoEntrada;
		}
		public void setAnoEntrada(int anoEntrada) {
			this.anoEntrada = anoEntrada;
		}
		public int getPeriodoEntrada() {
			return periodoEntrada;
		}
		public void setPeriodoEntrada(int preiodoEntrada) {
			this.periodoEntrada = preiodoEntrada;
		}
		public void helloWorld() {
			System.out.println("Olá eu sou um aluno!");
		}
		
		
}
