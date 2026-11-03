package it.unibo.inner;

import java.util.Iterator;
import it.unibo.inner.api.IterableWithPolicy;
import it.unibo.inner.api.Predicate;

public class ImplementIterableWithPolicy<T> implements IterableWithPolicy<T> {

    private T[] array;
    private Predicate<T> policy;

    public ImplementIterableWithPolicy(T[] array, Predicate<T> policy) {
        this.array = array;
        this.policy = policy;
    }

    public ImplementIterableWithPolicy(T[] array) {
        this(array, new it.unibo.inner.api.Predicate<T> () {
            public boolean test(T elem) {
                return true;
            } 
        }
        );
    }



    @Override 
    public void setIterationPolicy(Predicate<T> filter) {
    }

    public IterateOverArray iterator() {
        return new IterateOverArray();
    }



    private class IterateOverArray implements Iterator<T> {

        private int currentIndex = 0;

        public boolean hasNext() {
            if(ImplementIterableWithPolicy.this.array.length <= currentIndex){
                return false;
            } else {
                return true;
            }
        }

        public T next() {
            currentIndex++;
            return ImplementIterableWithPolicy.this.array[currentIndex - 1];
        }
    }

}


