class Solution {
    public int findLonelyPixel(char[][] picture) {
        int count=0;
        int m= picture.length;
        int n =picture[0].length;
        int[] rowCount = new int[m];
        int[] colCount = new int[n];

        for(int i=0; i<picture.length; i++){
            for(int j=0; j<picture[0].length; j++){
                if(picture[i][j]=='B'){
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        for(int i=0; i<picture.length; i++){
            for(int j=0; j<picture[0].length; j++){
                if(picture[i][j]=='B' && rowCount[i]==1 && colCount[j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}
