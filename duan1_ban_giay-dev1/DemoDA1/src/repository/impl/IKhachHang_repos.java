/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository.impl;

import java.util.List;
import model.KhachHang_Model;

/**
 *
 * @author admin
 */
public interface IKhachHang_repos {
    List<KhachHang_Model> getAllKhachHang();
    KhachHang_Model getBySĐT(String SĐT);
    List<KhachHang_Model> FindKhachHang(String keyWord);
    int addKH(KhachHang_Model kh);
    int delKH(String sdt);
    int updateKH(KhachHang_Model kh);
}
