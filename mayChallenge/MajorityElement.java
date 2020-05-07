package leetcodeSolutions;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int majorityElement(int[] nums) {

		int size = nums.length;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : nums) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		int max = Integer.MIN_VALUE;

		for (int i : map.keySet()) {

			if (map.get(i) > size / 2) {
				max = i;
			}
		}

		return max;
	}
}
