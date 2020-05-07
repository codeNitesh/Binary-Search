package ***;

public class CeilingOfNumber {
	public static void main(String[] args) {
		int arr[] = {2, 3, 7, 11, 16, 19, 20};
		int num = 9;     // Not considering cases of number greater than arr[end];
		int N = arr.length;
		int start = 0, end = N-1;
		
		int ceiling =  getCeiling(arr, start, end, num);
		System.out.println(arr[ceiling]);
	}

	private static int getCeiling(int[] arr, int start, int end, int num) {
		if(arr[start] > num) return start;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid] == num) return mid;
			else if(arr[mid] > num) {
				end = mid-1;
				if(arr[mid-1] < num) return mid;
			}else{
				start = mid+1;
				if(arr[mid+1] > num) return mid+1;
			}
		}
		return -1;
	}
}
