public class Arrays {
        public static void main(String[] args) {
            int[] numbers = {5, 12, 8, 20, 15};
            int max = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            System.out.println("The largest number is: " + max);
        }
    }



