class ReverseArray {
    public static void main(String[] args) {

        int[] num = {54, 89, 56, 34, 12, 29, 18, 10, 5};

        for (int i = 0, j = num.length - 1; i < j; i++, j--) {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }

        for (int k = 0; k < num.length; k++) {
            System.out.print(num[k] + " ");
        }
    }
}
