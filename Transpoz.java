
public class Transpoz {

    static int[][] transpose(int[][] matrix) {
        int a = matrix.length;
        int b = matrix[0].length;
        int[][] result= new int[b][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0 ; j < b; j++) {
                result[j][i]=matrix[i][j];
            }
        }
        return result;
    }
}
