/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import model.PhanLoai_Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Utilities.JDBC_Helper;

/**
 *
 * @author minhvuong
 */
public class PhanLoai_repos implements repository.impl.IPhanLoai_repos {

    @Override
    public List<PhanLoai_Model> getAllPhanLoai() {
        List<PhanLoai_Model> list = new ArrayList<>();
        String sql = "SELECT * FROM phanloai;";
        ResultSet rs = JDBC_Helper.Query(sql);
        try {
            while (rs.next()) {
                list.add(new PhanLoai_Model(rs.getString(1),rs.getString(2)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public PhanLoai_Model getByMa(String ma) {
    PhanLoai_Model PL = null;
        String sql = "SELECT * FROM phanloai WHERE MaPhanLoai = ?";
        ResultSet rs = JDBC_Helper.Query(sql,ma);
        try {
            while (rs.next()) {
                PL = new PhanLoai_Model(rs.getString(1),rs.getString(2));
            }
            return PL;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
     @Override
    public int add(PhanLoai_Model p){
        String sql = "insert into phanloai(MaPhanLoai,TenPhanLoai) values(?,?)";
        return JDBC_Helper.Update(sql, p.getMa(),p.getTen());
    }

    @Override
    public int update(PhanLoai_Model p){
        String sql = "update phanloai set MaPhanLoai = ?, TenPhanLoai = ? where MaPhanLoai = ?";
        return JDBC_Helper.Update(sql, p.getMa(),p.getTen(),p.getMa());
    }

    @Override
    public int delete(String ma){
        String sql = "delete from giay_effot.phanloai where MaPhanLoai = ?";
        return JDBC_Helper.Update(sql, ma);
    }

    @Override
    public List<PhanLoai_Model> Search(String key){
        List<PhanLoai_Model> list = new ArrayList<>();
        String sql = "SELECT * FROM giay_effot.phanloai where MaPhanLoai like concat('%',?,'%')\n" +
        "or TenPhanLoai like concat('%',?,'%')";
        ResultSet rs = JDBC_Helper.Query(sql,key,key);
        try {
            while (rs.next()) {
                list.add(new PhanLoai_Model(rs.getString(1),rs.getString(2)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
