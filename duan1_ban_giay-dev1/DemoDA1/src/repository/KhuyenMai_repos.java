/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.KhachHang_Model;
import model.KhuyenMai_Model;
import Utilities.JDBC_Helper;
import viewModel.KhuyenMai_View;

/**
 *
 * @author phamtuananh
 */
public class KhuyenMai_repos implements repository.impl.IKhuyenMai_repos {

    @Override
    public List<KhuyenMai_Model> getAllKhuyenMai() {
        List<KhuyenMai_Model> listKm = new ArrayList<>();
        String sql = "select khuyenmai.makm , khuyenmai.ten ,giamgia, NgayBatDau, NgayKetThuc from khuyenmai \n";
        ResultSet rs = JDBC_Helper.Query(sql);
        try {
            while (rs.next()) {
                KhuyenMai_Model KM = new KhuyenMai_Model(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDate(4), rs.getDate(5));
                listKm.add(KM);

            }
            return listKm;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }
    
    public static void main(String[] args) {
        KhuyenMai_repos km = new KhuyenMai_repos();
        System.out.println(km.getKhuyenMaiByMa("KM01").toString());
    }
    @Override
    public int add(KhuyenMai_Model km) {
        String sql = "Insert into khuyenmai(makm, ten,giamgia, ngaybatdau, ngayketthuc) values (?,?,?,?,?)";
        return JDBC_Helper.Update(sql, km.getMa(), km.getTen(), km.getGiamGia(), km.getNgayBatDau(), km.getNgayKetThuc());
    }

    @Override
    public int delete(KhuyenMai_Model km) {
        String sql = " delete from khuyenmai where makm = ?";
        return JDBC_Helper.Update(sql, km.getMa());
    }

    @Override
    public int update(KhuyenMai_Model km) {
        String sql = "update khuyenmai set  ten = ?, giamgia = ?, ngaybatdau = ? , ngayketthuc = ? where makm =?";
        return JDBC_Helper.Update(sql, km.getTen(), km.getGiamGia(), km.getNgayBatDau(), km.getNgayKetThuc(), km.getMa());
    }

    @Override
    public KhuyenMai_Model getKhuyenMaiByMa(String ma) {
        KhuyenMai_Model Km = null;
        String sql = "select khuyenmai.makm , khuyenmai.ten ,giamgia, NgayBatDau, NgayKetThuc from khuyenmai WHERE khuyenmai.makm = ? \n";
        ResultSet rs = JDBC_Helper.Query(sql,ma);
        try {
            while (rs.next()) {
                Km = new KhuyenMai_Model(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDate(4), rs.getDate(5));

            }
            return Km;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }

}
