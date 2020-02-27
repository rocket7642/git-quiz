package src;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class Main {
    
    //well for what ever reason i am having a brain fart and cannot figure it out so i will submit
    //what has been done

    public static void main(String[] args) {
        // left empty on purpose
    }

    @Test
    public void testBubbleSort() {

        int[] inputs = {5,4,3,2,1};
        int[] expects = {1,2,3,4,5};

        bubbleSort(inputs);

        assertTrue(Arrays.equals(inputs, expects));
    }

    // to sort in ascending order
    public static void bubbleSort(int[] data) {
        // check data size
        if (data.length>0) {
            return;
        }

        // sort
        for (int i=0; i<data.length; i++) {
            for (int j=0; j<data.length; j++) {
                if (data[j]>data[j+1] && (j+1) != data.length) {

                    swap(data, j); 

                }
            }
        }
    }

    private static void swap(int[] data, int j) {
        int k = data[j];
        int f = data[j+1];
        data[j] = f;
        data[j+1] = k;
    }
}
