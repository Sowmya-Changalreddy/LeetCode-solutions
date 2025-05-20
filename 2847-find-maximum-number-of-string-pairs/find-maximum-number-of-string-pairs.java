class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans=0;
        for (int i=0;i<words.length;i++){
            for (int j=i+1;j<words.length;j++){
                if (words[i].equals("0")){
                    break;
                }
                String rev=findRev(words[j]);
                if (words[i].equals(rev)){
                    ans++;
                    words[j]="0";
                    break;
                }
            }
        }
        return ans;
    }
    public String findRev(String s){
        String s1="";
        for (int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        return s1;
    }
}