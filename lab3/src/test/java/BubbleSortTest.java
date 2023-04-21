import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {
    int[] arr1;
    int[] arr2;
    int[] arr3;

    @Before
    public void setUp(){
        arr1 = new int[]{-5, 155, 70, -134, 13};
        arr2 = new int[]{-134, -5, 13, 70, 155};
        arr3 = new int[]{0, 0, 0, 0, 0};
    }

    @Test
    public void test1(){
        int[] result = {-134, -5, 13, 70, 155};
        Assert.assertArrayEquals("Тест пройден",result, Main.BubbleSort(arr1));
    }
    @Test
    public void test2(){
        int[] result = {-134, -5, 13, 70, 155};
        Assert.assertArrayEquals("Тест пройден",result, Main.BubbleSort(arr2));
    }
    @Test
    public void test3(){
        int[] result = {0, 0, 0, 0, 0};
        Assert.assertArrayEquals("Тест пройден",result, Main.BubbleSort(arr3));
    }
}