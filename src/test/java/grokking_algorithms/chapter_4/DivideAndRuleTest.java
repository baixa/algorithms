package grokking_algorithms.chapter_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideAndRuleTest {

    @Test
    void sum() {
        int[] input = new int[] {1, 3, 5, 7, 1, 2};
        int expectOutput = 19;

        assertEquals(expectOutput, DivideAndRule.sum(input));
    }

    @Test
    void count() {
        int[] input = new int[] {1, 3, 5, 7};
        int expectOutput = 4;

        assertEquals(expectOutput, DivideAndRule.count(input));
    }

    @Test
    void max() {
        int[] input = new int[] {1, 3, 1, 2};
        int expectOutput = 3;

        assertEquals(expectOutput, DivideAndRule.max(input));
    }
}