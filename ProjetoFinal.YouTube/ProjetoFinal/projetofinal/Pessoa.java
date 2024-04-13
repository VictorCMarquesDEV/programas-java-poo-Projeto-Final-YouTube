package projetofinal;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected float experiencia;
	
	
	public Pessoa(String no, int id, String se) {
		this.setNome(no);
		this.setIdade(id);
		this.setSexo(se);
		this.setExperiencia(0);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}


	protected void ganharExp(int xp) {
		this.setExperiencia(this.getExperiencia() + xp);
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}
	
}
