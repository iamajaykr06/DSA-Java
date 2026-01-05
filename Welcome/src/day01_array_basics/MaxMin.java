package day01_array_basics;

class MaxMin {
    public static void main(String[] args) {

        int[] num = {54, 89, 56, 34, 12, 29, 18, 10, 5};

        int max = num[0];
        int min = num[0];
        for(int i=0;i<num.length;i++)
        {
            if(num[i]>max){
                max=num[i];
            }
            else if(num[i]<min)
            {
                min=num[i];
            }

        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
