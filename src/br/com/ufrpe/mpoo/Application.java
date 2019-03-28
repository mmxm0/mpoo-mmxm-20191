package br.com.ufrpe.mpoo;

public class Application {

	public static void main(String[] args) {
		Pessoa p1 = new Aluno();
		Pessoa p2 = new Professor();
		
		p1.setCpf("1111111111111-111");
		p1.setNome("Marta");
		p1.helloWorld();
		p2.helloWorld();
		
	}

}
