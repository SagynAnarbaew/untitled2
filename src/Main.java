public class Main {
    public static void main(String[] args) {
        double[] fractionalNumber = {24.34, -14.72, 3.00, 8.7, -5.5, 46.1, 88.9, -9.6, 27.45, -6.3, -1.8, -55.2, 47.03, 34.00};
        double average = 0.0;
        int count = 0;

        for (int i = 0; i < fractionalNumber.length; i++)
        {if (fractionalNumber[i] < 0) {


            for (int i1 = i + 1; i < fractionalNumber.length; i++) {
                if (fractionalNumber[i] > 0) {

                    average = average + fractionalNumber[i];
                    count++;

                }
            }
        }
        }
        System.out.println(+ average / count);
    }
}