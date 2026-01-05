package day02_binary_search;

class First_and_Last_Occurrence {

    static int FirstOccurrence(int[]arr,int target){

        int low=0;
        int high=arr.length-1;
        int result=-1;

        while(low<=high){

            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return result;
    }

    static int LastOccurrence(int[]arr,int target){

        int low=0;
        int high=arr.length-1;
        int result=-1;

        while(low<=high){

            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return result;
    }
    public static void main(String[] args)
    {
        int[] arr = {2, 4, 4, 4, 6, 7, 8};
        int target = 4;

        System.out.println("First Occurrence Of Target Element="+FirstOccurrence(arr,target));
        System.out.println("Last Occurrence Of Target Element="+LastOccurrence(arr,target));
    }
}
