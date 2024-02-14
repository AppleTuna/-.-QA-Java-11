
public class task3 {

	public static void main(String[] args) {
		
		// Заданный из условия массив целых чисел
	
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
	
		
		// Цикл for для вывода чётных значений массива
		
		for (int i = 0; i < arr.length; i++) {
			if((arr[i] % 2) == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
