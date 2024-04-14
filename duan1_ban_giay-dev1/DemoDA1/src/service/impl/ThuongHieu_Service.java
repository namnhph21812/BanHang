/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.ThuongHieu_Model;
import repository.ThuongHieu_repos;
import repository.impl.IThuongHieu_Repos;
import viewModel.ThuongHieu_View;

/**
 *
 * @author Admin
 */
public class ThuongHieu_Service implements service.IThuongHieu_Service{
      IThuongHieu_Repos TH_repos = new ThuongHieu_repos();
    List<ThuongHieu_Model> lstTHM;

    @Override
    public List<ThuongHieu_View> getAllThuongHieu() {
        List<ThuongHieu_Model> list = TH_repos.getAllThuongHieu();
        List<ThuongHieu_View> list_view = new ArrayList<>();
        int stt = 1;
        for (ThuongHieu_Model t : list) {
            list_view.add(new ThuongHieu_View(stt, t.getMa(), t.getTen()));
            stt++;
        }
        return list_view;
    }

    @Override
    public ThuongHieu_Model GetThuongHieuByMa(String ma) {
        return TH_repos.getThuongHieuByMa1(ma);
    }

    @Override
    public int Add(ThuongHieu_Model th) {
        return TH_repos.Add(th);
    }

    @Override
    public int Update(ThuongHieu_Model th) {
        return TH_repos.update(th);
    }

    @Override
    public int Delete(String ma) {
        return TH_repos.delete(ma);
    }

    @Override
    public ThuongHieu_Model getByMa(String ma) {
        return TH_repos.getThuongHieuByMa1(ma);

    }

    @Override
    public List<ThuongHieu_View> Search(String key) {
        List<ThuongHieu_Model> list = TH_repos.Search(key);
        List<ThuongHieu_View> list_view = new ArrayList<>();
        int stt = 1;
        for (ThuongHieu_Model t : list) {
            list_view.add(new ThuongHieu_View(stt, t.getMa(), t.getTen()));
            stt++;
        }
        return list_view;
    }
}
