package br.com.fiap.codigoAltaPerformance.EstruturaDados.MetodosBusca;

public class Registro {
	
	String info;
	int chave;
	
	public Registro(String info, int chave) {
		super();
		this.info = info;
		this.chave = chave;
	}
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Registro [chave=" + chave + ", info=" + info + "]";
	}
	
}
