class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder ns = new StringBuilder();
        StringBuilder nt = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '#'){
                ns.append(s.charAt(i));
            }
            else{
                if(ns.length() > 0){
                    ns.deleteCharAt(ns.length() - 1);
                }
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) != '#'){
                nt.append(t.charAt(i));
            }
            else{
                if(nt.length() > 0){
                    nt.deleteCharAt(nt.length() - 1);
                }
            }
        }
        return ns.toString().equals(nt.toString());
    }
}