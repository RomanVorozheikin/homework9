package ru.roman;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        int arr[] = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + "рублей");
    }

    private static void task2() {
        int arr[] = generateRandomArray();
        int maxSum = 50_000;
        int minSum=200_000;
        for (final int curent : arr) {
            if (maxSum < curent) {
                maxSum = curent;
            }
            if (minSum>curent){
                minSum=curent;
            }
        }
        System.out.println(String.format("Минимальная сумма трат за месяц составила %s рублей. Максимальная сумма трат за месяц составила %s рублей",minSum,maxSum));
    }

    private static void task3(){
        int arr[]=generateRandomArray();
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила "+sum/ arr.length+" рублей");
    }

    private static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}