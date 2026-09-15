class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        for (int height : heights) {
            count[height]++;
        }
        int mismatches = 0;
        int expectedIndex = 0;
        for (int height = 1; height <= 100; height++) {
            while (count[height] > 0) {
                if (heights[expectedIndex] != height) {
                    mismatches++;
                }

                expectedIndex++;
                count[height]--;
            }
        }

        return mismatches;
    }
}