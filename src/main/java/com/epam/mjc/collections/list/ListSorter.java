package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Comparator<String> listComp = new ListComparator();
        sourceList.sort(listComp);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

        if (function(Integer.parseInt(a)) > function(Integer.parseInt(b))) {
            return 1;
        } else if (function(Integer.parseInt(a)) < function(Integer.parseInt(b))) {
            return -1;
        } else {
            return Integer.parseInt(a) > Integer.parseInt(b) ? 1 : -1;
        }
    }

    private int function(int a) {
        return 5 * (int) Math.pow(a, 2) + 3;
    }
}
