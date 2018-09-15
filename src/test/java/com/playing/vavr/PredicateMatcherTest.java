package com.playing.vavr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PredicateMatcherTest {

    @Test
    public void should_match_with_integer() {
        final String result = PredicateMatcher.matchWithInteger(2);

        assertEquals("two", result);
    }


    @Test
    public void should_match_with_integer_and_predicate() {
        final String result = PredicateMatcher.matchWithIntegerWithPredicate(2);

        assertEquals("one_two", result);
    }

    @Test
    public void should_match_pair_integer() {
        final String result = PredicateMatcher.matchWithIntegerWithCustomPredicate(2);

        assertEquals("pair", result);
    }
}