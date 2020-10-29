
package matrix;

public class MatrixTest {
    
    public static void main(String[] args) {
        int A[][] = {{1,2,3},{4,0,6},{7,8,9}};
        int B[][] = {{1,1,4},{0,2,3},{4,5,7}};
        Matrix m=new Matrix();
        System.out.println("\nMatrix A");
        m.printMatrix(A);
        System.out.println("\nMatrix B");
        m.printMatrix(B);
        System.out.println("\nA transpose");
        m.transpose(A);
        System.out.println("\nB transpose");
        m.transpose(B);
        System.out.println("\nA+B = ");
        m.add(A, B);
        System.out.println("\nA-B = ");
        m.subAB(A, B);
        System.out.println("\nB-A = ");
        m.subBA(A, B);
    }
}
