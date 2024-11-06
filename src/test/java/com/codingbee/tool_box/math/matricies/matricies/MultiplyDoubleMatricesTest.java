package com.codingbee.tool_box.math.matricies.matricies;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.math.matrices.Matrices;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MultiplyDoubleMatricesTest {
    //Functional tests
    @Test
    public void multiplyTest1(){
        double[][] expected = new double[][]{{6, 6, 6}, {6, 6, 6}};

        double[][] matrix1 = new double[][]{{2, 2, 2}, {2, 2, 2}};
        double[][] matrix2 = new double[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        double[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest2(){
        double[][] expected = new double[][]{{9, 9}, {9, 9}, {9, 9}};

        double[][] matrix1 = new double[][]{{3, 3}, {3, 3}, {3, 3}};
        double[][] matrix2 = new double[][]{{1, 1}, {2, 2}};

        double[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest3(){
        double[][] expected = new double[][]{{10, 10, 10}, {10, 10, 10}};

        double[][] matrix1 = new double[][]{{5, 0, 5}, {0, 5, 5}};
        double[][] matrix2 = new double[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        double[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest4(){
        double[][] expected = new double[][]{{13, 20}, {23, 36}};

        double[][] matrix1 = new double[][]{{2, 3}, {4, 5}};
        double[][] matrix2 = new double[][]{{2, 4}, {3, 4}};

        double[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest5(){
        double[][] expected = new double[][]{{28, 39}, {56, 78}};

        double[][] matrix1 = new double[][]{{5, 6}, {10, 12}};
        double[][] matrix2 = new double[][]{{2, 3}, {3, 4}};

        double[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest6(){
        double[][] expected = new double[][]{{22, 29}, {46, 61}};

        double[][] matrix1 = new double[][]{{3, 4}, {7, 8}};
        double[][] matrix2 = new double[][]{{2, 3}, {4, 5}};

        double[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }


    //Edge case: null pointer passed
    @Test
    public void multiplyTest7(){
        double[][] matrix2 = new double[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(null, matrix2));
    }

    @Test
    public void multiplyTest8(){
        double[][] matrix1 = new double[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, null));
    }

    @Test
    public void multiplyTest9(){
        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply((double[][]) null, null));
    }


    //Edge case: wrong dimensions
    @Test
    public void multiplyTest10(){
        double[][] matrix1 = new double[][]{{3, 4}, {7, 8}};
        double[][] matrix2 = new double[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest11(){
        double[][] matrix1 = new double[][]{{3, 4, 1, 2}, {7, 8, 1, 2}, {0, 0, 1, 3}};
        double[][] matrix2 = new double[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest12(){
        double[][] matrix1 = new double[][]{{3}, {7}};
        double[][] matrix2 = new double[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }


    //Edge case: irregular matrix

    @Test
    public void multiplyTest13(){
        double[][] matrix1 = new double[][]{{3, 2, 4}, {7, 0}};
        double[][] matrix2 = new double[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest14(){
        double[][] matrix1 = new double[][]{{3, 2, 4}, {7, 0, 1}};
        double[][] matrix2 = new double[][]{{2, 3, 2, 3}, {4, 5}, {2, 4, 3, 0}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest15(){
        double[][] matrix1 = new double[][]{{3, 2, 4}, {7, 0, 2}};
        double[][] matrix2 = new double[][]{{2, 3}, {4}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }
}