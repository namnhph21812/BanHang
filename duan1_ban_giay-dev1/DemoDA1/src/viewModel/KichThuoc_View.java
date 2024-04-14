/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModel;

/**
 *
 * @author Admin
 */
public class KichThuoc_View {
    private int stt;
    private float maSize;
    private float us;
    private int chieuDai;

    public KichThuoc_View() {
    }

    public KichThuoc_View(int stt, float maSize, float us, int chieuDai) {
        this.stt = stt;
        this.maSize = maSize;
        this.us = us;
        this.chieuDai = chieuDai;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public float getMaSize() {
        return maSize;
    }

    public void setMaSize(float maSize) {
        this.maSize = maSize;
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
