package com.example.demogiuaky.Model;

public class ContactModel {

    private String Name;
    private int MSSV;
    private String Lop;
    private String TenSP;
    private String MaSP;
    private String Gia;

    public ContactModel( String name, int MSSV, String lop, String tenSP, String maSP, String gia) {

        Name = name;
        this.MSSV = MSSV;
        Lop = lop;
        TenSP = tenSP;
        MaSP = maSP;
        Gia = gia;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String maSP) {
        MaSP = maSP;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }
}
