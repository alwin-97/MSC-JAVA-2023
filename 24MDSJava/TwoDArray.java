public class TwoDArray {
    public static void main(String[] args) {

        // int[][] arr2 = {{1,2,3},{4,5,6}};

        // System.out.println(arr2[1][1]);

        // for(int i=0;i<2;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(arr2[i][j]+" ");
        //     }
        //     System.out.println("");
        // }

        // JAVA Program to read a matrix and print 

        int[][] arr = new int[2][3];

        for(int i=0;i<2;i++){ // iterate on rows
            for(int j=0;j<3;j++){ // iterate on cols
                arr[i][j] = 10;
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
