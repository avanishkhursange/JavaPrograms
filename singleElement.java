public class singleElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,5};
        System.out.println(find(arr));
    }

    private static int find(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;

        if(arr.length==1){
            return arr[0];
        }

        while(start<=end){
            mid = start + (end-start)/2;
            if(mid%2==0){
                if(mid<arr.length-1 && arr[mid+1]==arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(mid>0 && arr[mid-1] == arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }

        return arr[start];
    }
}
