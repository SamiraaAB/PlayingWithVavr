package com.playing.vavr;

import io.vavr.API;
import io.vavr.Predicates;

import static io.vavr.API.*;

public class PredicateMatcher {


    /**
     * Vavr matcher for primitive type
     *
     * @param input
     * @return
     */
    public static String matchWithInteger(final int input) {
        return Match(input).of(
                Case($(1), "one"),
                Case($(2), "two"),
                Case($(3), "three"),
                API.Case(API.$(), "unknown"));
    }

    /**
     * Vavr matcher with predicate
     *
     * @param input
     * @return
     */
    public static String matchWithIntegerWithPredicate(final int input) {
        return Match(input).of(
                Case($(Predicates.isIn(1, 2)), "one_two"),
                Case($(Predicates.isIn(3, 4)), "three_for"),
                API.Case(API.$(), "unknown"));
    }

    /**
     * Vavr matcher with predicate
     *
     * @param input
     * @return
     */
    public static String matchWithIntegerWithCustomPredicate(final int input) {
        return Match(input).of(
                Case($(n -> (n % 2) == 0), "pair"),
                API.Case(API.$(), "impair"));
    }


}
