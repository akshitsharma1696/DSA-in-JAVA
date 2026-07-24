class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int max = 0;

        for (int x : nums) {
            max = Math.max(max, x);
        }

        int size = 1;
        while (size <= max) {
            size <<= 1;
        }

        boolean[] one = new boolean[size];
        boolean[] two = new boolean[size];
        boolean[] three = new boolean[size];

        // possible XOR using 1 number
        for (int x : nums) {
            one[x] = true;
        }

        // possible XOR using 2 numbers
        for (int x = 0; x < size; x++) {
            if (one[x]) {
                for (int num : nums) {
                    two[x ^ num] = true;
                }
            }
        }

        // possible XOR using 3 numbers
        for (int x = 0; x < size; x++) {
            if (two[x]) {
                for (int num : nums) {
                    three[x ^ num] = true;
                }
            }
        }

        int count = 0;

        for (boolean value : three) {
            if (value) {
                count++;
            }
        }

        return count;
    }
}