package mwi.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BubbleSortTest {

    @Test
    void passesExample() {
        //given
        List<Integer> input = Arrays.asList(6,4,1);

        //when
        BubbleSort.SortResult result = BubbleSort.doCountSwaps(input);

        //then
        assertThat(result.getSwaps()).isEqualTo(3);
        assertThat(result.getFirst()).isEqualTo(1);
        assertThat(result.getLast()).isEqualTo(6);
    }

    @Test
    void passesExample0() {
        //given
        List<Integer> input = Arrays.asList(1,2,3);

        //when
        BubbleSort.SortResult result = BubbleSort.doCountSwaps(input);

        //then
        assertThat(result.getSwaps()).isEqualTo(0);
        assertThat(result.getFirst()).isEqualTo(1);
        assertThat(result.getLast()).isEqualTo(3);
    }

    @Test
    void passesExampl1() {
        //given
        List<Integer> input = Arrays.asList(3,2,1);

        //when
        BubbleSort.SortResult result = BubbleSort.doCountSwaps(input);

        //then
        assertThat(result.getSwaps()).isEqualTo(3);
        assertThat(result.getFirst()).isEqualTo(1);
        assertThat(result.getLast()).isEqualTo(3);
    }
}