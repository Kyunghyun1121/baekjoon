
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {
        int M, N;
        Scanner scanner = new Scanner(System.in);

        M = scanner.nextInt();
        N = scanner.nextInt();
        int A[];
        A = new int[M+1];
        for (int i = 1; i <= M; i++) {
            A[i] = i;
        }

        int start, end, num;
        for(int i = 0; i < N; i++){
            start = scanner.nextInt();
            end = scanner.nextInt();
            swap(A,start,end);
        }
        for (int i = 1; i <= M; i++) {
            System.out.print(A[i] + " ");
        }



    }

    private static void swap(int[] a, int start, int end) {
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }
}
