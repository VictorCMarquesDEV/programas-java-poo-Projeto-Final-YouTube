package projetofinal;

public class Gafanhoto extends Pessoa {
	private String login;
	private int totAssistido;
	
	
	public Gafanhoto(String no, int id, String se, String lo) {
		super(no, id, se);
		this.setLogin(lo);
		this.setTotAssistido(0);
	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	
	public void viuMaisUm() {
		this.setTotAssistido(this.getTotAssistido() + 1);
	}


	@Override
	public String toString() {
		return "Gafanhoto{" + super.toString() + " login=" + login + ", totAssistido=" + totAssistido + "}";
	}
	
}
