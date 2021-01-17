package by.htp.project.task02;

public class Task02 {

	public void numbersDivides(int n, int k) {
		int[] mas;
		int sum = 0;
		mas = new int[n];
		for (int i = 0; i < n; i++) {
			if (mas[i] % k == 0) {
				sum += mas[i];
			}
		}
	}

	public int[] massNull(int[] mas) {
		int[] masnull;
		int count = 0;
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

	public boolean vozrMass(int[] mas) {
		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] > mas[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public int[] number2(int[] mas) {
		int[] mas2;
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				count++;
			}
		}
		
		mas2 = new int[count];
		
		if (count == 0) {
			System.out.println(" нет четных элементов");
			return mas2;
		}

		int j = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				mas2[j] = mas[i];
				j++;
			}
		}
		return mas2;

	}

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

	public void printA(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.println(mas[i]);
			}
		}
	}

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
