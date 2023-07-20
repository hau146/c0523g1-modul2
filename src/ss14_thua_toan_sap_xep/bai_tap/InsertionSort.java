package ss14_thua_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static int[] number = {5, 4, 2, 1, 3};

    public static void inertionSort(int[] list) {
        System.out.println("Mảng ban đầu " + Arrays.toString(list));
        for (int i = 1; i < list.length; i++) { //chạy vòng lặp từ thằng thứ 2 đến lenght-1
            int temp = list[i]; //phần tử tại ví trí đó cho vào biến tạm để tránh lúc chèn vào bị mất giá trị
            System.out.println("\ntemp nhận: " + list[i]);
            int j = i - 1; //biến này để so sánh với phần tử liền trước list[i]
            while (j >= 0 && list[j] > temp) { //dk1 để chèn khi nào tới số bé hơn thì thoát, dk2 để xem nếu i-1 > i thì mới dc tráo vị trí
                System.out.println("j nhận: " + list[j]);
                System.out.print("Vì " + list[j] + " > " + temp + "\t");
                System.out.print("nên temp sẽ thế vào " + list[j] + "\n");
                System.out.println("\t\t\tj sẽ thế vào " + list[j + 1] + "\n");
                list[j + 1] = list[j]; //nếu thỏa thì số đứng trước temp sẽ dịch lên 1 bước
                j--; //cứ lặp đến khi j < 0 sẽ thoát
            }
            list[j + 1] = temp; //khi thoát rồi thì gán temp vào list[i]
            System.out.println("Kết thúc lần sắp xếp " + i + " tới lần sắp xếp thứ " + (i + 1));
            System.out.println("Mảng bây giờ hiện đang " + Arrays.toString(list));
            //lặp cho tới khi nào dk flase thì thoát
        }
        System.out.println("\nMảng sau khi được sắp xếp xong");
        System.out.println(Arrays.toString(list));
    }

    public static void main(String[] args) {
        inertionSort(number);
    }
}
