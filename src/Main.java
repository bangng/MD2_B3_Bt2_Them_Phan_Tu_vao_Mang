import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {4,2,4,4,2,6,8,6,8,8};
        System.out.println("Enter a value");
        int x = scanner.nextInt();
        System.out.println("Enter index");
        int i = scanner.nextInt();
        if (i <= -1 || i >= array.length - 1){
            System.out.println("Can not insert!!!");
            return;
        }
        System.out.printf("Old array: ");
        for ( int value : array){
            System.out.printf("%-3d",value);
        }
        System.out.printf("%-3d","New array");
        System.arraycopy(array, i, array, i+1, array.length - 1 - i);
        array[i]= x;
        for (int value: array) {
            System.out.printf("%-3d",value);

        }
    }
}
