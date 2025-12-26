public class BSOA_Integer_Square_Root {
    public static void main(String[]args){
        int n=30;
        int low=0;
        int high=n;
        int ans = 0;
        while(low<=high){

            int mid = low+(high-low)/2;

            if((long)mid*mid>=n){
                ans= mid;
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("Answer="+ans);
    }
}
