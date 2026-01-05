public class RemoveDuplicates {

    static int removeDuplicates(int[]arr){
        if (arr.length == 0) return 0;
        int slow=0;
        for(int fast=1;fast<arr.length;fast++){
            if(arr[slow]!=arr[fast]){
                slow++;
                arr[slow]=arr[fast];
            }
        }
        return slow+1;
    }
    public static void main(String[]args){
       int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

       int len =removeDuplicates(arr);
        System.out.println(len);
        for(int i=0;i<len;i++){
           System.out.print(arr[i]+" ");
       }
    }
}
