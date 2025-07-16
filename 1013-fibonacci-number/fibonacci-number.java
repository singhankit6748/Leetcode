class Solution {
    public int fib(int n) {
		List<Integer> sum = new ArrayList<Integer>();
		int n1 = 0, n2 = 1, n3;
		for(int i = 0; i < n; i++) {
			if (i == 0) sum.add(i);
			if (i == 1) sum.add(i);
			else {
				n3 = n1 + n2;
				sum.add(n3);					
				n1 = n2;
				n2 = n3;
			}		
		}
		return n == 0 ? 0 : sum.get(sum.size()-1);
	}
}