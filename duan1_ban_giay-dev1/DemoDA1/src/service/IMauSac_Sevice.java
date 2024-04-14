/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.MauSac_Model;
import viewModel.MauSac_View;

/**
 *
 * @author Admin
 */
public interface IMauSac_Sevice {
     List<MauSac_View> getAllMauSac();
    MauSac_Model getByMa(String ma);
    int ADD(MauSac_Model m);
    int DELETE(String ma);
    int UPDATE(MauSac_Model m);
    MauSac_Model GetMauSacByMa(String ma);
    List<MauSac_View> Search(String key);
}
