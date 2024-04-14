/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class KichThuoc_Model {
     private float ma;
    private float us;
    private int chieuDai;

    public KichThuoc_Model() {
    }

    public KichThuoc_Model(float ma, float us, int chieuDai) {
        this.ma = ma;
        this.us = us;
        this.chieuDai = chieuDai;
    }

    public float getMa() {
        return ma;
    }

    public void setMa(float ma) {
        this.ma = ma;
    }

    public float getUs() {
        return us;
    }

    public void setUs(float us) {
        this.us = us;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }
    
}
