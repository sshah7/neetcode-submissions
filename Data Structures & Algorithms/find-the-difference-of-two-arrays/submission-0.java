class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();

        Set<Integer> set1= new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int j=0; j<nums2.length; j++){
            set2.add(nums2[j]);
        }
        List<Integer> diff1 = set1.stream()
                        .filter(a->!set2.contains(a))
                        .collect(Collectors.toList());

        List<Integer> diff2 = set2.stream()
                        .filter(b-> !set1.contains(b))
                        .collect(Collectors.toList());

        return List.of(diff1, diff2);
    }
}