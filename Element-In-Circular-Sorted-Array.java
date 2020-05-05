// Find the index of an element in a circular sorted array. 
// Note- No duplicates
public class testArray {
    public static void main(String[] args){
        int arr[] = {14, 15, 19, 22, 32, 43, 1, 2, 3, 4};
        int N = arr.length, num = 4;

        int start = 0, end = N-1;
        int indexOfMinElement = minIndex(arr, N, start, end);

        if(num == arr[indexOfMinElement]) System.out.println(indexOfMinElement);
        else if(num < arr[0]){
            start = indexOfMinElement+1;
            System.out.println(indexOfSerachedNumber(arr, N, num, start, end));
        }else{
            end = indexOfMinElement - 1;
            System.out.println(indexOfSerachedNumber(arr, N, num, start, end));
        }
    }

    public static int indexOfSerachedNumber(int[] arr, int N, int num, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(num == arr[mid]) return mid;
            else if(num<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    
    public static int minIndex(int[] arr, int N, int start, int end){
        while (start<=end) {
            if(arr[start]<=arr[end]) return start;      // [2, 3, 5, 7, 9]

            int mid = start+(end-start)/2;
            int next = (mid+1) % N;
            int prev = (mid+N-1) % N;
            if(arr[mid] < arr[prev] && arr[mid] < arr[next]) return mid;   // [6, 9, 2, 3, 4]

            if(arr[mid] >= arr[start]) start = mid+1;  // [7, 9, 11, 15, 4, 5, 6]
            else end = mid-1;                         // [11, 15, 17, 1, 2, 4, 5, 7, 9, 10]
        }
        return -1;  // It won't return -1 in any case:D
    }
    
}
