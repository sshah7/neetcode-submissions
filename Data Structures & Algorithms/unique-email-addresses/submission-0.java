class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for(int i=0; i<emails.length; i++){
            String[] a = emails[i].split("@");
            String local = a[0].split("\\+")[0].replace(".", "");
            set.add(local + "@" + a[1]);
        }

        return set.size();
    }
}