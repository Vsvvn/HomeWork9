public class Main {
    public static void main(String[] args) {

        System.out.println("Задание № 1");
        int sum = 0;

        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задание № 2");
        int maximumExpensesPerDay = 99_999;
        int minimumExpensesPerDay = 200_001;

        for (int j : arr) {
            if (j > maximumExpensesPerDay) {
                maximumExpensesPerDay = j;
            } else if (j < minimumExpensesPerDay) {
                minimumExpensesPerDay = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maximumExpensesPerDay + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minimumExpensesPerDay + " рублей");

        System.out.println("Задание № 3");
        int averageExpensesPerDay = 0;

        for (int i : arr) {
            averageExpensesPerDay += i / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageExpensesPerDay + " рублей");

        System.out.println("Задание № 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

    //    Генератор массивов из 30 случайных чисел, от 100_000 до 200_000.
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}