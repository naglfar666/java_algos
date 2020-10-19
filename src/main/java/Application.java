public class Application {

    public static void main(String[] args) {
        int length = 100;

        double[] array = new double[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

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
            avg += array[i]/length;
        }

        System.out.println(">> MAX " + max);
        System.out.println(">> MIN " + min);
        System.out.println(">> AVG " + avg);
    }

}
