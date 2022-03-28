
public class Exercicio7 {

	public static void main(String[] args) {
		
		double base = 1;
		double lado1 = 2;
		double lado2 = 3;
		
		if (base == lado1 && lado1 == lado2) {
			System.out.println("É um Equilatero");
		}
		else if ((base != lado1 && base == lado2) || (lado1 == base && lado1 != lado2 ) || (lado1 != base && lado2 == lado1)) {
			System.out.println("É um Isosceles");
		}
		else {
			System.out.println("É um Escaleno");
		}
	}

}
