/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository.impl;

import java.util.List;
import model.SanPham_Model;

/**
 *
 * @author Admin
 */
public interface ISanPham_Repos {
        List<SanPham_Model> GetAllSanPham();
        SanPham_Model GetSanPhamByMa(String ma);
        List<SanPham_Model> serchSP(String key);
    List<SanPham_Model> GetSanPhamByMaKM(String maKM);
    int add(SanPham_Model s);
    int delete(String s);
    int update(SanPham_Model s);
}
