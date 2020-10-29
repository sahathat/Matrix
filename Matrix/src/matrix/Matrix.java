
package matrix;

public class Matrix {

    public Matrix() {
    }
    
    public void printMatrix(int A[][]){
        System.out.println("[ ");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("]");
    }
    
    public void add(int A[][],int B[][]){
        System.out.println("[ ");
        int[][] Add = null;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("]");
    }
    
    public void subAB(int A[][],int B[][]){
        System.out.println("[ ");
        int[][] Add = null;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.print(A[i][j] - B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("]");
    }
    
    public void subBA(int A[][],int B[][]){
        System.out.println("[ ");
        int[][] Add = null;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.print(B[i][j] - A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("]");
    }
    
    public void transpose(int A[][]){
        System.out.println("[ ");
        int[][] Transpose = null;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.print(A[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("]");
    }
    
}
