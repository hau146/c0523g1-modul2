package ss4_class_object.bai_tap.thuc_hanh;

import java.awt.Rectangle;
import java.util.Scanner;

public class LopHinhChuNhat {
    double chieuRong;
    double chieuCao;

    public LopHinhChuNhat(double chieuRong, double chieuCao) {
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    public double tinhDienTich() {
        return this.chieuRong * this.chieuCao;
    }

    public double tinhChuVi() {
        return (this.chieuRong + this.chieuCao) * 2;
    }

    public String display() {
        return "Hình chữ nhật{" + "chiều rộng= " + chieuRong + ", chiều cao= " + chieuCao + "}";
    }
}
