/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository.impl;

import java.util.List;
import model.ThuocTinhSP_Model;

/**
 *
 * @author Admin
 */
public interface IThuocTinhSP_repos {
      List<ThuocTinhSP_Model> GetAllThuocTinhSP();
    ThuocTinhSP_Model getById(String id);
    int undateSL(ThuocTinhSP_Model sp,int SL);
    List<ThuocTinhSP_Model> FilterThuocTinhSP(String keyWord, String maSize, String MaTH,String MaMau, String MaPL);
    int add(ThuocTinhSP_Model t);
    int delete(String id);
    int undate(ThuocTinhSP_Model t);
    List<ThuocTinhSP_Model> GetByMaTT(String maSP); 
}
