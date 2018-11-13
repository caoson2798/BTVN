package com.example.daiphongpc.myapplication;

import java.util.Date;

public class Bao extends TaiLieu {
    private int ngayPhatHanh;

    public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return getMaTaiLieu()+"-"+getTenNhaXuatBan()+"-"+getSoBanPhatHanh()+"-"+ngayPhatHanh;
    }
}
