package leetcodeSolutions;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public int numJewelsInStones(String J, String S) {
		Set<Character> jewels = new HashSet<Character>();
		int result = 0;
		for (char c : J.toCharArray()) {
			jewels.add(c);
		}
		for (char c : S.toCharArray()) {

			if (jewels.contains(c)) {
				result++;
			}
		}
		return result;
	}
}
