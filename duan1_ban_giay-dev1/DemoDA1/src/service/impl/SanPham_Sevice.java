/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.MauSac_Model;
import model.SanPham_Model;
import model.ThuongHieu_Model;
import repository.MauSac_repos;
import repository.SanPham_repos;
import repository.ThuongHieu_repos;
import repository.impl.ISanPham_Repos;
import repository.impl.IThuongHieu_Repos;
import repository.impl.IMauSac_repos;
import viewModel.SanPham_View;
/**
 *
 * @author Admin
 */
public class SanPham_Sevice implements service.ISanPham_Service{
    List<SanPham_Model> list;
    ISanPham_Repos repo = new SanPham_repos();
    IThuongHieu_Repos THrepo = new ThuongHieu_repos();
    IMauSac_repos MSrepo = new MauSac_repos();
     
    @Override
    public List<SanPham_View> GetAllSanPham(){
        List<SanPham_View> lst_view = new ArrayList<>();
        list = repo.GetAllSanPham();
        int stt = 1;
        for(SanPham_Model s : list){
            lst_view.add(new SanPham_View(stt++, s.getMa(), s.getTen(), s.getThuongHieu().getMa(), s.getMauSac().getMa(), s.getMoTa(), s.getGiaNhap(), s.getGiaBan(), s.getTrangThai()));
        }
        return lst_view;
    }
    
    
    
    @Override
    public int ADD(SanPham_Model s){
        return repo.add(s);
    }
    
    @Override
    public int DELETE(String s){
        return repo.delete(s);
    }
    
    @Override
    public int UPDATE(SanPham_Model s){
        return repo.update(s);
    }
    
    @Override
    public List<ThuongHieu_Model> GetAllTH(){
        return THrepo.getAllThuongHieu();
    }
    
    @Override
    public List<MauSac_Model> GetAllMS(){
        return MSrepo.getAllMauSac();
    }

    @Override
    public List<SanPham_Model> GetSanPhamByMaKM(String maKM) {
        return repo.GetSanPhamByMaKM(maKM);
    }

    @Override
    public SanPham_Model getSPByMa(String ma) {
        return repo.GetSanPhamByMa(ma);
    }

    @Override
    public SanPham_Model GetByMa(String ma){
        return repo.GetSanPhamByMa(ma);
    }
    
    
    public List<SanPham_View> Search(String key){
        List<SanPham_View> lst_view = new ArrayList<>();
        list = repo.serchSP(key);
        int stt = 1;
        for(SanPham_Model s : list){
            lst_view.add(new SanPham_View(stt++, s.getMa(), s.getTen(), s.getThuongHieu().getMa(), s.getMauSac().getMa(), s.getMoTa(), s.getGiaNhap(), s.getGiaBan(), s.getTrangThai()));
        }
        return lst_view;
    }
}
