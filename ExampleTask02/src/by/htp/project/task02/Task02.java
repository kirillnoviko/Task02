package by.htp.project.task02;

public class Task02 {

	// 1. В массив A [N] занесены натуральные числа.
	// Найти сумму тех элементов, которые кратны данному К.
	public void numbersDivides(int n, int k) {
		int[] mas;
		int sum;

		sum = 0;
		mas = new int[n];

		for (int i = 0; i < n; i++) {

			if (mas[i] % k == 0) {
				sum += mas[i];
			}

		}

	}

	// 2. В целочисленной последовательности есть нулевые элементы.
	// Создать массив из номеров этих элементов.
	public int[] massNull(int[] mas) {
		int[] masnull;
		int count;

		count = 0;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] == 0) {
				count++;
			}

		}

		masnull = new int[count];
		int j = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				masnull[j] = i;
				j++;
			}
		}

		return masnull;
	}

	// 3. Дана последовательность действительных чисел а1 а2 ,..., аn .
	// Выяснить, будет ли она возрастающей.
	public boolean vozrMass(int[] mas) {

		for (int i = 0; i < mas.length - 1; i++) {

			if (mas[i] > mas[i + 1]) {
				return false;
			}

		}
		return true;
	}

	// 4. Дана последовательность натуральных чисел а1 , а2 ,..., ап.
	// Создать массив из четных чисел этой последовательности.
	// Если таких чисел нет, то вывести сообщение об этом факте.
	public int[] number2(int[] mas) {
		int[] mas2;
		int count;

		count = 0;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] % 2 == 0) {
				count++;
			}

		}

		mas2 = new int[count];
		int j = 0;

		if (count == 0) {
			return mas2;
		}

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] % 2 == 0) {
				mas2[j] = mas[i];
				j++;
			}

		}

		return mas2;

	}

	// 5. Дана последовательность чисел а1 ,а2 ,..., ап.
	// Указать наименьшую длину числовой оси, содержащую все эти числа
	public int[] minMaxnumbers(int[] mas) {

		int[] minMax = new int[2];
		minMax[0] = mas[0];
		minMax[1] = mas[0];

		for (int i = 0; i < mas.length; i++) {

			if (minMax[0] > mas[i]) {
				minMax[0] = mas[i];
			}

			if (minMax[1] < mas[i]) {
				minMax[1] = mas[i];
			}

		}

		return minMax;
	}

	// 6. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все
	// ее члены, большие данного Z, этим числом.
	// Подсчитать количество замен.
	public int[] compareZ(int[] mas, int z) {
		int count = 0;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > z) {
				count++;
				mas[i] = z;
			}

		}

		System.out.println(" количество замен: " + count);
		return mas;
	}

	// 7. Даны действительные числа а1 ,а2 ,..., аn .
	// Поменять местами наибольший и наименьший элементы.
	public int[] replaceMinMaxNumbers(int[] mas) {

		int max = mas[0];
		int min = mas[0];
		int indexMin = 0;
		int indexMax = 0;

		int temp = 0;

		for (int i = 0; i < mas.length; i++) {

			if (min > mas[i]) {
				min = mas[i];
				indexMin = i;
			}

			if (max < mas[i]) {
				max = mas[i];
				indexMax = i;
			}

		}

		temp = mas[indexMin];
		mas[indexMin] = mas[indexMax];
		mas[indexMax] = temp;

		return mas;

	}

	// 8. Даны целые числа а1 ,а2 ,..., аn .
	// Вывести на печать только те числа, для которых аi > i.
	public void printA(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > i) {
				System.out.println(mas[i]);
			}

		}

	}

	// 9. Дан массив действительных чисел, размерность которого N.
	// Подсчитать, сколько в нем отрицательных,
	// положительных и нулевых элементов.
	public void nullPlusMinusNumber(int[] mas) {

		int numberNull = 0;
		int numberPlus = 0;
		int numberMinus = 0;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > 0) {

				numberPlus++;

			} else if (mas[i] < 0) {

				numberMinus++;

			} else {

				numberNull++;

			}
		}

		System.out.println("нулевых элементов: " + numberNull);
		System.out.println("положительных элементов: " + numberPlus);
		System.out.println("отрицательных элементов: " + numberMinus);

	}

	// 10. Даны действительные числа 𝑎1, 𝑎2 , … , 𝑎2𝑛.
	// Найти
	// max( , , , ) a1 + a2n a2 + a2n−1  an + an+1
	public void maxSumNumber(int n) {

		int[] mas = new int[2 * n];

		for (int i = 0; i < mas.length; i++) {

			mas[i] = ((int) (Math.random() * 13));
			System.out.println(mas[i]);

		}

		int max = mas[0] + mas[2 * n - 1];

		for (int i = 1; i < n - 1; i++) {

			if (max < (mas[i] + mas[2 * n - 1 - i])) {
				max = mas[i] + mas[2 * n - 1 - i];
			}

		}

		System.out.println(" max( a1+a2n, a2+a2n-1 ,.... , an+an+1) : " + max);
	}

}
