package leetcode;


public class Java121 {
	public static void main(String[] args) {
		int [] prices = new int[]{7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
	 public static int maxProfit(int[] prices) {
	        int max = 0;
	        for(int i =0;i<prices.length;i++) {
	        	for(int j = i+1;j<prices.length;j++) {
	        		if(prices[j]-prices[i]>0&&prices[j]-prices[i]>max) {
	        			max=prices[j]-prices[i];
	        		}
	        	}
	        }
	        return max;
	    }
}
