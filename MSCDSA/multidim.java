public class multidim {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];

        int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // System.out.print(arr2[0][0]);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
