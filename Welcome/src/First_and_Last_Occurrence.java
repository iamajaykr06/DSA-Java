class First_and_Last_Occurrence {
    public static void main(String[] args)
    {
        int[] arr = {2, 4, 4, 4, 6, 7, 8};
        int target = 4,low=0,high=arr.length-1,result=-1;

        while(low<=high)
        {
            int mid = (low+high)/2;

            if(arr[mid]==target){
                high=mid-1;
                result = high;
                System.out.println(result);
                low=mid+1;
                result=low;
                System.out.println(result);
                break;
            }
            else if(arr[mid]<target){
                low = mid-1;
            }
            else{
                high = mid+1;
            }

        }
    }
}
