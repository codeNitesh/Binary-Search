public class firstOccurrenceBS {
    public static void main(String args[]){
        int arr[] = {2, 2, 5, 5, 5, 5, 5, 5, 6, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 14, 30};
        int num = 5;

        int start = 0, end = arr.length-1;
        int result = -1;
        while(start<=end){

            int mid = start + (end-start)/2;
            if(arr[mid] == num){
                result = mid;
                end = mid-1;
            }else if(arr[mid] < num){
                start = mid+1;
            }else{
                end = mid - 1;
            }
            
        }
        System.out.println(result);       
    }
}
