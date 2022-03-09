package mwi.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxArraySumTest {

    @Test
    void testCase1() {
        //given
        int[] input = {-2, 1, 3, -4, 5};

        //when
        int result = MaxArraySum.maxSubsetSum(input);

        //then
        assertThat(result).isEqualTo(8);
    }

    @Test
    void testCase2() {
        //given
        int[] input = {2, 1, 5, 8, 4};

        //when
        int result = MaxArraySum.maxSubsetSum(input);

        //then
        assertThat(result).isEqualTo(11);
    }

}