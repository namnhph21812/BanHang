/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.KichThuoc_Model;
import viewModel.KichThuoc_View;

/**
 *
 * @author Admin
 */
public interface IKichThuoc_Service {
     List<KichThuoc_View> getAllKichThuoc();
    KichThuoc_Model getByMa(String ma);
    List<KichThuoc_View> Search(String key);
}
