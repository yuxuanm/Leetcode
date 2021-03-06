package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Java118 {

	public static void main(String[] args) {
		Java118 j = new Java118();
		j.generate(5);

	}

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> sumList = new ArrayList<List<Integer>>();

		for (int i = 0; i < numRows; i++) {
			if (i == 0) {
				List<Integer> list = new ArrayList<Integer>();
				list.add(1);
				sumList.add(list);
				continue;
			}
			if (i == 1) {
				List<Integer> list2 = new ArrayList<Integer>();
				list2.add(1);
				list2.add(1);
				sumList.add(list2);
				continue;
			}
			
			ArrayList<Integer> pre = (ArrayList<Integer>) sumList.get(i - 1);
			List<Integer> cur = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0)
					cur.add(1);
				if (j != 0 && j != i) {
					cur.add(pre.get(j - 1) + pre.get(j));
				}
				if (j == i) {
					cur.add(1);
				}
			}
			sumList.add(cur);

		}
		return sumList;

	}
}
