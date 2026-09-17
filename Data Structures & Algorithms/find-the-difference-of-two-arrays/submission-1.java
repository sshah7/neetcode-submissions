class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1= new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int j=0; j<nums2.length; j++){
            set2.add(nums2[j]);
        }
        return List.of(set1.stream()
                        .filter(a->!set2.contains(a))
                        .collect(Collectors.toList()), set2.stream()
                        .filter(b-> !set1.contains(b))
                        .collect(Collectors.toList()));
    }
}