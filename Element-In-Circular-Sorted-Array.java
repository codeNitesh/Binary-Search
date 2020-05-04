import java.util.*;

public class elementInSortedArrayBS {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        for(int i=0; i<T; i++){
            int N = scan.nextInt();
            int arr[] = new int[N];
            for(int j=0; j<N; j++){
                arr[j] = scan.nextInt();
            }
            
            int num = scan.nextInt();
            
            int minIndex = findIndexOfMinElement(arr, N);
            
            if(minIndex == -1){
                System.out.println("-1");
                continue;
            }
            int start = 0, end =  N-1;
            
            int result = -1;
            if(arr[minIndex] == num){
               result = minIndex;
            }else if(num <= arr[end] && num >= arr[minIndex]){
               start = minIndex+1;
               result = getIndexOfSearchedElement(arr, start, end, num);
            }else{
               end = minIndex-1;
               result = getIndexOfSearchedElement(arr, start, end, num);
            } 

        System.out.println(result);
        }

        scan.close();
    }

    static int getIndexOfSearchedElement(int arr[], int start, int end, int num){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]==num){
                return mid;
            }else if(arr[mid] > num){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    static int findIndexOfMinElement(int[] arr, int N) {
        int start = 0; 
        int end = N-1;
        while(start <= end){
            if(arr[start] <= arr[end]){
                return start;
            }

            int mid = start + (end-start)/2;
            int prev = (mid+N-1) % N;
            int next = (mid+1) % N;
            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return mid;
            }
            if(arr[mid] >= arr[start]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
}
