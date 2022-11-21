
package viewmodels;


public class ThuocTinhView {
    private String loaiThuocTinh;
    private String tenThuocTinh;

    public ThuocTinhView() {
    }

    public ThuocTinhView(String loaiThuocTinh, String tenThuocTinh) {
        this.loaiThuocTinh = loaiThuocTinh;
        this.tenThuocTinh = tenThuocTinh;
    }

    public String getLoaiThuocTinh() {
        return loaiThuocTinh;
    }

    public void setLoaiThuocTinh(String loaiThuocTinh) {
        this.loaiThuocTinh = loaiThuocTinh;
    }

    public String getTenThuocTinh() {
        return tenThuocTinh;
    }

    public void setTenThuocTinh(String tenThuocTinh) {
        this.tenThuocTinh = tenThuocTinh;
    }
    
}
