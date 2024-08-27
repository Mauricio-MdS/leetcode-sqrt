class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1;
        int right = x;

        while (left <= right) {
            int middle = (int)(((long)left + right) / 2);
            long middleSquared = (long) middle * middle;
            if (middleSquared == x) return middle;

            if (middleSquared < x) left = middle + 1;
            else right = middle - 1;
        }

        return right;
    }
}