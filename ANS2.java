import java.util.Scanner;

public class ANS2 {
    public static int calculateMaxSumPath(int[] arrayX, int[] arrayY) {
        int lengthX = arrayX.length;
        int lengthY = arrayY.length;

        int indexX = 0, indexY = 0;
        int sumX = 0, sumY = 0, result = 0;

        while (indexX < lengthX && indexY < lengthY) {
            if (arrayX[indexX] < arrayY[indexY]) {
                sumX += arrayX[indexX++];
            } else if (arrayX[indexX] > arrayY[indexY]) {
                sumY += arrayY[indexY++];
            } else {
                result += Math.max(sumX, sumY) + arrayX[indexX];
                sumX = 0;
                sumY = 0;
                indexX++;
                indexY++;
            }
        }

        while (indexX < lengthX)
            sumX += arrayX[indexX++];

        while (indexY < lengthY)
            sumY += arrayY[indexY++];

        result += Math.max(sumX, sumY);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of array X: ");
        int lengthX = scanner.nextInt();
        int[] arrayX = new int[lengthX];
        System.out.println("Enter the elements of array X:");
        for (int i = 0; i < lengthX; i++) {
            arrayX[i] = scanner.nextInt();
        }

        System.out.print("Enter the length of array Y: ");
        int lengthY = scanner.nextInt();
        int[] arrayY = new int[lengthY];
        System.out.println("Enter the elements of array Y:");
        for (int i = 0; i < lengthY; i++) {
            arrayY[i] = scanner.nextInt();
        }

        int maxSum = calculateMaxSumPath(arrayX, arrayY);

        System.out.println("The maximum sum path is: " + maxSum);

        scanner.close();
    }
}
