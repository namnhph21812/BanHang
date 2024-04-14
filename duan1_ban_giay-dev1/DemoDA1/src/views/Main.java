package views;

import java.awt.Panel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.NhanVien_Model;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import service.impl.NhanVien_Service;
import views.Dang_nhap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import service.INhanVien_Service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author 84353
 */
public class Main extends javax.swing.JFrame {

    INhanVien_Service nv_sv = new NhanVien_Service();
    private JPanel childPanel;
    public static NhanVien_Model nv = null;
    Dang_nhap dn = new Dang_nhap();
    public static boolean guiBC = false;

    /**
     * Creates new form KhungGiaoDien
     */
    public Main() {
        initComponents();

        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblNhanVien = new javax.swing.JLabel();
        lblBanHang = new javax.swing.JLabel();
        lblKH = new javax.swing.JLabel();
        lblSanPham = new javax.swing.JLabel();
        lblKhuyenMai = new javax.swing.JLabel();
        lblThongKe = new javax.swing.JLabel();
        lblDangXuat = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblTenNV = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        lblDoiMK = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        PnlMain = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 120, 217));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(2, 120, 217));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cửa Hàng Bán Giày EFFORT");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sneakerLogo2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(2, 120, 217));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        lblNhanVien.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(2, 120, 217));
        lblNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhanVien.setText("Nhân Viên");
        lblNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 120, 217)));
        lblNhanVien.setOpaque(true);
        lblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseClicked(evt);
            }
        });

        lblBanHang.setBackground(new java.awt.Color(255, 255, 255));
        lblBanHang.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblBanHang.setForeground(new java.awt.Color(2, 120, 217));
        lblBanHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanHang.setText("Bán Hàng");
        lblBanHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 120, 217)));
        lblBanHang.setOpaque(true);
        lblBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBanHangMouseClicked(evt);
            }
        });

        lblKH.setBackground(new java.awt.Color(255, 255, 255));
        lblKH.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblKH.setForeground(new java.awt.Color(2, 120, 217));
        lblKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKH.setText("Khách Hàng");
        lblKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 120, 217)));
        lblKH.setOpaque(true);
        lblKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKHMouseClicked(evt);
            }
        });

        lblSanPham.setBackground(new java.awt.Color(255, 255, 255));
        lblSanPham.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(2, 120, 217));
        lblSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPham.setText("Sản Phẩm");
        lblSanPham.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 120, 217)));
        lblSanPham.setOpaque(true);
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
            }
        });

        lblKhuyenMai.setBackground(new java.awt.Color(255, 255, 255));
        lblKhuyenMai.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblKhuyenMai.setForeground(new java.awt.Color(2, 120, 217));
        lblKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhuyenMai.setText("Khuyến Mãi");
        lblKhuyenMai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 120, 217)));
        lblKhuyenMai.setOpaque(true);
        lblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKhuyenMaiMouseClicked(evt);
            }
        });

        lblThongKe.setBackground(new java.awt.Color(255, 255, 255));
        lblThongKe.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(2, 120, 217));
        lblThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongKe.setText("Thống Kê");
        lblThongKe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 120, 217)));
        lblThongKe.setOpaque(true);
        lblThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongKeMouseClicked(evt);
            }
        });

        lblDangXuat.setBackground(new java.awt.Color(255, 255, 255));
        lblDangXuat.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblDangXuat.setForeground(new java.awt.Color(2, 120, 217));
        lblDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDangXuat.setText("Đăng Xuất");
        lblDangXuat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 120, 217)));
        lblDangXuat.setOpaque(true);
        lblDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseClicked(evt);
            }
        });

        lblTenNV.setBackground(new java.awt.Color(255, 255, 255));
        lblTenNV.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTenNV.setForeground(new java.awt.Color(2, 120, 217));
        lblTenNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenNV.setOpaque(true);
        lblTenNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTenNVMouseClicked(evt);
            }
        });

        lblChucVu.setBackground(new java.awt.Color(255, 255, 255));
        lblChucVu.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        lblChucVu.setForeground(new java.awt.Color(2, 120, 217));
        lblChucVu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChucVu.setOpaque(true);
        lblChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChucVuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblDoiMK.setBackground(new java.awt.Color(255, 255, 255));
        lblDoiMK.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        lblDoiMK.setForeground(new java.awt.Color(2, 120, 217));
        lblDoiMK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoiMK.setText("Đổi Mật Khẩu");
        lblDoiMK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 120, 217)));
        lblDoiMK.setOpaque(true);
        lblDoiMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDoiMKMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
            .addComponent(lblKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDoiMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblKH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBanHang, lblNhanVien});

        jPanel4.setBackground(new java.awt.Color(2, 120, 217));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        PnlMain.setBackground(new java.awt.Color(255, 255, 255));
        PnlMain.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sneakerLogo2.png"))); // NOI18N
        PnlMain.add(jLabel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMouseClicked
        // TODO add your handling code here:
        fillPanel(new QLDonHang());
        lblBanHang.setHorizontalAlignment(JLabel.RIGHT);
    }//GEN-LAST:event_lblBanHangMouseClicked

    private void lblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseClicked
      
        fillPanel(new NhanVien());
        lblNhanVien.setHorizontalAlignment(JLabel.RIGHT);

    }//GEN-LAST:event_lblNhanVienMouseClicked

    private void lblKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKHMouseClicked
        // TODO add your handling code here:
        fillPanel(new KhachHang());
        lblKH.setHorizontalAlignment(JLabel.RIGHT);
    }//GEN-LAST:event_lblKHMouseClicked

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        // TODO add your handling code here:
        QLSanPham sp = new QLSanPham();
        fillPanel(sp);
        lblSanPham.setHorizontalAlignment(JLabel.RIGHT);
        NhanVien_Model nv = nv_sv.getByMa(lblTenNV.getText().split("")[0]);
        if (nv.getChucVu().getTen().equalsIgnoreCase("Nhân Viên")) {
            JButton btn[] = {sp.btnThemSP, sp.btnSuaSP, sp.btnXoaSP, sp.btnClearSP, sp.btnThemPL, sp.btnSuaPL, sp.btnXoaPL, sp.btnClearPL,sp.btnMoreMau,sp.btnMorePL,sp.btnMoreSize,sp.btnMoreTH};
//      
            for (JButton jButton : btn) {
                jButton.setEnabled(false);
            }
        }
    }//GEN-LAST:event_lblSanPhamMouseClicked

    private void lblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhuyenMaiMouseClicked
        // TODO add your handling code here:
        fillPanel(new QLKhuyenMai());
        lblKhuyenMai.setHorizontalAlignment(JLabel.RIGHT);
    }//GEN-LAST:event_lblKhuyenMaiMouseClicked

    private void lblDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseClicked
        // TODO add your handling code here:
        if (guiBC == false) {
            int comfirm = JOptionPane.showConfirmDialog(this, "Hôm nay bạn chưa gửi báo cáo?\nBạn có muốn gửi", "Gửi Báo Cáo", JOptionPane.YES_NO_OPTION);
            if (comfirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Gửi Báo Cáo Thành công");
            }
            dn.setVisible(true);
            this.dispose();
        } else {
            dn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblDangXuatMouseClicked

    private void lblTenNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTenNVMouseClicked
        // TODO add your handling code here:
        NhanVien_Model nv = nv_sv.getByMa(lblTenNV.getText().split(" ")[0]);
        ChiTietNV ctnv = new ChiTietNV();
        ctnv.lblChucVu.setText(nv.getChucVu().getTen());
        ctnv.lblMa.setText(nv.getMa());
        ctnv.lblDiaChi.setText(nv.getDiaChi());
        ctnv.lblGioiTinh.setText(nv.getGioiTinh());
        ctnv.lblNhanVien.setText(nv.getHoTen());
        ctnv.lblSDT.setText(nv.getSđt());
        ctnv.lblNgaySinh.setText(nv.getNgaySinh() + "");
        JFrame frameChild = new JFrame();
        frameChild.setSize(320, 370);
        frameChild.setLocationRelativeTo(null);
        frameChild.add(ctnv);
        frameChild.setVisible(true);

    }//GEN-LAST:event_lblTenNVMouseClicked

    private void lblChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChucVuMouseClicked
        // TODO add your handling code here:
        NhanVien_Model nv = nv_sv.getByMa(lblTenNV.getText().split(" ")[0]);
        ChiTietNV ctnv = new ChiTietNV();
        ctnv.lblChucVu.setText(nv.getChucVu().getTen());
        ctnv.lblMa.setText(nv.getMa());
        ctnv.lblDiaChi.setText(nv.getDiaChi());
        ctnv.lblGioiTinh.setText(nv.getGioiTinh());
        ctnv.lblNhanVien.setText(nv.getHoTen());
        ctnv.lblSDT.setText(nv.getSđt());
        ctnv.lblNgaySinh.setText(nv.getNgaySinh() + "");
        JFrame frameChild = new JFrame();
        frameChild.setSize(320, 370);
        frameChild.setLocationRelativeTo(null);
        frameChild.add(ctnv);
        frameChild.setVisible(true);
    }//GEN-LAST:event_lblChucVuMouseClicked

    private void lblDoiMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoiMKMouseClicked
        // TODO add your handling code here:
        //        fillPanel(new DoiMK_in_Main());
        //        lblDoiMK.setHorizontalAlignment(JLabel.RIGHT);
    }//GEN-LAST:event_lblDoiMKMouseClicked

    private void lblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseClicked
        // TODO add your handling code here:
        //        NhanVien_Model nv = nv_sv.getByMa(lblTenNV.getText().split(" ")[0]);
        //        TK tk = new TK();
        //        fillPanel(new TK());
        //        lblThongKe.setHorizontalAlignment(JLabel.RIGHT);
        //        if (nv.getChucVu().getTen().equalsIgnoreCase("nhân viên")) {
            //            tk.tabTK.removeAll();
            //            tk.pnlLoaiThoiGian.removeAll();
            //            tk.cboLoaiTG.setEnabled(false);
            //        }
    }//GEN-LAST:event_lblThongKeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblBanHang;
    public javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDoiMK;
    private javax.swing.JLabel lblKH;
    private javax.swing.JLabel lblKhuyenMai;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSanPham;
    public static javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblThongKe;
    // End of variables declaration//GEN-END:variables
    public void SetAlignCenter() {
        lblBanHang.setHorizontalAlignment(JLabel.CENTER);
        lblKH.setHorizontalAlignment(JLabel.CENTER);
        lblNhanVien.setHorizontalAlignment(JLabel.CENTER);
        lblSanPham.setHorizontalAlignment(JLabel.CENTER);
        lblKhuyenMai.setHorizontalAlignment(JLabel.CENTER);
        lblThongKe.setHorizontalAlignment(JLabel.CENTER);
        lblDangXuat.setHorizontalAlignment(JLabel.CENTER);
        lblDoiMK.setHorizontalAlignment(JLabel.CENTER);
    }

    public void fillPanel(JPanel pnl) {
        childPanel = pnl;
        PnlMain.removeAll();
        PnlMain.add(childPanel);
        PnlMain.validate();
        SetAlignCenter();
    }
//    public boolean phanQuyen(){
//        
//    }
}
