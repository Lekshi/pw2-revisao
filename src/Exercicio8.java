
public class Exercicio8 {

	public static void main(String[] args) {
		
		String diaSemana = "domingo";
		//String diaSemana = "segunda";
		//String diaSemana = "terca";
		//String diaSemana = "quarta";
		//String diaSemana = "quinta";
		//String diaSemana = "sexta";
		//String diaSemana = "sabado";
		
		if (diaSemana == "domingo" || diaSemana == "sabado") {
			System.out.println("Você não pode ir ao banco!");
		}
		else {
			System.out.println("Você pode ir ao banco!");
		}
	}

}
