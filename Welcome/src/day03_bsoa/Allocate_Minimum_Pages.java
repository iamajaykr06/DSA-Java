package day03_bsoa;

public class Allocate_Minimum_Pages {
    public static void main(String[]args){
        int[] pages = {12, 34, 67, 90};
        int students = 2;

        System.out.println("Minimum Number of Pages Read by a Single Student="+minimumPages(pages,students));
    }
    public static int minimumPages(int[] pages,int students){
        if (students > pages.length) return -1;
        int low=0,high=0;
        int ans =-1;
        for(int p:pages){
            low=Math.max(low,p);
            high+=p;
        }

        while(low<=high){

            int mid =low+(high-low)/2;
            int s=1;
            int currentPages =0;
            for(int p:pages){
                  if(currentPages+p>mid){
                      s++;
                      currentPages=p;
                  }
                  else{
                      currentPages+=p;
                  }
            }
            if(s<=students){
                ans=mid;
                high=mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return ans;
    }
}
