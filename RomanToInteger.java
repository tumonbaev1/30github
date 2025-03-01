import java.util.HashMap;
import java.util.Map;

class RomanToInteger{
    public int romanToInt(String s){
        Map<Character, Integer> romanMap= new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total= 0;
        int prevValue= 0;

        for (int i = s.length() -1; i >= 0 ; i-- ){
            int current = romanMap.get(s.charAt(i));

            if (current < prevValue) {
                total -= current;
            }else{
                total += current;

            }
            prevValue = current;
            }
        return total;
        }
        public  static void main(String[] args){
        RomanToInteger solution = new RomanToInteger();
            System.out.println("III -> " + solution.romanToInt("III")); // Ожидаемый результат: 3
            System.out.println("LVIII -> " + solution.romanToInt("LVIII")); // Ожидаемый результат: 58
            System.out.println("MCMXCIV -> " + solution.romanToInt("MCMXCIV")); // Ожидаемый результат: 1994
            System.out.println("IX -> " + solution.romanToInt("IX")); // Ожидаемый результат: 9
            System.out.println("XL -> " + solution.romanToInt("XL")); // Ожидаемый результат: 40
            System.out.println("CD -> " + solution.romanToInt("CD")); // Ожидаемый результат: 400

        }


}