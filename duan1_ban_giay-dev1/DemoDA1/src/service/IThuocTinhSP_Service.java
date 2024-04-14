/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.KichThuoc_Model;
import model.SanPham_Model;
import model.ThuocTinhSP_Model;
import viewModel.ThuocTinhSP_View;

/**
 *
 * @author Admin
 */
public interface IThuocTinhSP_Service {
        List<ThuocTinhSP_View> GetAllThuocTinhSP();

    ThuocTinhSP_Model getById(String id);

    int updateSL(ThuocTinhSP_Model sp, int SL);

    List<ThuocTinhSP_View> FilterThuocTinhSP(String keyWord, String maSize, String MaTH, String MaMau,
            String MaPL);

    ThuocTinhSP_Model GetThuongHieuSPByMa(String id);

    int ADD(ThuocTinhSP_Model t);

    int DELETE(String id);

    int UPDATE(ThuocTinhSP_Model t);

    List<SanPham_Model> GetAllSP();

    List<KichThuoc_Model> GetAllKT();

    List<ThuocTinhSP_View> GetByMaTT(String maSP);
}
