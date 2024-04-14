/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.KhachHang_Model;
import viewModel.KhachHang_View;

/**
 *
 * @author admin
 */
public interface IKhachHang_Service {
    List<KhachHang_View> getAllKhachHang();
    KhachHang_Model getBySĐT(String SĐT);
    List<KhachHang_View> FindKhachHang(String keyWord);
    int addKH(KhachHang_Model kh);
    int delKH(String sdt);
    int updateKH(KhachHang_Model kh);
}
