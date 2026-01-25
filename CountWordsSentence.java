class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxi=0;
        for(String s:sentences){
            int count=1;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j)== ' ') {
                    count++;
                }
            }
            if (count> maxi) {
                maxi = count;
            }
        }
        return maxi;
    }
}


class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxi = 0;

        for (int i = 0; i < sentences.length; i++) {
            int count = 0;

            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    count++;
                }
            }

            maxi = Math.max(maxi, count + 1);
        }

        return maxi;
    }
}
