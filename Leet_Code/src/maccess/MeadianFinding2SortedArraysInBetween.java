package maccess;

public class MeadianFinding2SortedArraysInBetween {

	public static void main(String[] args) {

		int[] arr1 = { 2, 4, 8, 10 };
		int[] arr2 = { 1, 3, 5, 7 };

		int m = arr1.length;
		int n = arr2.length;
		int[] arr = new int[m + n];
		int i = 0, j = 0, k = 0;

	
		while (i < m && j < m) {
			if (arr1[i] < arr2[j]) {
				arr[k++] = arr1[i++];
			} else
				arr[k++] = arr2[j++];
		}
		while (i < n) {
			arr[k++] = arr1[i++];
		}

		while (i < m) {
			arr[k++] = arr2[j++];
		}

		
		
		
		int temp=0;
		for(int a=0;a<arr1.length;a++)
		{
			for(int b=1;b<arr1.length;b++)
			{
				if(arr1[a]<arr1[b])
				temp=arr1[b];
				arr1[b]=arr1[a];
				arr1[a]=temp;
			}
		}
		
		for (int p = 0; p < arr1.length; p++) {
			System.out.print(arr1[p] + " ");
		}
//		
		System.out.println();
		int l=(arr1.length+arr2.length)>>1;
		
		
		System.out.println(l);

	}

}
