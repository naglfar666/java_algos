public class MinMaxAvg {

    public static void count(double[] array) {
        double max = array[0];
        double min = array[0];
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            avg += array[i]/array.length;
        }

        System.out.println(">> MAX " + max);
        System.out.println(">> MIN " + min);
        System.out.println(">> AVG " + avg);
    }

}
