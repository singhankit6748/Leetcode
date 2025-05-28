class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length())
            return s;

        StringBuilder[] rowsValue = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++)
            rowsValue[i] = new StringBuilder();

        int currRow = 0;
        boolean isGoingDown = false;

        for (char chr : s.toCharArray()) {
            rowsValue[currRow].append(chr);

            if (currRow == 0 || currRow == numRows - 1)
                isGoingDown = !isGoingDown;

            currRow += (isGoingDown) ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rowsValue) 
            res.append(row);

        return res.toString();
    }
}
