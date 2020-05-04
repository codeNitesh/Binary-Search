class noOfTimesRotatedBS{
    public static void main(String[] args){
        int [] arr = {11, 14, 15, 125, 1228, 9, 10};
        int N = arr.length;
        int start = 0, end = N - 1;

        while(start<=end){
            // case 1
            if(arr[start] <= arr[end]){
                System.out.println(start);
                break;
            }
            int mid = start + (end-start)/2;
            int next = (mid+1) % N;
            int previous = (mid+N - 1) %  N;

            //case 2
            if(arr[mid] <= arr[previous] && arr[mid] <= arr[next]){
                System.out.println(mid);
                break;
            }
            // case 3
            if(arr[mid] <= arr[start]){
                end = mid -1;
            }else{
                start = mid +1;
            }
            
        }

    }
}
