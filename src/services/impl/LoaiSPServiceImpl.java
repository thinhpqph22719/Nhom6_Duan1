package services.impl;

import java.util.List;
import models.LoaiSanPham;
import repositories.LoaiSPRepository;
import repositories.impl.LoaiSPRepositoryImpl;
import services.LoaiSPService;

public class LoaiSPServiceImpl implements LoaiSPService {

    LoaiSPRepository loaiSPRepository = new LoaiSPRepositoryImpl();

    @Override
    public List<LoaiSanPham> getList() {
        return loaiSPRepository.getAll();
    }

    @Override
    public String add(LoaiSanPham lsp) {
        if (loaiSPRepository.add(lsp)) {
            return "Thêm thành công!";
        }else{
            return "Thêm thất bại!";
        }
    }
        @Override
    public String delete(String tenLSP) {
        if (loaiSPRepository.delete(tenLSP)) {
            return "Xóa thành công!";
        } else {
            return "Xóa thất bại";
        }
    }

    @Override
    public String update(String maLSP, LoaiSanPham tenLSP) {
        LoaiSanPham NewLSP = loaiSPRepository.getLoaiSanPhamByTen(tenLSP.getTenLoaiSP());
        if (NewLSP != null) {
            return "Tên loại sản phẩm đã tồn tại!";
        }
        if (loaiSPRepository.update(maLSP, tenLSP)) {
            return "Cập nhật thành công!";
        } else {
            return "Cập nhật thất bại";
        }
    }

}
