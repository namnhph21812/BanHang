/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.KichThuoc_Model;
import Utilities.JDBC_Helper;

/**
 *
 * @author Admin
 */
public class KichThuoc_repos implements repository.impl.IKichThuoc_repos{
     @Override
    public List<KichThuoc_Model> getAllKichThuoc() {
        List<KichThuoc_Model> list = new ArrayList<>();
        String sql = "SELECT * FROM kichthuoc;";
        ResultSet rs = JDBC_Helper.Query(sql);
        try {
            while (rs.next()) {
                list.add(new KichThuoc_Model(rs.getFloat(1), rs.getFloat(2), rs.getInt(3)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public KichThuoc_Model getByMa(String ma) {
        KichThuoc_Model KT = null;
        String sql = "SELECT * FROM kichthuoc WHERE MaSize = ?";
        ResultSet rs = JDBC_Helper.Query(sql,ma);
        try {
            while (rs.next()) {
                KT = new KichThuoc_Model(rs.getFloat(1), rs.getFloat(2), rs.getInt(3));
            }
            return KT;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public List<KichThuoc_Model> Search(String key){
        List<KichThuoc_Model> lst = new ArrayList<>();
        String sql = "SELECT * FROM giay_effot.kichthuoc where MaSize like concat('%',?,'%')\n" +
        "or 	Us like concat('%',?,'%') ";
        ResultSet rs = JDBC_Helper.Query(sql,key,key);
        try {
            while (rs.next()) {
                lst.add(new KichThuoc_Model(rs.getFloat(1), rs.getFloat(2), rs.getInt(3)));
            }
            return lst;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
