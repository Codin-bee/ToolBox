package com.codingbee.tool_box.math.matricies.matricies;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.math.matrices.Matrices;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MultiplyFloatMatricesTest {
    // Functional tests
    @Test
    public void multiplyTest1(){
        float[][] expected = new float[][]{{6, 6, 6}, {6, 6, 6}};

        float[][] matrix1 = new float[][]{{2, 2, 2}, {2, 2, 2}};
        float[][] matrix2 = new float[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        float[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest2(){
        float[][] expected = new float[][]{{9, 9}, {9, 9}, {9, 9}};

        float[][] matrix1 = new float[][]{{3, 3}, {3, 3}, {3, 3}};
        float[][] matrix2 = new float[][]{{1, 1}, {2, 2}};

        float[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest3(){
        float[][] expected = new float[][]{{10, 10, 10}, {10, 10, 10}};

        float[][] matrix1 = new float[][]{{5, 0, 5}, {0, 5, 5}};
        float[][] matrix2 = new float[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        float[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest4(){
        float[][] expected = new float[][]{{13, 20}, {23, 36}};

        float[][] matrix1 = new float[][]{{2, 3}, {4, 5}};
        float[][] matrix2 = new float[][]{{2, 4}, {3, 4}};

        float[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest5(){
        float[][] expected = new float[][]{{28, 39}, {56, 78}};

        float[][] matrix1 = new float[][]{{5, 6}, {10, 12}};
        float[][] matrix2 = new float[][]{{2, 3}, {3, 4}};

        float[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest6(){
        float[][] expected = new float[][]{{22, 29}, {46, 61}};

        float[][] matrix1 = new float[][]{{3, 4}, {7, 8}};
        float[][] matrix2 = new float[][]{{2, 3}, {4, 5}};

        float[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }


    // Edge case: null pointer passed
    @Test
    public void multiplyTest7(){
        float[][] matrix2 = new float[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(null, matrix2));
    }

    @Test
    public void multiplyTest8(){
        float[][] matrix1 = new float[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, null));
    }

    @Test
    public void multiplyTest9(){
        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply((float[][]) null, null));
    }


    // Edge case: wrong dimensions
    @Test
    public void multiplyTest10(){
        float[][] matrix1 = new float[][]{{3, 4}, {7, 8}};
        float[][] matrix2 = new float[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest11(){
        float[][] matrix1 = new float[][]{{3, 4, 1, 2}, {7, 8, 1, 2}, {0, 0, 1, 3}};
        float[][] matrix2 = new float[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest12(){
        float[][] matrix1 = new float[][]{{3}, {7}};
        float[][] matrix2 = new float[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }


    // Edge case: irregular matrix
    @Test
    public void multiplyTest13(){
        float[][] matrix1 = new float[][]{{3, 2, 4}, {7, 0}};
        float[][] matrix2 = new float[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest14(){
        float[][] matrix1 = new float[][]{{3, 2, 4}, {7, 0, 1}};
        float[][] matrix2 = new float[][]{{2, 3, 2, 3}, {4, 5}, {2, 4, 3, 0}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest15(){
        float[][] matrix1 = new float[][]{{3, 2, 4}, {7, 0, 2}};
        float[][] matrix2 = new float[][]{{2, 3}, {4}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }
}