package services.impl;

import java.util.List;
import models.MauSac;
import repositories.MauSacRepository;
import repositories.impl.MauSacRepositoryImpl;
import services.MauSacService;

public class MauSacServiceImpl implements MauSacService {

    MauSacRepository mauSacRepository = new MauSacRepositoryImpl();

    @Override
    public List<MauSac> getList() {
        return mauSacRepository.getAll();
    }

    @Override
    public String add(MauSac ms) {
        if (mauSacRepository.add(ms)) {
            return "Thêm thành công!";
        } else {
            return "Thêm thất bại!";
        }
    }

    @Override
    public String delete(String maMS) {
        if (mauSacRepository.delete(maMS)) {
            return "Xóa thành công!";
        } else {
            return "Xóa thất bại";
        }
    }

    @Override
    public String update(String maMS, MauSac tenMS) {
        MauSac NewMS = mauSacRepository.getMauSacByTen(tenMS.getTenMauSac());
        if (NewMS != null) {
            return "Tên màu sắc đã tồn tại!";
        }
        if (mauSacRepository.update(maMS, tenMS)) {
            return "Cập nhật thành công!";
        } else {
            return "Cập nhật thất bại";
        }
    }
}
