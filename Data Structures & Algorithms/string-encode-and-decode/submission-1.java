class Solution {

    public String encode(List<String> strs) {
       List<Integer> sizes = new ArrayList<>();
       StringBuilder res = new StringBuilder();

        for(String s : strs){
            sizes.add(s.length());
        }

        for(int n : sizes){
            res.append(n);
            res.append(",");
        }

        res.append("#");

        for(String s: strs){
            res.append(s);
        }

       return res.toString();  
    }

    public List<String> decode(String str) {
        List<Integer> sizes = new ArrayList<>();
        List<String> res = new ArrayList<>();

        int i=0;
        while(str.charAt(i) != '#'){
            StringBuilder cur = new StringBuilder();
            while(str.charAt(i) != ','){
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for(int sz: sizes){
            res.add(str.substring(i, i+sz));
            i+=sz;
        }
        return res;
    }
}