/*
package com.jixuan.tij.holding;

import java.util.*;

*/
/**
 * @author jixuan
 *         Create on 15/5/16.
 *//*

public class MyArrayList extends AbstractList implements List, RandomAccess, Cloneable, java.io.Serializable {
    private int size;
    private transient Object[] elementData;

    public MyArrayList(int initialCapacity) {
        super();
        if (initialCapacity < 0)
            throw new IllegalArgumentException("IllegalArgument Capacity :" + initialCapacity);
        this.elementData = new Object[initialCapacity];
    }

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(Collection c) {
        elementData = c.toArray();
        size = elementData.length;
        if (elementData.getClass() != Object[].class) {
            elementData = Arrays.copyOf(elementData, size, Object[].class);
        }
    }

    // 将当前容量值(elementData.length)设为实际元素个数(size),释放多余的空间
    //每次增加或减少数据库的值时，size都要做相应的变化，所以size是实际元素的个数。
    //但由于扩容的问题，elementData里可能含有null的值，所以有可能elementData.length>size
    public void trimToSize() {
        modCount++;
        int oldCapacity = elementData.length;
        if (size < oldCapacity) {
            elementData = Arrays.copyOf(elementData, size);
        }
    }

    //如果我事先知道我的list里要放多少个元素，就可以用这个方法来提前申请空间，减少后期不断扩容的事件
    public void ensureCapacity(int minCapacity) {
        modCount++;
        int oldCapacity = elementData.length;
        if (minCapacity > oldCapacity) {
            Object[] oldData = elementData;
            int newCapacity = (oldCapacity * 3) / 2 + 1;
            if (minCapacity > newCapacity)
                newCapacity = minCapacity;
            elementData = Arrays.copyOf(oldData, newCapacity);
        }

    }

    @Override
    public E get(int index) {
        RangeCheck(index);
        return (E) elementData[index];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean add(Object object) {
        ensureCapacity(size + 1);// Increments modCount!!
        elementData[size + 1] = object;
        return true;
    }

    public boolean contains(Object object) {
        return indexOf(object) >= 0;
    }

    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elementData[i] == null) {
                    return i;
                }
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elementData[i])) {
                    return i;
                }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size - 1; i >= 0; i--)
                if (elementData[i] == null) {
                    return i;
                }
        } else {
            for (int i = size - 1; i >= 0; i--)
                if (o.equals(elementData[i])) {
                    return i;
                }
        }
        return -1;
    }

    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    @Override
    public T[] toArray(T[] a) {
        if (a.length < size) {
            return (T[]) Arrays.copyOf(elementData, size, a.getClass());
        }
        System.arraycopy(elementData, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;//不懂为什么
        }
        return a;
    }

    public E get(int index) {
        RangeCheck(index);
        return (E) elementData[index];
    }

    public Object set(int index, Object object) {
        RangeCheck(index);
        Object oldValue = elementData[index];
        elementData[index] = object;
        return oldValue;
    }

    public boolean remove(Object o) {
        if (o == null) {
            for (int index = 0; index < size; index++) {
                if (elementData[index] == null) {
                    fastRemove(index);
                    return true;
                }
            }
        } else {
            for (int index = 0; index < size; index++) {
                if (o.equals(elementData[index])) {
                    fastRemove(index);
                    return true;
                }
            }
        }
        return false;
    }

    public Object remove(int index) {
        RangeCheck(index);
        modCount++;
        Object oldValue = (Object) elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null; // Let gc do its work
        return oldValue;
    }

    private void fastRemove(int index) {
        modCount++;
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;// Let gc do its work
    }

    private void RangeCheck(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index : " + index + "Size : " + size);
        }
    }

    // 清空ArrayList，将全部的元素设为null
    public void clear() {
        modCount++;

        for (int i = 0; i < size; i++)
            elementData[i] = null;

        size = 0;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        if (index < 0 || index > c.size()) {
            throw new IndexOutOfBoundsException();
        }
        Object[] a = c.toArray();

        int numNew = a.length;
        ensureCapacity(size + numNew);
        int numMoved = size -index;
        if (numMoved > 0) {
            System.arraycopy(elementData, index, elementData, index + numNew, numMoved);
        }
        System.arraycopy(a, 0, elementData, index, numNew);
        size += numNew;
        return numNew != 0;
    }
    public boolean addAll(Collection c){
        Object[] a = c.toArray();
        int numNew = a.length;
        ensureCapacity(size + numNew);// Increments modCount
        System.arraycopy(a, 0, elementData, size, numNew);
        size += numNew;
        return numNew != 0;
    }

    protected void removeRange(int fromIndex, int toIndex) {
        modCount++;
        int numMoved = size - toIndex;
        System.arraycopy(elementData, toIndex, elementData, fromIndex, numMoved);
        int newSize = size - (toIndex - fromIndex);
        while (size != newSize) {
            elementData[--size] = null;
        }
    }
    public Object clone() {
        try {
            MyArrayList<E> v = (MyArrayList<E>) super.clone();
            // 将当前ArrayList的全部元素拷贝到v中
            v.elementData = Arrays.copyOf(elementData, size);
            v.modCount = 0;
            return v;
        } catch (CloneNotSupportedException e) {
            // this shouldn't happen, since we are Cloneable
            throw new InternalError();
        }
    }
    // java.io.Serializable的写入函数
    // 将ArrayList的“容量，所有的元素值”都写入到输出流中
    private void writeObject(java.io.ObjectOutputStream s)
            throws java.io.IOException{
        // Write out element count, and any hidden stuff
        int expectedModCount = modCount;
        s.defaultWriteObject();

        // 写入“数组的容量”
        s.writeInt(elementData.length);

        // 写入“数组的每一个元素”
        for (int i=0; i<size; i++)
            s.writeObject(elementData[i]);

        if (modCount != expectedModCount) {
            throw new ConcurrentModificationException();
        }

    }


    // java.io.Serializable的读取函数：根据写入方式读出
    // 先将ArrayList的“容量”读出，然后将“所有的元素值”读出
    private void readObject(java.io.ObjectInputStream s)
            throws java.io.IOException, ClassNotFoundException {
        // Read in size, and any hidden stuff
        s.defaultReadObject();

        // 从输入流中读取ArrayList的“容量”
        int arrayLength = s.readInt();
        Object[] a = elementData = new Object[arrayLength];

        // 从输入流中将“所有的元素值”读出
        for (int i=0; i<size; i++)
            a[i] = s.readObject();
    }

}
*/
