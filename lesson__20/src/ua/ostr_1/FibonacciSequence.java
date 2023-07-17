package ua.ostr_1;

public class FibonacciSequence {

	public static synchronized void getFibonacciSequence(int number, boolean order) {
		int n0 = 0;
		int n1 = 1;
		int n2;

		if (number < 1) {
			System.out.println("Введене число від'ємне або дорівнює нулю!");
		} else if (number == 1) {
			System.out.println(n0);
		} else if (order == true) {
			System.out.print("Ряд чисел Фібоначчі за зростанням: " + n0 + " " + n1 + " ");

			for (int i = 2; i <= number - 1; i++) {
				n2 = n0 + n1;

				System.out.print(n2 + " ");

				n0 = n1;
				n1 = n2;
			}

			System.out.println();

		} else {
			Integer[] fibonacci = new Integer[number];
			fibonacci[0] = n0;
			fibonacci[1] = n1;

			System.out.print("Ряд чисел Фібоначчі за спаданням: ");
			for (int i = 2; i < fibonacci.length; i++) {
				n2 = n0 + n1;
				fibonacci[i] = n2;

				n0 = n1;
				n1 = n2;
			}

			for (int i = fibonacci.length - 1; i >= 2; i--) {
				System.out.print(fibonacci[i] + " ");
			}

			System.out.print(fibonacci[1] + " " + fibonacci[0]);
			System.out.println();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
