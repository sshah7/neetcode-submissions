class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stuQueue = new LinkedList<>();
        for (int student : students) {
            stuQueue.offer(student);
        }
        
        int sandIndex = 0;
        int rotated = 0;
        
        while (!stuQueue.isEmpty() && rotated < stuQueue.size()) {
            if (stuQueue.peek() == sandwiches[sandIndex]) {
                stuQueue.poll();
                sandIndex++;
                rotated = 0;
            } else {
                stuQueue.offer(stuQueue.poll());
                rotated++;
            }
        }
        return stuQueue.size();
    }
}