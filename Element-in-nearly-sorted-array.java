/* Find the index of an element in a nearly sorted array. 
Nearly sorted means that an element which has to be at 
x index can be at x, x-1, x+1 index */

public class elementInNearlySortedArray{
    public static void main(String args[]) {
        int arr[] = {2, 1, 3, 5, 4, 7, 6, 9, 8};
        int N = arr.length;
        int num = 81;

        int start=0;
        int end = N-1;

        int result = get(arr, start, end, num);

        System.out.println(result);
        }

    static int get(int arr[], int start, int end, int num){
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid]==num){
                return mid;
            }

            if(arr[mid+1] == num){
                return mid+1;
            }
            if(arr[mid-1] == num){
                return mid-1;
            }
            
            if(arr[mid] > num){
                end = mid-2;
            }else{
                start = mid+2;
            }
        }
        return -1;
    }

}
