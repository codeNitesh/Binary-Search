public class binarySearchImpl {
    public static void main(String[] args){
        int[] arr = {2, 5, 8, 11, 45, 55, 65, 66, 78, 98};
        int num = 2;
        System.out.println("The index of " + num +" is " + binarySearch(arr, num));
    }

public static int binarySearch(int[] arr, int num){
    int p = 0, r = arr.length - 1;

    while(p<=r){
        int mid = p + (r-p)/2;
        if(arr[mid] <= num){
            p = mid;
            if(arr[mid] == num){
                return mid;
            }
        }else{
            r = mid - 1;
            
        }
    }
    return -1;
}
}
