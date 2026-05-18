package pacote10;

public class Principal {

	public static void main(String[] args) {
	//	Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		Visitante p5 = new Visitante();
		
		p5.setNome("Juvena");
		p5.setIdade(25);
		p5.setSexo("M");
		System.out.println(p5.toString());
		 
	//	p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Claúdio");
		p4.setNome("Fabiana");
		
		p2.setCurso("Informática");
		p3.setSalario(2500.75f);
		p4.setSetor("Tecnolgia");
		
		
	}

}
