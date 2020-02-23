package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeWeeklyTestWeek177Question5171 {
	public static void main(String[] args) {
		int[] leftChild = new int[] { 4, -1, 3, -1, -1 };
		int[] rightChild = new int[] { 1, 2, -1, -1, -1 };
		LeetCodeWeeklyTestWeek177Question5171 test = new LeetCodeWeeklyTestWeek177Question5171();
		System.out.println(test.validateBinaryTreeNodes(5, leftChild, rightChild));
	}
	
	/**From LeetCode:
	 * */
	public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int [] index = new int [n];
        for(int i=0;i<n;i++){
            if(leftChild[i]!=-1)
                index[leftChild[i]]++;
            if(rightChild[i]!=-1)
                index[rightChild[i]]++;
        }
        
        int countRootNodes =0;
        int countNotValidNodes = 0;
        for(int i:index){
            if(i>1)
                countNotValidNodes++;
            if(i==0)
                countRootNodes++;
        }
        return countRootNodes==1&&countNotValidNodes==0;
    }

//	/**Three situations return False:
//	 * 1. a positive repeatedly appears
//	 * 2. the last number of leftChild & rightChild is not -1
//	 * 3. 
//	 * 
//	 * Result: runtime: 220ms
//	 * 		   memory: 40.3 MB
//	 * */
//	public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
//		List<Integer> list = new ArrayList<Integer>();
//		// ��Ϊ-1�����ظ����� return false
//		for (int i = 0; i < n; i++) {
//			if (leftChild[i] != -1) {
//				if (list.contains(leftChild[i]))
//					return false;
//				list.add(leftChild[i]);
//			}
//			if (rightChild[i] != -1) {
//				if (list.contains(rightChild[i]))
//					return false;
//				list.add(rightChild[i]);
//			}
//		}
//		// leftChild, rightChildĩ�˲�Ϊ-1 return false
//		if (leftChild[n - 1] != -1 || rightChild[n - 1] != -1)
//			return false;
//		// һ��-1�����³����½ڵ� return false;
//		int cnt = 0;
//		int cntNonNegative = 0;
//		if (leftChild[0] != -1)
//			cntNonNegative++;
//		if (rightChild[0] != -1)
//			cntNonNegative++;
//		int index = 1;
//		while (index != n ) {
//			for (int i = 0; i < cntNonNegative; i++) {
//
//				if (leftChild[i + index] != -1)
//					cnt++;
//				if (rightChild[i + index] != -1)
//					cnt++;
//			}
//			index += cntNonNegative;
//			if (cnt == 0 && index != n )
//				return false;
//			cntNonNegative = cnt;
//			cnt=0;
//		}
//
//		return true;
//	}

}
