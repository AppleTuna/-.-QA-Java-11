import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {

		// Объявление сканера.
		
		Scanner scanner = new Scanner(System.in);
				
			
		// Ввод значений a и b пользователем.
		
		System.out.println("Введите значение строки a: ");
		
		String a = scanner.nextLine();
		
		System.out.println("Введите значение строки b: ");
		
		String b = scanner.nextLine();
		
		
		// Проверка значений на идетичность.
		
		if (a.equals(b)) {
			System.out.println("Строки идентичны");
		}
		else System.out.println("Строки не идентичны");
	}

}
