package com.example.daiphongpc.myapplication;

public class TapChi extends TaiLieu {
    private int thangPhatHanh;

    public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return getMaTaiLieu()+"-"+getTenNhaXuatBan()+"-"+getSoBanPhatHanh()+"-"+thangPhatHanh;
    }
}
