package mwi.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.list;

class TwoDimArrasHourglassTest {

    @Test
    void testExample1() {
        List<List<Integer>> input = list(
                list(-9, -9, -9, 1, 1, 1),
                list(0, -9, 0, 4, 3, 2),
                list(-9, -9, -9, 1, 2, 3),
                list(0, 0, 8, 6, 6, 0),
                list(0, 0, 0, -2, 0, 0),
                list(0, 0, 1, 2, 4, 0)
        );

        int result = TwoDimArrasHourglass.hourglassSum(input);

        assertThat(result).isEqualTo(28);
    }


}