/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author minhvuong
 */
public class PlSp_Model {
    private PhanLoai_Model phanLoai;
    private SanPham_Model sanPham;

    public PlSp_Model() {
    }

    public PlSp_Model(PhanLoai_Model phanLoai, SanPham_Model sanPham) {
        this.phanLoai = phanLoai;
        this.sanPham = sanPham;
    }

    public PhanLoai_Model getPhanLoai() {
        return phanLoai;
    }

    public void setPhanLoai(PhanLoai_Model phanLoai) {
        this.phanLoai = phanLoai;
    }

    public SanPham_Model getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham_Model sanPham) {
        this.sanPham = sanPham;
    }
    
}
