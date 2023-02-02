package com.rloup.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

class MyHashSet {

    private final List<Integer> setList;

    public MyHashSet() {
        setList = new ArrayList<>();
    }

    public void add(int key) {
        if(!setList.contains(key)) setList.add(key);
    }

    public void remove(int key) {
        if(setList.contains(key)) setList.remove((Integer) key);
    }

    public boolean contains(int key) {
        return setList.contains(key);
    }
}