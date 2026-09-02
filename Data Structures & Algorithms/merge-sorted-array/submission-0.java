class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left= nums1.length-1;
        while((left>=0) && n>0){
            if(m > 0 && nums1[m-1] > nums2[n-1]){
                nums1[left] = nums1[m-1];
                m--;
            }else{
                nums1[left] = nums2[n-1];
                n--;
            }
            left--;
        }
        return;
    }
}