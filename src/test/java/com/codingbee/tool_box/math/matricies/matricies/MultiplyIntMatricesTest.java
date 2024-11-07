package com.codingbee.tool_box.math.matricies.matricies;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.math.matrices.Matrices;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MultiplyIntMatricesTest {
    // Functional tests
    @Test
    public void multiplyTest1(){
        int[][] expected = new int[][]{{6, 6, 6}, {6, 6, 6}};

        int[][] matrix1 = new int[][]{{2, 2, 2}, {2, 2, 2}};
        int[][] matrix2 = new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        int[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest2(){
        int[][] expected = new int[][]{{9, 9}, {9, 9}, {9, 9}};

        int[][] matrix1 = new int[][]{{3, 3}, {3, 3}, {3, 3}};
        int[][] matrix2 = new int[][]{{1, 1}, {2, 2}};

        int[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest3(){
        int[][] expected = new int[][]{{10, 10, 10}, {10, 10, 10}};

        int[][] matrix1 = new int[][]{{5, 0, 5}, {0, 5, 5}};
        int[][] matrix2 = new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        int[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest4(){
        int[][] expected = new int[][]{{13, 20}, {23, 36}};

        int[][] matrix1 = new int[][]{{2, 3}, {4, 5}};
        int[][] matrix2 = new int[][]{{2, 4}, {3, 4}};

        int[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest5(){
        int[][] expected = new int[][]{{28, 39}, {56, 78}};

        int[][] matrix1 = new int[][]{{5, 6}, {10, 12}};
        int[][] matrix2 = new int[][]{{2, 3}, {3, 4}};

        int[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest6(){
        int[][] expected = new int[][]{{22, 29}, {46, 61}};

        int[][] matrix1 = new int[][]{{3, 4}, {7, 8}};
        int[][] matrix2 = new int[][]{{2, 3}, {4, 5}};

        int[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }


    // Edge case: null pointer passed
    @Test
    public void multiplyTest7(){
        int[][] matrix2 = new int[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(null, matrix2));
    }

    @Test
    public void multiplyTest8(){
        int[][] matrix1 = new int[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, null));
    }

    @Test
    public void multiplyTest9(){
        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply((int[][]) null, null));
    }


    // Edge case: wrong dimensions
    @Test
    public void multiplyTest10(){
        int[][] matrix1 = new int[][]{{3, 4}, {7, 8}};
        int[][] matrix2 = new int[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest11(){
        int[][] matrix1 = new int[][]{{3, 4, 1, 2}, {7, 8, 1, 2}, {0, 0, 1, 3}};
        int[][] matrix2 = new int[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest12(){
        int[][] matrix1 = new int[][]{{3}, {7}};
        int[][] matrix2 = new int[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }


    // Edge case: irregular matrix

    @Test
    public void multiplyTest13(){
        int[][] matrix1 = new int[][]{{3, 2, 4}, {7, 0}};
        int[][] matrix2 = new int[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest14(){
        int[][] matrix1 = new int[][]{{3, 2, 4}, {7, 0, 1}};
        int[][] matrix2 = new int[][]{{2, 3, 2, 3}, {4, 5}, {2, 4, 3, 0}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest15(){
        int[][] matrix1 = new int[][]{{3, 2, 4}, {7, 0, 2}};
        int[][] matrix2 = new int[][]{{2, 3}, {4}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }
}
