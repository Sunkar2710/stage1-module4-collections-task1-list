package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.IntStream.*;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> result = new ArrayList<>();
        range(0, sourceList.size()).filter(index -> (index + 1) % 3 == 0).forEach(index -> {
            result.add(sourceList.get(index));
            result.add(sourceList.get(index));
        });

        return result;
    }
}
