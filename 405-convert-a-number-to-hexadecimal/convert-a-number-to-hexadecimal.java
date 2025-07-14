class Solution {
    public String toHex(int num) {

        if (num == 0) return "0";

        StringBuilder str = new StringBuilder();
        char[] hexChars = "0123456789abcdef".toCharArray();

        while (num != 0) {
            int rem = num & 15; 
            str.append(hexChars[rem]); 
            num >>>= 4;         
        }

        return str.reverse().toString(); 
    }

}