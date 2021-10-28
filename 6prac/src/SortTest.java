import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortTest {
    private Student[] iDNumber;

    @Before
    public void setUp() { // создаем массив студентов размера 5
        iDNumber = new Student[5];
        for (int i = 0; i < iDNumber.length; i++) { // как нибудь его заполняем
            iDNumber[i] = new Student("Student" + i, (int) (Math.random() * 15 + 1));
        }
    }

    @Test
    public void insertionSortTest() {
        Student[] iDNumberTest;
        iDNumberTest = iDNumber;
        insertionSort(iDNumber); // сортировка вставками
        Arrays.sort(iDNumberTest); // встроенная
        for (int i = 0; i < iDNumberTest.length; i++) { // поэлементно сравниваем чтобы совпало
            assertSame(iDNumberTest[i], iDNumber[i]);
        }
    }

    private static void insertionSort(Student[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            Student key = arr[i];
            int j = i - 1;

            while (j > -1 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
