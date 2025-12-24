class LowerBound {
    public static void main(String[] args){

        int[] arr = {2, 4, 4, 4, 6, 8};
        int target = 5;
        int low = 0,high= arr.length-1;
        int ans = arr.length;
        while(low<=high)
        {

            int mid = low+(high-low)/2;

            if(arr[mid]>=target)
            {
               ans= mid;
               high= mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("Lower Bound Index:"+ans);
    }
}
