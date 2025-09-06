public class lab_1_1 {
    public static void main(String[] args) {
        int[] nubmers = {1,2,3,4,5,6,7,8,9};
        int sum = 0;


        System.out.print("массив: \n");
        for (int i=0;i<nubmers.length;i++){
            System.out.print(nubmers[i] + " ");
        }
        System.out.println();

        for (int i=0;i<nubmers.length;i++){
            sum+=nubmers[i];
        }

        System.out.print("сумма: " + sum);
        System.out.println();

        System.out.print("ср.арифметическое: " + sum/nubmers.length);
    }
}
