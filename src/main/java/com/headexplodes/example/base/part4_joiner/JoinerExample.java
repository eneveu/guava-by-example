package com.headexplodes.example.base.part4_joiner;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;

import java.util.List;

public class JoinerExample {

    public void test1() {
        List<String> heroes = ImmutableList.of("Kick-Ass", "Iron Man ", "Chuck Norris");

        print(Joiner.on(", ").useForNull("Invisible Man").join(heroes));
    }

    public void test2() {
        List<String> heroes = ImmutableList.of("Kick-Ass", "Iron Man ", null, "Chuck Norris");

        print(Joiner.on(", ").skipNulls().join(heroes));
        // prints "Kick-Ass, Iron Man, Chuck Norris"

        print(Joiner.on(", ").useForNull("Invisible Man").join(heroes));
        // prints "Kick-Ass, Iron Man, Invisible Man, Chuck Norris"

    }

    public void test3() {
        List<String> heroes = ImmutableList.of("Kick-Ass", "Iron Man ", null, "Chuck Norris");

        print(Joiner.on(", ").useForNull("Invisible Man").join(heroes));
    }


    private void print(String join) {
    }
}
