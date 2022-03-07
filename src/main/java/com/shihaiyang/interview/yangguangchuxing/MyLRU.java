package com.shihaiyang.interview.yangguangchuxing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLRU extends LinkedHashMap<String, String> {
    private int capacity;

    public MyLRU(int capacity) {
        // true for access-order.
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    public String put(String key, String value) {
        return super.put(key, value);
    }

    public String get(String key) {
        return super.get(key);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > capacity;
    }
}

class MyLRUTest {
    @Test
    public void testcase1() {
        MyLRU myLRU = new MyLRU(3);
        myLRU.put("a", "a");
        myLRU.put("b", "b");
        myLRU.put("c", "c");
        Assertions.assertEquals(myLRU.get("a"), "a");
        myLRU.put("d", "d");
        Assertions.assertEquals(myLRU.get("b"), null);
    }
}
