package com.cg.practice;

import java.util.Arrays;

public class MyHashSet {

    private static int INITAL_SIZE = 10;
    private int count;
    private Object[] items;

    public int size() {
        return count;
    }

    public void add(Object item) {
        if (items == null) {
            items = new Object[INITAL_SIZE];
        }

        if (contains(item)) {
            return;
        }

        if (count == items.length) {
            grow();
        }

        items[count] = item;
        count++;
    }

    public boolean contains(Object item) {
        for (Object obj : items) {
            if (item.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public void remove(Object item) {

        if (items == null || size() == 0 || !contains(item)) {
            return;
        }

        Object[] tempItems = new Object[count - 1];
        int i = 0, j = 0;
        while (j < size()) {
            if (!item.equals(items[j])) {
                tempItems[i] = items[j];
                i++;
            }
            j++;
        }
        count--;
        items = tempItems;
    }

    private void grow() {

        items = Arrays.copyOf(this.items, count + 10);
    }
}
