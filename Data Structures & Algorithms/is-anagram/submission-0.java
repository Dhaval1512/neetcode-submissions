class Solution {
    
    private String sortString(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    
    public boolean isAnagram(String s, String t) {
    
        String s1 = sortString(s);
        String t1 = sortString(t);

        if(s1.equals(t1)){
            return true;
        }else{
            return false;
        }
    }
}
