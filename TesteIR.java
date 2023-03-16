
public class TesteIR {

	public static void main(String[] args) {
		
		double salario = 4600.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("IR é de 7.5%, valor de R$ 142.");
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("IR é de 15%, valor de R$ 350.");
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("IR é de 22.5%, valor de R$ 636.");
		}
	}
}