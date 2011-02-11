package com.headexplodes.example.collections.factories;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.headexplodes.example.base.part1.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class StaticFactories {

    private void standardListConstructor() {

        List<Map<String, Object>> names = new ArrayList<Map<String, Object>>();
    }

    private void typeInference() {
        List<Map<String, Object>> names = Lists.newArrayList();

    }

    private void goodNamingConventions1() {

        List<Map<String, Object>> names = Lists.newArrayListWithExpectedSize(42);

    }

    private void goodNamingConventions2() {

        List<Map<String, Object>> names = Lists.newArrayListWithCapacity(42);

    }

    private void fromVarArgs() {

        List<String> names = Lists.newArrayList("Tony Stark", "James Rhodes");

    }

    private void fromIterable(Iterable<String> namesIterable) {

        List<String> names = Lists.newArrayList(namesIterable);

    }

    private void set() {

        Set<Employee> employees = Sets.newHashSet();

    }

    private void map() {

        Map<String, Employee> employeesById = Maps.newHashMapWithExpectedSize(5);

    }

}
