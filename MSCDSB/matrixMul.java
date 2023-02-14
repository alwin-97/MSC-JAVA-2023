public class matrixMul {
    public static void main(String[] args) {
        int[][] m1 = {{1,2},{3,4}};
        int[][] m2 = {{1,2},{3,4}};

        // (1*1)+(2*3)    (1*2)+(2*4)
        // (3*1)+(4*3)    (3*2)+(4*4)

        int[][] sol = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int temp = 0;
                for(int k=0;k<2;k++){
                    temp += (m1[i][k]*m2[k][j]);
                }
                sol[i][j] = temp;
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
}
