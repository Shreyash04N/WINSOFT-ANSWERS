import java.util.*;

public class ANS1 {
    public static void mergeArrays(int[] arrayX, int[] arrayY, int sizeX, int sizeY) {
        int indexX = sizeX - 1;
        for (int i = sizeX - 1; i >= 0; i--) {
            if (arrayX[i] != 0) {
                arrayX[indexX] = arrayX[i];
                indexX--;
            }
        }

        int i = indexX + 1;
        int j = 0;
        int indexMerged = 0;

        while (i < sizeX && j < sizeY) {
            if (arrayX[i] < arrayY[j]) {
                arrayX[indexMerged++] = arrayX[i++];
            } else {
                arrayX[indexMerged++] = arrayY[j++];
            }
        }

        while (j < sizeY) {
            arrayX[indexMerged++] = arrayY[j++];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first array (X): ");
        int sizeX = scanner.nextInt();
        int[] arrayX = new int[sizeX];
        System.out.println("Enter the elements of array X:");
        for (int i = 0; i < sizeX; i++) {
            arrayX[i] = scanner.nextInt();
        }

        System.out.print("Enter the length of the second array (Y): ");
        int sizeY = scanner.nextInt();
        int[] arrayY = new int[sizeY];
        System.out.println("Enter the elements of array Y:");
        for (int i = 0; i < sizeY; i++) {
            arrayY[i] = scanner.nextInt();
        }

        mergeArrays(arrayX, arrayY, sizeX, sizeY);

        System.out.println("Merged array:");
        for (int num : arrayX) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}