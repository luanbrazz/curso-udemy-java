package exececao2.exercicioAgenda;

@SuppressWarnings("serial")
public class AgendaCheiaException extends Exception {
	
	@Override
	public String getMessage() {
		return "Agenda já está cheia!";
	}
}
