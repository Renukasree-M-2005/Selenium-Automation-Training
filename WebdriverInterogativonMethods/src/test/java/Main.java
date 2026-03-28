public class Main {

    static final long MOD = 1000000007;

    public static int findIndex(int[] arr) {

        long maxValue = -1;
        int answer = 1;

        for (int i = 0; i < arr.length - 1; i++) {

            // calculate arr[i]^arr[i+1] % MOD
            long value = power(arr[i], arr[i+1]);

            // check maximum
            if (value > maxValue) {
                maxValue = value;
                answer = i + 1; // 1-based index
            }
        }

        return answer;
    }

    // fast power function
    static long power(long base, long exp) {

        long result = 1;

        base = base % MOD;

        while (exp > 0) {

            if (exp % 2 == 1) {   // if exponent is odd
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD; // square the base
            exp = exp / 2;              // divide exponent
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {3,5,4,5,2,10};

        System.out.println(findIndex(arr));
    }
}
