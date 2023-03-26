public class Main {

    public static void main(String[] args) {




        double[] numbers = {6.7, -4.3, 4.8, 4.7,-8.6,-8.9,6.2,7.6,8.6,12.5,-13.4,3.4,13.4,14.5,15.3};

        double GTA4=0;

        int GTA5 =0;

        boolean hook=false;

        for (double gay:numbers){

            if (gay<0){

                hook = true;

            }else if (hook){

                GTA4++;

                GTA5 +=gay;

            }

        }

        System.out.println(GTA5 / GTA4);

    }







    public static void game () {

        int[] arr = {-4, -2, 2, 3, 6, 8};

        for (int i = 0; i < arr.length; i++) ;

        int i = 0;

        int min = arr[i];

        int min_i = i;

        for (int j = i + 1; j < arr.length; j++) {

            if (arr[j] < min) ;

            min = arr[j];

            min_i = j;

            if (i != min_i) {

                int tmp = arr[i];

                arr[i] = arr[min_i];

                arr[min_i] = tmp;

            }

        }

    }

}