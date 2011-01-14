package com.headexplodes.example.collections.factories;

import com.headexplodes.example.base.part1.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.google.common.collect.Lists.*;
import static com.google.common.collect.Maps.newHashMapWithExpectedSize;
import static com.google.common.collect.Sets.newHashSet;

public class StaticFactoriesWithStaticImports {

    private void standardListConstructor() {

        List<Map<String, Object>> names = new ArrayList<Map<String, Object>>();
    }

    private void typeInference() {
        List<String> names = newArrayList();

    }

    private void goodNamingConventions1() {

        List<String> names = newArrayListWithExpectedSize(42);

    }

    private void goodNamingConventions2() {

        List<String> names = newArrayListWithCapacity(42);

    }

    private void fromVarArgs() {

        List<String> names = newArrayList("Tony Stark", "James Rhodes");

    }

    private void fromIterable(Iterable<String> namesIterable) {

        List<String> names = newArrayList(namesIterable);

    }

    private void set() {

        Set<Employee> employees = newHashSet();

    }

    private void map() {

        Map<String, Employee> employeesById = newHashMapWithExpectedSize(5);

    }

}
