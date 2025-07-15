class Solution {
    public boolean isValid(String word) {
        if(word==null || word.length()<3){
            return false;
        }
        boolean isVowel=false;
        boolean isConsonant=false;
        String str="aeiouAEIOU";
        for(char ch:word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(str.indexOf(ch)!=-1){
                isVowel=true;
            }
            else if(Character.isLetter(ch)){
                isConsonant=true;
            }
        }
        return isVowel && isConsonant;
    }
}