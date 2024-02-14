import java.util.Objects;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		
		// Объявление сканера.
		
		Scanner scanner = new Scanner(System.in);
		
		
		// Ввод значений a и b пользователем.
		Integer a =  null;
		Integer b =  null;
		
		while (Objects.isNull(a) || Objects.isNull(b))  {
		try {
		System.out.println("Введите значение целого числа a: ");
		a = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Введите значение целого числа b: ");
		b = Integer.parseInt(scanner.nextLine());
		}
		catch (NumberFormatException nfe) {
			System.out.println("Не верный формат данных. Попробуйте ещё раз. \n");
			}
		}
		
		// Сравнение чисел a и b.
		
		if (a > b) {
			System.out.println("a > b");
		}
		else
			if (a < b) {
				System.out.println("a < b");
			}
			else
			System.out.println("a = b");
		
		
		// Ввод знака операции пользователем.
	
		System.out.println("Введите знак операции (+, -, /, *): ");
		
		String operator = scanner.nextLine();
		
		
		// Выполнение операции соответсвующей знаку операции.
		
		switch(operator) {
		
		case "+":
			System.out.println("Результат операции сложения: " + Integer.sum(a, b));
			break;
			
		case "-":
			System.out.println("Результат операции вычитания: " + Integer.sum(a, -b));
			break;
			
		case "/":
			System.out.println("Результат операции деления: " + a/b);
			break;
			
		case "*":
			System.out.println("Результат операции умножения: " + a*b);		
			break;
			
		default:
			System.out.println("Знак операции введен не верно!");
			break;
		}
		
	}
}
