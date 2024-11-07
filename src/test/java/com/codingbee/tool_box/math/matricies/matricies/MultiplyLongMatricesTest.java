package com.codingbee.tool_box.math.matricies.matricies;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.math.matrices.Matrices;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MultiplyLongMatricesTest {
    // Functional tests
    @Test
    public void multiplyTest1(){
        long[][] expected = new long[][]{{6, 6, 6}, {6, 6, 6}};

        long[][] matrix1 = new long[][]{{2, 2, 2}, {2, 2, 2}};
        long[][] matrix2 = new long[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        long[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest2(){
        long[][] expected = new long[][]{{9, 9}, {9, 9}, {9, 9}};

        long[][] matrix1 = new long[][]{{3, 3}, {3, 3}, {3, 3}};
        long[][] matrix2 = new long[][]{{1, 1}, {2, 2}};

        long[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest3(){
        long[][] expected = new long[][]{{10, 10, 10}, {10, 10, 10}};

        long[][] matrix1 = new long[][]{{5, 0, 5}, {0, 5, 5}};
        long[][] matrix2 = new long[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        long[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest4(){
        long[][] expected = new long[][]{{13, 20}, {23, 36}};

        long[][] matrix1 = new long[][]{{2, 3}, {4, 5}};
        long[][] matrix2 = new long[][]{{2, 4}, {3, 4}};

        long[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest5(){
        long[][] expected = new long[][]{{28, 39}, {56, 78}};

        long[][] matrix1 = new long[][]{{5, 6}, {10, 12}};
        long[][] matrix2 = new long[][]{{2, 3}, {3, 4}};

        long[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest6(){
        long[][] expected = new long[][]{{22, 29}, {46, 61}};

        long[][] matrix1 = new long[][]{{3, 4}, {7, 8}};
        long[][] matrix2 = new long[][]{{2, 3}, {4, 5}};

        long[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }


    // Edge case: null pointer passed
    @Test
    public void multiplyTest7(){
        long[][] matrix2 = new long[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(null, matrix2));
    }

    @Test
    public void multiplyTest8(){
        long[][] matrix1 = new long[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, null));
    }

    @Test
    public void multiplyTest9(){
        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply((long[][]) null, null));
    }


    // Edge case: wrong dimensions
    @Test
    public void multiplyTest10(){
        long[][] matrix1 = new long[][]{{3, 4}, {7, 8}};
        long[][] matrix2 = new long[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest11(){
        long[][] matrix1 = new long[][]{{3, 4, 1, 2}, {7, 8, 1, 2}, {0, 0, 1, 3}};
        long[][] matrix2 = new long[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest12(){
        long[][] matrix1 = new long[][]{{3}, {7}};
        long[][] matrix2 = new long[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }


    // Edge case: irregular matrix
    @Test
    public void multiplyTest13(){
        long[][] matrix1 = new long[][]{{3, 2, 4}, {7, 0}};
        long[][] matrix2 = new long[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest14(){
        long[][] matrix1 = new long[][]{{3, 2, 4}, {7, 0, 1}};
        long[][] matrix2 = new long[][]{{2, 3, 2, 3}, {4, 5}, {2, 4, 3, 0}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest15(){
        long[][] matrix1 = new long[][]{{3, 2, 4}, {7, 0, 2}};
        long[][] matrix2 = new long[][]{{2, 3}, {4}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }
}