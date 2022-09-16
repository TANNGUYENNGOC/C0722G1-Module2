package ss10_dsa_list.excirse.excirse1;

import java.util.Arrays;

public class MyArrayList<E> {
    /**
     * số lượng phần tử có trong MyArrayList
     */
    private int size = 0;

    /**
     * Sức chứa của MyArrayList
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Mảng chứa các phần tử
     */
    public Object elements[];

    /**
     * Sức chứa mặc định khi khởi tạo bằng contrustor không có tham số
     */
    public MyArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Phương thức contrustor với sức chứa được truyền vào
     * @param capacity
     */
    public MyArrayList(int capacity){
        this.size = capacity;
        if(capacity >= 0){
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity: "+capacity);
        }
    }

    /**
     * Phương thức trả về số lượng phần tử
     * @return
     */
    public int size(){
        return this.size;
    }

    /**
     * Phương thức clear  arrayList
     */
    public void clear(){
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    /**Phương thức add 1 phần tử vào MyArrayList
     *
     * @param element
     * @return
     */
    public boolean add(E element){
        if(elements.length == size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return  true;
    }

    /**
     *
     * @param element
     * @param index
     */
    public void add(E element, int index){
        if(index > elements.length){
            throw new IllegalArgumentException("index: "+index);
        } else if(elements.length == size) {
            this.ensureCapacity(10);
        }
        if (elements[index] == null){
            elements[index] = element;
            size++;
        }else {
            for (int i = 0; i >= index ; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }

    }

    /**
     * Phương thức tăng kích thước của MyArrayList
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity){
        if(minCapacity >= 0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("miniCapacity: "+minCapacity);
        }
    }
}
