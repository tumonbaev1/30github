public class Car {
    String brand;  // Марка машины
    String model;  // Модель машины
    int year;      // Год выпуска

    // Конструктор
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Метод для вывода информации
    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model + ", Year: " + year);
    }

}
