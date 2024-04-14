/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository.impl;

import java.util.List;
import model.NhanVien_Model;

/**
 *
 * @author admin
 */
public interface INhanVien_Repos {
    List<NhanVien_Model> getAllNhanVien();
    List<NhanVien_Model> getNVbyCV(String maCV);
    NhanVien_Model getByMa(String ma);
    NhanVien_Model LoginNhanVien(String ma,String pass);
    List<NhanVien_Model> FindNhanVien(String keyWord);
    int addNV(NhanVien_Model nv);
    int delNV(String manv);
    int updateNV(NhanVien_Model nv);
    int UpdatePassword(NhanVien_Model nv);
}
