package org.example;

import java.util.Iterator;

public class TodoIterator implements Iterator<Integer> {
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
