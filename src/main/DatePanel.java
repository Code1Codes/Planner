/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author KavitaS
 */
public class DatePanel extends javax.swing.JPanel {
    private int month;  
    private int year;

    
    /**
     * Creates new form DatePanel
     */
    public DatePanel(int month, int year) {
        initComponents();
        this.month = month;
        this.year = year;
        init();
    }
    
    private void init(){
       mon.asTitle();       
       tue.asTitle();
       wed.asTitle();
       thu.asTitle();
       fri.asTitle();
       sat.asTitle();
       setDate();

    }
    private void setDate(){
       

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sun = new main.CalenarCell();
        mon = new main.CalenarCell();
        tue = new main.CalenarCell();
        wed = new main.CalenarCell();
        thu = new main.CalenarCell();
        fri = new main.CalenarCell();
        sat = new main.CalenarCell();
        calenarCell9 = new main.CalenarCell();
        calenarCell10 = new main.CalenarCell();
        calenarCell11 = new main.CalenarCell();
        calenarCell12 = new main.CalenarCell();
        calenarCell13 = new main.CalenarCell();
        calenarCell14 = new main.CalenarCell();
        calenarCell15 = new main.CalenarCell();
        calenarCell16 = new main.CalenarCell();
        calenarCell17 = new main.CalenarCell();
        calenarCell18 = new main.CalenarCell();
        calenarCell19 = new main.CalenarCell();
        calenarCell8 = new main.CalenarCell();
        calenarCell20 = new main.CalenarCell();
        calenarCell21 = new main.CalenarCell();
        calenarCell22 = new main.CalenarCell();
        calenarCell23 = new main.CalenarCell();
        calenarCell24 = new main.CalenarCell();
        calenarCell25 = new main.CalenarCell();
        calenarCell26 = new main.CalenarCell();
        calenarCell27 = new main.CalenarCell();
        calenarCell28 = new main.CalenarCell();
        calenarCell29 = new main.CalenarCell();
        calenarCell30 = new main.CalenarCell();
        calenarCell31 = new main.CalenarCell();
        calenarCell32 = new main.CalenarCell();
        calenarCell33 = new main.CalenarCell();
        calenarCell34 = new main.CalenarCell();
        calenarCell35 = new main.CalenarCell();
        calenarCell36 = new main.CalenarCell();
        calenarCell37 = new main.CalenarCell();
        calenarCell38 = new main.CalenarCell();
        calenarCell39 = new main.CalenarCell();
        calenarCell40 = new main.CalenarCell();
        calenarCell41 = new main.CalenarCell();
        calenarCell42 = new main.CalenarCell();
        calenarCell43 = new main.CalenarCell();
        calenarCell44 = new main.CalenarCell();
        calenarCell45 = new main.CalenarCell();
        calenarCell46 = new main.CalenarCell();
        calenarCell47 = new main.CalenarCell();
        calenarCell48 = new main.CalenarCell();
        calenarCell49 = new main.CalenarCell();

        setLayout(new java.awt.GridLayout(7, 7));

        sun.setText("Sun");
        sun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sunActionPerformed(evt);
            }
        });
        add(sun);

        mon.setText("Mon");
        mon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monActionPerformed(evt);
            }
        });
        add(mon);

        tue.setText("Tue");
        tue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tueActionPerformed(evt);
            }
        });
        add(tue);

        wed.setText("Wed");
        wed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(wed);

        thu.setText("Thu");
        thu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(thu);

        fri.setText("Fri");
        fri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friActionPerformed(evt);
            }
        });
        add(fri);

        sat.setText("Sat");
        sat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satActionPerformed(evt);
            }
        });
        add(sat);

        calenarCell9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell9);

        calenarCell10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell10);

        calenarCell11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell11);

        calenarCell12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell12);

        calenarCell13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell13);

        calenarCell14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell14);

        calenarCell15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell15);

        calenarCell16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell16);

        calenarCell17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell17);

        calenarCell18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell18);

        calenarCell19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell19);

        calenarCell8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell8);

        calenarCell20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell20);

        calenarCell21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell21);

        calenarCell22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell22);

        calenarCell23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell23);

        calenarCell24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell24);

        calenarCell25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell25);

        calenarCell26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell26);

        calenarCell27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell27);

        calenarCell28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell28);

        calenarCell29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell29);

        calenarCell30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell30);

        calenarCell31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell31);

        calenarCell32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell32);

        calenarCell33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell33);

        calenarCell34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell34);

        calenarCell35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell35);

        calenarCell36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell36);

        calenarCell37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell37);

        calenarCell38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell38);

        calenarCell39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell39);

        calenarCell40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell40);

        calenarCell41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell41);

        calenarCell42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calenarCell42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calenarCell42ActionPerformed(evt);
            }
        });
        add(calenarCell42);

        calenarCell43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell43);

        calenarCell44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell44);

        calenarCell45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell45);

        calenarCell46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell46);

        calenarCell47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell47);

        calenarCell48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(calenarCell48);

        calenarCell49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calenarCell49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calenarCell49ActionPerformed(evt);
            }
        });
        add(calenarCell49);
    }// </editor-fold>//GEN-END:initComponents

    private void sunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sunActionPerformed

    private void calenarCell49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calenarCell49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calenarCell49ActionPerformed

    private void calenarCell42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calenarCell42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calenarCell42ActionPerformed

    private void tueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tueActionPerformed

    private void friActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_friActionPerformed

    private void satActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_satActionPerformed

    private void monActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.CalenarCell calenarCell10;
    private main.CalenarCell calenarCell11;
    private main.CalenarCell calenarCell12;
    private main.CalenarCell calenarCell13;
    private main.CalenarCell calenarCell14;
    private main.CalenarCell calenarCell15;
    private main.CalenarCell calenarCell16;
    private main.CalenarCell calenarCell17;
    private main.CalenarCell calenarCell18;
    private main.CalenarCell calenarCell19;
    private main.CalenarCell calenarCell20;
    private main.CalenarCell calenarCell21;
    private main.CalenarCell calenarCell22;
    private main.CalenarCell calenarCell23;
    private main.CalenarCell calenarCell24;
    private main.CalenarCell calenarCell25;
    private main.CalenarCell calenarCell26;
    private main.CalenarCell calenarCell27;
    private main.CalenarCell calenarCell28;
    private main.CalenarCell calenarCell29;
    private main.CalenarCell calenarCell30;
    private main.CalenarCell calenarCell31;
    private main.CalenarCell calenarCell32;
    private main.CalenarCell calenarCell33;
    private main.CalenarCell calenarCell34;
    private main.CalenarCell calenarCell35;
    private main.CalenarCell calenarCell36;
    private main.CalenarCell calenarCell37;
    private main.CalenarCell calenarCell38;
    private main.CalenarCell calenarCell39;
    private main.CalenarCell calenarCell40;
    private main.CalenarCell calenarCell41;
    private main.CalenarCell calenarCell42;
    private main.CalenarCell calenarCell43;
    private main.CalenarCell calenarCell44;
    private main.CalenarCell calenarCell45;
    private main.CalenarCell calenarCell46;
    private main.CalenarCell calenarCell47;
    private main.CalenarCell calenarCell48;
    private main.CalenarCell calenarCell49;
    private main.CalenarCell calenarCell8;
    private main.CalenarCell calenarCell9;
    private main.CalenarCell fri;
    private main.CalenarCell mon;
    private main.CalenarCell sat;
    private main.CalenarCell sun;
    private main.CalenarCell thu;
    private main.CalenarCell tue;
    private main.CalenarCell wed;
    // End of variables declaration//GEN-END:variables
}
