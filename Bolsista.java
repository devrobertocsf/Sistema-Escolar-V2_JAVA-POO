package pacote10;

public class Bolsista extends Aluno {
private float bolsa;

public void RenovarBolsa() {
	System.out.println("Bolsa renovada com sucesso do BOLSISTA: " + this.getNome());
}

@Override
public void pagarMensalidade() {
	System.out.println("Mensalidade paga com sucesso do BOLSISTA: " + this.getNome());
}

	
public float getBolsa() {
	return bolsa;
}



public void setBolsa(float bolsa) {
	this.bolsa = bolsa;
}




}
