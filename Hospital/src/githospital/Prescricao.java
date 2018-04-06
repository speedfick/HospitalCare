package githospital;

import java.util.ArrayList;
import java.util.Date;

public class Prescricao {

	//Atributos dos relacionamentos
		protected Medico medico;
		protected Doente doente;
		protected Medicamento medicamento;
		protected ArrayList<HorarioToma>  horariosToma;
			
		//Atributos da Prescricao
		protected Date data;
			
			
		//construtores
		public Prescricao() {	
			horariosToma = new ArrayList<HorarioToma>();
		}

			
		public Prescricao(Medico medico, Doente doente, Medicamento medicamento, ArrayList<HorarioToma> horariosToma, Date data) {
				this.medico = medico;
				this.doente = doente;
				this.medicamento= medicamento;
				this.horariosToma = horariosToma;
				this.data = data;
		}


		public Medico getMedico() {
			return medico;
		}


		public void setMedico(Medico medico) {
			this.medico = medico;
		}


		public Doente getDoente() {
			return doente;
		}


		public void setDoente(Doente doente) {
			this.doente = doente;
		}


		public Medicamento getMedicamento() {
			return medicamento;
		}


		public void setMedicamento(Medicamento medicamento) {
			this.medicamento = medicamento;
		}


		public ArrayList<HorarioToma> getHorariosToma() {
			return horariosToma;
		}


		public void setHorariosToma(ArrayList<HorarioToma> horariosToma) {
			this.horariosToma = horariosToma;
		}


		public Date getData() {
			return data;
		}


		public void setData(Date data) {
			this.data = data;
		}
		
}
