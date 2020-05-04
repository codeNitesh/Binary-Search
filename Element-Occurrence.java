public class noOfOccurrenceBS {
    public static void main(String args[]){
        int arr[] = {2, 2, 5, 5, 5, 5, 5, 5, 6, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 14, 30};
        int num = 9;

        int start = 0, end = arr.length-1;
        int firstOccur = 0, lastOccur=-1;
        while(start<=end){

            int mid = start + (end-start)/2;
            if(arr[mid] == num){
                firstOccur = mid;
                end = mid-1;
            }else if(arr[mid] < num){
                start = mid+1;
            }else{
                end = mid - 1;
            } 
        }

        start = 0;
        end = arr.length-1;
        while(start<=end){

            int mid = start + (end-start)/2;
            if(arr[mid] == num){
                lastOccur = mid;
                start = mid+1;
            }else if(arr[mid] < num){
                start = mid+1;
            }else{
                end = mid - 1;
            } 
        }

        int result = lastOccur - firstOccur + 1;
        System.out.println(result);
    }
}
