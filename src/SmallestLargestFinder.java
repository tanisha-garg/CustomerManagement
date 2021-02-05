
class SmallestLargestFinder {

	public static void main(String[] args) {

		int arr[] = { 4, 3, 8, 65, 7 };
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
//		for(int index = 0; index < length; index++) {
//			System.out.println(arr1[index]);
//		}
		System.out.println("Smallest Number: " + arr[0]);
		System.out.println("Largest Number: " + arr[length - 1]);

	}

}
