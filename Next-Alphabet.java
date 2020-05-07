package ***;

public class NextAlphabet {

	public static void main(String[] args) {
		char arr[] = {'b', 'f', 'k', 'm', 'n', 'r', 'u', 'x', 'z'};
		char toget = 'y';
		int start = 0, end = arr.length - 1;
		
		int result = nextAlpha(arr, start, end, toget);
		System.out.println(arr[result]);

	}

	private static int nextAlpha(char[] arr, int start, int end, char toget) {
		while(start <= end) {
			int mid = start+(end-start)/2;
			if(arr[mid] > toget) {
				end = mid-1;
				if(arr[mid-1] < toget) return mid;
			}else {
				start = mid+1;
				if(arr[mid+1] > toget) return mid+1;
			}
		}
		return 0;
	}

}
