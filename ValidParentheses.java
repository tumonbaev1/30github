import java.util.Stack;

class ValidParentheses {
     public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();

         for (char c : s.toCharArray()) {
             // Если открывающая скобка – кладём в стек
             if (c == '(' || c == '{' || c == '[') {
                 stack.push(c);
             }
             // Если закрывающая скобка – проверяем стек
             else {
                 if (stack.isEmpty()) {
                     return false; // Нет пары для закрывающей скобки
                 }

                 char openBracket = stack.pop(); // Достаем последнюю открытую скобку

                 // Проверяем, совпадает ли открытая с закрытой
                 if ((c == ')' && openBracket != '(') ||
                         (c == '}' && openBracket != '{') ||
                         (c == ']' && openBracket != '[')) {
                     return false;
                 }
             }
         }

         return stack.isEmpty(); // Если стек пуст – строка валидна
     }

     public static void main(String[] args) {
         ValidParentheses solution = new ValidParentheses();

         // Тесты
         String[] testCases = {"()", "()[]{}", "(]", "([)]", "{[]}", "{[()]}", "]"};

         for (String test : testCases) {
             System.out.println("Is \"" + test + "\" valid? " + solution.isValid(test));
         }
     }
 }


