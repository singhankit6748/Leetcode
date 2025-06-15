 class Solution {
    public String longestPalindrome(String s) {
        int resIdx=0; // stores the starting index of the longest palindromic        substring found so far
        int resLen=0; // idhar hum length store krenge substring ki kyunki neeche hum original string ki substring return krre hain toh pata honi chahiye length

        int n=s.length(); // length nikal lenge, loop chalane ke liye

        boolean[][] dp=new boolean[n][n]; // bhai dekh boolean table banaenge agrr value true hui toh string mein ek palindromic substring present hai, false matlab nai hai

        for(int i=n-1;i>=0;i--){// yeh end se check krega

            for(int j=i;j<n;j++){// aur yeh i se end tak
                if(s.charAt(i)==s.charAt(j) && (j-i<=2 || dp[i+1][j-1])){// idhar check krenge ki dono character same hai ki nai (j-i<=2) iska matlab agrr string ki length 2 ya usse kam hai toh woh ek palindromic substring hogi
                    dp[i][j]=true; // dp table mein true bhar denge
                    if (resLen < (j - i + 1)) {
                        resIdx = i; // starting index daal denge
                        resLen = j - i + 1; // aur total length substring ki
                    }
                }
            }
        }
        return s.substring(resIdx,resIdx+resLen);
    }
}
