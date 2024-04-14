/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.ThuongHieu_Model;
import viewModel.ThuongHieu_View;

/**
 *
 * @author Admin
 */
public interface IThuongHieu_Service {
        List<ThuongHieu_View> getAllThuongHieu();
    int Add(ThuongHieu_Model th);
    ThuongHieu_Model GetThuongHieuByMa(String ma);
    ThuongHieu_Model getByMa(String ma);
    int Delete(String ma);
    int Update(ThuongHieu_Model th);
    List<ThuongHieu_View> Search(String key);
}
