import java.util.Hashtable;
class Solution {
    public int romanToInt(String s) {

        Hashtable<Character, Integer> ht = new Hashtable<>();
        ht.put('I', 1);
        ht.put('V', 5);
        ht.put('X', 10);
        ht.put('L', 50);
        ht.put('C', 100);
        ht.put('D', 500);
        ht.put('M', 1000);

        int sum = 0;
        for(int i = 0; i < s.length() ; i++){
            
            int current = ht.get(s.charAt(i));

            if(i < s.length() - 1 && current < ht.get(s.charAt(i + 1))){
                sum -= current;
            }
            else{
                sum += current;
            }
        }

        return sum;
    }
}