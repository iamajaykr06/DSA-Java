class Koko_Eating_Bananas{
    public static void main(String[]args){
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int low =1;
        int high =0;

        for(int p: piles){
            high=Math.max(high,p);
        }

        int ans = high;
        while(low<=high){
            int mid =low+(high-low)/2;
            long hours = 0;

            for(int p: piles){
                hours+=(p+mid-1)/mid;
            }

            if(hours<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println("Minimum Eating piles/hours="+ans);
    }
}