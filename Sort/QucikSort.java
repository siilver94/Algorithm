public class QuickSort {
	public void sort(int[] data, int l, int r) {
		int left = l;
		int right = r;
		int pivot = data[l + r / 2];

		do {
			while (data[left] < pivot)
				left++;
			while (data[right] > pivot)
				right--;
			if (left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);

		if (l < right)
			sort(data, l, right);
		if (r > left)
			sort(data, left, r);
	}

	public static void main(String[] args) {
		int data[] = { 5, 5, 4, 3, 2, 1 };

		QuickSort quick = new QuickSort();

		quick.sort(data, 0, data.length - 1);
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

	}
}
