package com.headexplodes.example.collections.immutability;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import java.util.*;

public class Conciseness {

    private static class SetExample1 {

        private static final Set<Locale> LOCALES =
                Collections.unmodifiableSet(
                        new TreeSet<Locale>(
                                Arrays.asList(Locale.FRANCE, Locale.JAPAN, Locale.GERMAN)));

    }


    private static class SetExample2 {

        private static final Set<Locale> LOCALES = ImmutableSet.of(Locale.FRANCE, Locale.JAPAN, Locale.GERMAN);

    }

    private static class MapExample1 {

        private static final Map<Locale, Integer> LOCALE_RANKS;

        static {
            Map<Locale, Integer> ranks = new HashMap<Locale, Integer>();
            ranks.put(Locale.GERMAN, 1);
            ranks.put(Locale.FRANCE, 2);
            ranks.put(Locale.JAPAN, 3);
            LOCALE_RANKS = Collections.unmodifiableMap(ranks);
        }

    }

    private static class MapExample2 {

        private static final Map<Locale, Integer> LOCALE_RANKS;

        static {
            ImmutableMap.Builder<Locale, Integer> ranks = ImmutableMap.builder();
            ranks.put(Locale.GERMAN, 1);
            ranks.put(Locale.FRANCE, 2);
            ranks.put(Locale.JAPAN, 3);
            LOCALE_RANKS = ranks.build();
        }

    }


    private static class MapExample3 {

        private static final Map<Locale, Integer> LOCALE_RANKS = ImmutableMap.<Locale, Integer>builder()
                                                                    .put(Locale.GERMAN, 1)
                                                                    .put(Locale.FRANCE, 2)
                                                                    .put(Locale.JAPAN, 3)
                                                                    .build();


    }


    private static class MapExample4 {

        private static final Map<Locale, Integer> LOCALE_RANKS = ImmutableMap.of(Locale.GERMAN, 1,
                                                                                 Locale.FRANCE, 2,
                                                                                 Locale.JAPAN, 3);


    }

}
