/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ThuongHieu_Model;
import Utilities.JDBC_Helper;

/**
 *
 * @author Admin
 */
public class ThuongHieu_repos implements repository.impl.IThuongHieu_Repos{
     @Override
    public List<ThuongHieu_Model> getAllThuongHieu() {
        List<ThuongHieu_Model> list = new ArrayList<>();
        String sql = "SELECT * FROM thuonghieu";
        ResultSet rs = JDBC_Helper.Query(sql);
        try {
            while (rs.next()) {
                list.add(new ThuongHieu_Model(rs.getString(1), rs.getString(2)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public ThuongHieu_Model getThuongHieuByMa1(String ma) {
        ThuongHieu_Model TH = null;
        String sql = "SELECT * FROM thuonghieu WHERE MaThuongHieu = ?";
        ResultSet rs = JDBC_Helper.Query(sql, ma);
        try {
            while (rs.next()) {
                TH = new ThuongHieu_Model(rs.getString(1), rs.getString(2));
            }
            return TH;
        } catch (SQLException ex) {
            return null;
        }
    }

    @Override
    public int Add(ThuongHieu_Model th) {
        String sql = "insert into thuonghieu(MaThuongHieu,Ten) values(?,?)";
        return JDBC_Helper.Update(sql, th.getMa(), th.getTen());
    }

    @Override
    public int update(ThuongHieu_Model th) {
        String sql = "Update thuonghieu Set MaThuongHieu = ?, Ten = ? Where MaThuongHieu = ?";
        return JDBC_Helper.Update(sql, th.getMa(), th.getTen(), th.getMa());
    }

    @Override
    public int delete(String ma) {
        String sql = "Delete from thuonghieu Where MaThuongHieu = ?";
        return JDBC_Helper.Update(sql, ma);
    }

    @Override
    public List<ThuongHieu_Model> Search(String key) {
        List<ThuongHieu_Model> lst = new ArrayList<>();
        String sql = "SELECT * FROM giay_effot.thuonghieu where MaThuongHieu like concat('%',?,'%')\n"
                + "or Ten like concat('%',?,'%')";
        ResultSet rs = JDBC_Helper.Query(sql, key, key);
        try {
            while (rs.next()) {
                lst.add(new ThuongHieu_Model(rs.getString(1), rs.getString(2)));
            }
            return lst;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
