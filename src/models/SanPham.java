
package models;


public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private String maLoaiSP;
    private String maMauSac;
    private String maChatLieu;
    private String maKichThuoc;
    private int soLuong;
    private double donGia;
    private String moTa;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, String maLoaiSP, String maMauSac, String maChatLieu, String maKichThuoc, int soLuong, double donGia, String moTa) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.maLoaiSP = maLoaiSP;
        this.maMauSac = maMauSac;
        this.maChatLieu = maChatLieu;
        this.maKichThuoc = maKichThuoc;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.moTa = moTa;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMaLoaiSP() {
        return maLoaiSP;
    }

    public void setMaLoaiSP(String maLoaiSP) {
        this.maLoaiSP = maLoaiSP;
    }

    public String getMaMauSac() {
        return maMauSac;
    }

    public void setMaMauSac(String maMauSac) {
        this.maMauSac = maMauSac;
    }

    public String getMaChatLieu() {
        return maChatLieu;
    }

    public void setMaChatLieu(String maChatLieu) {
        this.maChatLieu = maChatLieu;
    }

    public String getMaKichThuoc() {
        return maKichThuoc;
    }

    public void setMaKichThuoc(String maKichThuoc) {
        this.maKichThuoc = maKichThuoc;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
}
