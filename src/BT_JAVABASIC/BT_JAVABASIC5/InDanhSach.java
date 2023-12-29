package BT_JAVABASIC.BT_JAVABASIC5;

import java.util.ArrayList;
import java.util.List;

public class InDanhSach {
    private List<NhanVien> nhanVienList = new ArrayList<>();

    public void addNhanVien(NhanVien nhanVien) {
        nhanVienList.add(nhanVien);
    }

    public void danhSachNhanVien() {
        NhanVien A = new NhanVien("001", "Anh", 23.4);
        NhanVien B = new NhanVien("002", "Lan", 23.6);
        NhanVien C = new NhanVien("003", "Ngoc", 23.5);
        addNhanVien(A);
        addNhanVien(B);
        addNhanVien(C);

        //In danh sách nhân viên theo vòng FOR Nâng cao
        for (NhanVien nhanVien : nhanVienList) {
            System.out.println("Mã NV: " + nhanVien.getId() + " ; " + "Họ và tên: " + nhanVien.getName() + "; " + "Thu nhập (triệu đồng): " + nhanVien.getSalary());
        }

    }

    public static void main(String[] args) {
        InDanhSach inDanhSach = new InDanhSach();
        System.out.println("In danh sách nhân viên công ty: ");
        inDanhSach.danhSachNhanVien();

        // In danh sách nhân viên theo vòng FOR cơ bản

        System.out.println("In theo cách dùng FOR cơ bản");
        for(int i = 0; i < inDanhSach.nhanVienList.size();i++){
            NhanVien nhanVien = inDanhSach.nhanVienList.get(i);
            System.out.println(nhanVien.getId());
        }
    }
}
