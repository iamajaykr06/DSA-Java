package day02_binary_search;

class BinarySearch {
    public static void main(String[] args){

        int[] sorted_array = {5,8,10,12,15,20,25,28,46,56,64,69,86,90};
        int target=25;
        int low=0,high=sorted_array.length-1,result=-1;

        while (low<=high)
        {
            int mid=(low+high)/2;

            if(sorted_array[mid] == target)
            {
                 result=mid;
                 break;
            }
            else if(sorted_array[mid]>target)
            {
                low=mid+1;
            }
             else
            {
                high = mid-1;
            }

        }
        System.out.println(sorted_array[result]);
    }
}
