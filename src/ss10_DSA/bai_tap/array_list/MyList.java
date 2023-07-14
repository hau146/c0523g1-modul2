package ss10_DSA.bai_tap.array_list;

import java.io.Serializable;
import java.util.*;
import java.util.function.UnaryOperator;

public class MyList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object elements[];


    public MyList() {
        System.out.println("Khởi tạo thành công mảng có kích thước " + DEFAULT_CAPACITY);
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }


    public MyList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
            System.out.println("Khởi tạo thành công mảng có kích thước " + capacity);
        } else {
            System.out.println("Khởi tạo không thành công");
        }
        size = 0;
    }

    public void add(int index, E element) {
        if (index >= elements.length) { //nếu mà index vượt quá thì sẽ gọi phương thức tăng kích thước mảng
            System.out.println("Mảng đã đầy hãy tăng kích thước mảng");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào kích thước muốn tăng thêm");
            int num = Integer.parseInt(scanner.nextLine());
            this.esusureCapacity(num); //khi tăng xong sẽ add phần tử tại index đó vào mảng đã tăng
            for (int i = elements.length - 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            System.out.println("Đã thêm thành công");
            elements[index] = element;
            size++;
        } else {
            for (int i = elements.length - 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
        System.out.println(Arrays.toString(elements));
    }

    public E remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return (E) Arrays.toString(elements);
    }

    public int size() {
        return size;
    }

    public E clone() {
        Object element2[] = new Object[elements.length];
        for (int i = 0; i < element2.length; i++) {
            element2[i] = elements[i];
        }
        return (E) element2;
    }

    public boolean contanis(E e) {
        for (int i = 0; i < size; i++) {
            if (e == elements[i]) {
                System.out.println("Trong mảng có " + e);
                return true;
            }
        }
        System.out.println("Không có thằng " + e);
        return false;
    }

    public int indexOf(E o) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean add(E e) {
        this.esusureCapacity(1);
        Object temp[] = new Object[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            temp[i] = elements[i];
        }
        temp[temp.length - 1] = e;
        System.out.println(Arrays.toString(temp));
        return true;
    }


    public void esusureCapacity(int minCapacity) {
        if (minCapacity > 0) {
            Object tempArr[] = new Object[elements.length + minCapacity];
            for (int i = 0; i < size; i++) {
                tempArr[i] = elements[i];
            }
            elements = tempArr;
            System.out.println("Mảng đã tăng kích thước lên " + elements.length);
        } else {
            throw new IndexOutOfBoundsException("Không thể tăng kích thước mảng");
        }
//        if (minCapacity > 0){
//            int newSize = elements.length + minCapacity;
//            elements = Arrays.copyOf(elements, newSize);
//            System.out.println("Tăng kích thước mảng thành công có độ dài là: " + elements.length);
//        } else {
//            throw new IndexOutOfBoundsException("Số quá bé không thể tăng kích thước");
//        }
    }


    public E get(int i) {
        return (E) elements[i];
    }

    public void clear() {
        size = 0;
        elements = new Object[size];
        System.out.print(Arrays.toString(elements) + " ");
        System.out.println("Đã xóa thành công");
    }

}
