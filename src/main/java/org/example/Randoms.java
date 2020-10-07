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
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int diff = getMax() - getMin();
                return getRandom().nextInt(diff + 1) + getMin();
            }

            @Override
            public void remove() {

            }
        };
    }
}