class Solution {
    public int[][] highFive(int[][] items) {
        return Arrays.stream(items)
                .collect(Collectors.groupingBy(item -> item[0], TreeMap::new, Collectors.mapping(item -> item[1], Collectors.toList())))
                .entrySet().stream()
                .map(entry -> {
                    List<Integer> scores = entry.getValue();
                    scores.sort(Collections.reverseOrder());
                    int sum = scores.stream().limit(5).mapToInt(Integer::intValue).sum();
                    return new int[]{entry.getKey(), sum / 5};
                })
                .toArray(int[][]::new);
    }
}