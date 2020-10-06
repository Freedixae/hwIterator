package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    private final int max;
    private final int min;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public Random getRandom() {
        return random;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new TodoIterator(this);
    }
}