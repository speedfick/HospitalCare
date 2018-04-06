package githospital;

import java.util.Date;

public class Entrada {

	private FuncionarioAdministrativo funcionario;
	private Doente doente;
	
	private Date data_hora;

	public Entrada(FuncionarioAdministrativo funcionario, Doente doente, Date data_hora) {
		super();
		this.funcionario = funcionario;
		this.doente = doente;
		this.data_hora = data_hora;
	}

	public FuncionarioAdministrativo getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(FuncionarioAdministrativo funcionario) {
		this.funcionario = funcionario;
	}

	public Doente getDoente() {
		return doente;
	}

	public void setDoente(Doente doente) {
		this.doente = doente;
	}

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}
	
}
