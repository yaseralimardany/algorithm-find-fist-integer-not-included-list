import java.util.Arrays;

public class Solution {
    public static int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length - 1; i++) {
            if (A[0] > 1) {
                return 1;
            }
            if (A[i+1] <= 0) {
                continue;
            }

            if (A[i] <= 0) {
                if (A[i+1] > 1) {
                    return 1;
                }
            } else if (A[i+1] - A[i] > 1) {
                return A[i] + 1;
            }
        }
        int result = A[A.length - 1] + 1;
        if (result <= 0) {
            return 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {2000, 3, 3, 3, 3, 7, 5};
        System.out.println(solution(A));
    }
}
