/* We are given with an array and a number. 
And we need to find out the floor of that number. 
This means if the number itself is present in the 
array then we have to print that number, and if it
is not present then we need to print the largest 
number, smaller than number, present in that array */

// Example - arr = {2, 3, 7, 8, 9, 11} and number = 5 -----> It will print 3, as it is largest number which is smaller than 5.

public class floorOfNumber{
    public static void main(String args[]) {
        int arr[] = {};
        int N = arr.length; 
        int num = 3;
        
        int start=0, end = N-1;
        int result = get(arr, start, end, num);
        if(result == -1) System.out.println("Hey, the number is lesser than " + arr[0]);
        else if (result == -2) System.out.println("Array seems empty");
        else System.out.println(arr[result]);
        }

    static int get(int arr[], int start, int end, int num){
        if(arr.length == 0)  return -2;
        if(num < arr[start]) return -1;
        if(num > arr[end]) return end;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == num) return mid;
            else if(arr[mid] < num){
                start = mid+1;
                if(arr[mid+1] > num){
                    return mid;
                }
            }else{
                end = mid-1;
                if(arr[mid-1] < num){
                    return mid-1;
                }
            }
        }

        return -1;
    }

}
