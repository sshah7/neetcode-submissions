class Solution {
    public int numRescueBoats(int[] people, int limit) {
       int left=0;
       int right=people.length-1;
       int counter=0;

        Arrays.sort(people);
       while(left<=right){
            if(left == right) {
                counter++;
                break;
            }
            if(people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            counter++;
       }
       return counter;
    }
}