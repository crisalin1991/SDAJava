package testing.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayStringsExerciceTest {

    @Test
    void shoudReplaceInString() {
        //Given
        String imputText3 = "Textul pe care testam";
        String expectedResult = "Textul:pe:care:testam";
        ArrayStringsExercice arrayEx = new ArrayStringsExercice();
        //When
        String actualResult = arrayEx.changeSpaceInString(imputText3);
        //Then
        assertEquals(expectedResult, actualResult);
    }

    public int[] replaceEvenNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] / 2;
            }
        }
        return array;
    }

}