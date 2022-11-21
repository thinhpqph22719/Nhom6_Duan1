
package models;

import java.util.Date;

public class HoaDon {
     private String maHoaDon;
    private String maKhachHang;
    private String maNhanVien;
    private Date ngayTao;
    private double tienShip;
    private double tongTien;
    private String hTThanhToan;
    private String tinhTrang;
    private String ghiChu;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String maKhachHang, String maNhanVien, Date ngayTao, double tienShip, double tongTien, String hTThanhToan, String tinhTrang, String ghiChu) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
        this.ngayTao = ngayTao;
        this.tienShip = tienShip;
        this.tongTien = tongTien;
        this.hTThanhToan = hTThanhToan;
        this.tinhTrang = tinhTrang;
        this.ghiChu = ghiChu;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public double getTienShip() {
        return tienShip;
    }

    public void setTienShip(double tienShip) {
        this.tienShip = tienShip;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String gethTThanhToan() {
        return hTThanhToan;
    }

    public void sethTThanhToan(String hTThanhToan) {
        this.hTThanhToan = hTThanhToan;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

 
}
