public class DataTypes {
        public static void main(String[] args) {
            String mood = "Great";
            int cupsOfCoffee = 3;
            double bankBalance = 25.50;
            boolean isHungry = true;


            System.out.println("☀️ My day summary ☀️");
            System.out.println("Mood: " + mood);
            System.out.println("Cups of coffee drank: " + cupsOfCoffee);
            System.out.println("Bank balance: $" + bankBalance);
            System.out.println("Am I hungry? " + (isHungry ? "Yes, feed me! 🍕" : "No, I'm full. 😌"));
            

            System.out.println("\nWhat does it all mean?");
            System.out.println("👉 If I drink " + (cupsOfCoffee + 1) + " cups of coffee, I will become a coding machine! 🤖");
            System.out.println("👉 If my bank balance goes below $10, it's time to eat instant noodles... 🍜");
        }

}
