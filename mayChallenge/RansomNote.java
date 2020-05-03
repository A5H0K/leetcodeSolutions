package leetcodeSolutions;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        for(char c : ransomNote.toCharArray()){
			if(magazine.contains(String.valueOf(c))){
				ransomNote = ransomNote.replaceFirst(String.valueOf(c), "");
				magazine = magazine.replaceFirst(String.valueOf(c), "");
			}else{
				break;
			}
		}
        return ransomNote.length() == 0?true : false;
    }
}