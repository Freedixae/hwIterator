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

    public static class TodoIterator implements Iterator<Integer> {
        protected Randoms target;

        public TodoIterator(Randoms target) {
            this.target = target;
        }

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            int diff = target.getMax() - target.getMin();
            return  target.getRandom().nextInt(diff + 1) + target.getMin();
        }

        @Override
        public void remove() {
        }
    }
}