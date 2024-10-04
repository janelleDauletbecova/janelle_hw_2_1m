import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Выводит запросы
        for (int i = 0; i < 5; i++) {
            int age = generateRandomAge();
            double temperature = (Math.random() * 60) - 20;
            System.out.println("Результат для возраста: " + age + " лет и температуры " +
                    temperature + " градусов: " + permission(age, temperature));
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }


    public static String permission(int age, double temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "Можно идти гулять";
        } else if
        (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять";
        } else if
        (age > 45 && (temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}