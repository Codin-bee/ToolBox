package com.codingbee.tool_box.math.matricies.matricies;

import com.codingbee.tool_box.exceptions.IncorrectDataException;
import com.codingbee.tool_box.math.matrices.Matrices;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MultiplyShortMatricesTest {
    // Functional tests
    @Test
    public void multiplyTest1(){
        short[][] expected = new short[][]{{6, 6, 6}, {6, 6, 6}};

        short[][] matrix1 = new short[][]{{2, 2, 2}, {2, 2, 2}};
        short[][] matrix2 = new short[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        short[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest2(){
        short[][] expected = new short[][]{{9, 9}, {9, 9}, {9, 9}};

        short[][] matrix1 = new short[][]{{3, 3}, {3, 3}, {3, 3}};
        short[][] matrix2 = new short[][]{{1, 1}, {2, 2}};

        short[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest3(){
        short[][] expected = new short[][]{{10, 10, 10}, {10, 10, 10}};

        short[][] matrix1 = new short[][]{{5, 0, 5}, {0, 5, 5}};
        short[][] matrix2 = new short[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        short[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest4(){
        short[][] expected = new short[][]{{13, 20}, {23, 36}};

        short[][] matrix1 = new short[][]{{2, 3}, {4, 5}};
        short[][] matrix2 = new short[][]{{2, 4}, {3, 4}};

        short[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest5(){
        short[][] expected = new short[][]{{28, 39}, {56, 78}};

        short[][] matrix1 = new short[][]{{5, 6}, {10, 12}};
        short[][] matrix2 = new short[][]{{2, 3}, {3, 4}};

        short[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }

    @Test
    public void multiplyTest6(){
        short[][] expected = new short[][]{{22, 29}, {46, 61}};

        short[][] matrix1 = new short[][]{{3, 4}, {7, 8}};
        short[][] matrix2 = new short[][]{{2, 3}, {4, 5}};

        short[][] received = Matrices.multiply(matrix1, matrix2);

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], received[i]);
        }
    }


    // Edge case: null pointer passed
    @Test
    public void multiplyTest7(){
        short[][] matrix2 = new short[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(null, matrix2));
    }

    @Test
    public void multiplyTest8(){
        short[][] matrix1 = new short[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, null));
    }

    @Test
    public void multiplyTest9(){
        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply((short[][]) null, null));
    }


    // Edge case: wrong dimensions
    @Test
    public void multiplyTest10(){
        short[][] matrix1 = new short[][]{{3, 4}, {7, 8}};
        short[][] matrix2 = new short[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest11(){
        short[][] matrix1 = new short[][]{{3, 4, 1, 2}, {7, 8, 1, 2}, {0, 0, 1, 3}};
        short[][] matrix2 = new short[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest12(){
        short[][] matrix1 = new short[][]{{3}, {7}};
        short[][] matrix2 = new short[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }


    // Edge case: irregular matrix
    @Test
    public void multiplyTest13(){
        short[][] matrix1 = new short[][]{{3, 2, 4}, {7, 0}};
        short[][] matrix2 = new short[][]{{2, 3}, {4, 5}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest14(){
        short[][] matrix1 = new short[][]{{3, 2, 4}, {7, 0, 1}};
        short[][] matrix2 = new short[][]{{2, 3, 2, 3}, {4, 5}, {2, 4, 3, 0}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }

    @Test
    public void multiplyTest15(){
        short[][] matrix1 = new short[][]{{3, 2, 4}, {7, 0, 2}};
        short[][] matrix2 = new short[][]{{2, 3}, {4}, {2, 4}};

        Assertions.assertThrows(IncorrectDataException.class, () -> Matrices.multiply(matrix1, matrix2));
    }
}