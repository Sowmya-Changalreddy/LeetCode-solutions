class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res=0;
        for (int i=0;i<stones.length();i++){
            boolean found=false;
            for (int j=0;j<jewels.length();j++){
                if (stones.charAt(i)==jewels.charAt(j)){
                    found=true;
                    break;
                }
            }
            if (found){
                res=res+1;
            }
        }
        return res;
    }
}