package leetcodeSolutions;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int firstUniqChar(String s) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		int length = s.length();
		for (int i = 0; i < length; i++) {
			String t = String.valueOf(s.charAt(i));
			if (!map.containsKey(t)) {
				map.put(t, i);
			} else {
				map.put(t, -1);
			}
		}

		int min = Integer.MAX_VALUE;
		for (String v : map.keySet()) {

			if (map.get(v) > -1 && map.get(v) < min) {
				min = map.get(v);
			}
		}
		return min == Integer.MAX_VALUE ? -1 : min;
	}
}
