public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {-1, 2, 0, 5, -7, 6};

        for (int nums : numbers) {
            if (nums > 0) {
                System.out.println(nums);
            }
        }
        System.out.println("Display numbers less then 0:");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println("Replace numbers less then 0 to 0");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
                System.out.println(numbers[i]);
            }
        }
        System.out.println("Display sum of all numbers");

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

    }
}

