public class ArrayMethodDemo {

    public static void main(String[] args) {
        int[] myNumbers = {100, 200, 150, 125, 50, 75, 25};

        displayAll(myNumbers);
        displayInReverse(myNumbers);
        displaySum(myNumbers);
        displayLessThan(myNumbers, 100);
        displayGreaterThanAverage(myNumbers);
    }

    public static void displayAll(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    public static void displayInReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void displaySum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Sum: " + sum);
    }

    public static void displayLessThan(int[] arr, int limit) {
        System.out.print("Values less than " + limit + ": ");
        for (int num : arr) if (num < limit) System.out.print(num + " ");
        System.out.println();
    }

    public static void displayGreaterThanAverage(int[] arr) {
        double average = calculateAverage(arr);
        System.out.print("Values greater than average (" + average + "): ");
        for (int num : arr) if (num > average) System.out.print(num + " ");
        System.out.println();
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return (double) sum / arr.length;
    }
}


// I know exercise 4 tells us to add a musican, collegecourse and song.
// and I have them here, 
// Musician: Mitski
// College Course: IT2650 - Java Programming
// Song: "Smells Like Teen Spirit" by Nirvana
// but i dont see how I am supposed to implement it