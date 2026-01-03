import java.util.Arrays;
public class Aggressive_Cows {
    static int aggressiveCows(int[] stalls, int cows) {

        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (low <= high) {
            int D = low + (high - low) / 2;

            int c = 1;
            int lastPlaced = stalls[0];

            for (int i = 1; i < stalls.length; i++) {
                if (stalls[i] - lastPlaced >= D) {
                    c++;
                    lastPlaced = stalls[i];
                }
            }

            if (c >= cows) {
                ans = D;
                low = D + 1;
            } else {
                high = D - 1;
            }
        }
        return ans;
    }

    public static void main(String[]args){
        int[] stalls = {1, 2, 4, 8, 9};
        int cows = 3;
        System.out.println(aggressiveCows(stalls,cows));
    }
}
