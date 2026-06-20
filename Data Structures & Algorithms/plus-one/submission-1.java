class Solution {
    public int[] plusOne(int[] digits) {
        int carryOver = 1;
        int[] res = new int[digits.length];

        for (int i = digits.length - 1; i >= 0; i--) {
            res[i] = digits[i] + carryOver;
            carryOver = res[i] / 10;
            res[i] %= 10;
        }

        if (carryOver > 0) {
            int[] resWithCarryOver = new int[digits.length + 1];
            resWithCarryOver[0] = carryOver;
            for(int i = 1; i < resWithCarryOver.length; i++) {
                resWithCarryOver[i] = res[i-1];
            }
            return resWithCarryOver;
        }

        return res;
    }
}
