package pacote10;

public class Aluno extends Pessoa {

private int matr;
private String curso;

// método

public void pagarMensalidade() {
	System.out.println("Mensalidade paga com sucesso do aluno: " + this.getNome());
}


public void cancelarMatr() {
	
}


//métodos especiais 
public int getMatr() {
	return matr;
}
public void setMatr(int matr) {
	this.matr = matr;
}
public String getCurso() {
	return curso;
}
public void setCurso(String curso) {
	this.curso = curso;
}


}
