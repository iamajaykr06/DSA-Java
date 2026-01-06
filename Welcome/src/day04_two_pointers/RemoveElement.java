package day04_two_pointers;

public class RemoveElement {

    static int removeElement(int[]arr,int val){

        int slow=0;

        for(int fast=0;fast< arr.length;fast++){
            if(arr[fast]!=val){
                arr[slow]=arr[fast];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args){
        int []arr = {3, 2, 2, 3};
        int val = 3;

        int len=removeElement(arr,val);

        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
