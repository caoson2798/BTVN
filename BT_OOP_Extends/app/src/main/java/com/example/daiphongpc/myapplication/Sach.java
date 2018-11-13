package com.example.daiphongpc.myapplication;

public class Sach extends TaiLieu {
    private String tenTacGia,tenSach;
    private int soTrang;

    public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, String tenSach, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }
    public Sach(){

    }

    public Sach(String tenTacGia, String tenSach, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return getMaTaiLieu()+"-"+getTenNhaXuatBan()+"-"+getSoBanPhatHanh()+"-"+tenTacGia+"-"+tenSach+"-"+soTrang;
    }
}
