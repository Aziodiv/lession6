package Lession19;

import data.Auto;

public class MyContainerImpl<T> implements MyContainer {

    private T[] elements;

    public MyContainerImpl(T[] autos) {
        this.elements = autos;
    }


    @Override
    public MyIterator<T> iterator() {
        return new MyIteratorImpl();
    }

    private class MyIteratorImpl implements MyIterator<T> {

        private int i = 0;


        @Override
        public boolean hasNext() {
            return i < elements.length;

        }

        @Override
        public T next() {
            T next = elements[i];
            i++;
            return next;
        }
    }
}
