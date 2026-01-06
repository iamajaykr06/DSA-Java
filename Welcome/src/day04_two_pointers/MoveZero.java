package day04_two_pointers;

public class MoveZero {

    static void moveZero(int[]arr){
        int slow=0;
        for(int fast=0;fast< arr.length;fast++){
            if (arr[fast]!=0) {
                arr[slow]=arr[fast];
                slow++;
            }
        }

        while(slow< arr.length){
            arr[slow]=0;
            slow++;
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 0, 2, 0, 0, 3};

        moveZero(arr);
        for(int i:arr){
            System.out.print(i +" ");
        }
    }
}
