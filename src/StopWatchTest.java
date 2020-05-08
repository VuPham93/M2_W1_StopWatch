import java.util.Random;

public class StopWatchTest {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }

        StopWatch.start();
        SelectionSort.sort(array);
        StopWatch.end();

        System.out.println("Time start sort array: " + StopWatch.getStartTime());
        System.out.println("Time finish sort array: " + StopWatch.getEndTime());
        System.out.println("Elapsed time to sort array: " + StopWatch.getElapsedTime());
    }
}
