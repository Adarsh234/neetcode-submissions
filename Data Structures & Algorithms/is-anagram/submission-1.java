class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        ArrayList<Character> l1 = new ArrayList<>();
        ArrayList<Character> l2 = new ArrayList<>();
        char a[] = s.toCharArray();
        for(int i = 0; i < a.length; i++){
            l1.add(a[i]);
        }
        Collections.sort(l1);
        char b[] = t.toCharArray();
        for(int i = 0; i < b.length; i++){
            l2.add(b[i]);
        }
        Collections.sort(l2);
        for(int i = 0; i < l1.size(); i++){
            if(!l1.get(i).equals(l2.get(i))){
                return false;
            }
        }
        return true;
    }
}
