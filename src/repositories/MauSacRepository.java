package repositories;

import java.util.List;
import models.MauSac;

public interface MauSacRepository {

    List<MauSac> getAll();

    boolean add(MauSac ms);

    boolean update(String maMS, MauSac tenMS);

    boolean delete(String maMS);

    MauSac getMauSacByTen(String tenMS);
}
