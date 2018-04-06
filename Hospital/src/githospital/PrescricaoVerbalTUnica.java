package githospital;

public class PrescricaoVerbalTUnica extends Prescricao {
	private Enfermeiro enfermeiro;
	private AutorizacaoPrescricao autorizacao;

	public PrescricaoVerbalTUnica() {}
	
	public PrescricaoVerbalTUnica(Enfermeiro enfermeiro, AutorizacaoPrescricao autorizacao) {
		this.enfermeiro = enfermeiro;
		this.autorizacao = autorizacao;
	}

	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	public AutorizacaoPrescricao getAutorizacao() {
		return autorizacao;
	}

	public void setAutorizacao(AutorizacaoPrescricao autorizacao) {
		this.autorizacao = autorizacao;
	}
	
}
