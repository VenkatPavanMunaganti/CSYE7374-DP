/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.neu.csye7374.views;

import edu.neu.csye7374.Builder.CarBuilder;
import edu.neu.csye7374.Car;
import edu.neu.csye7374.CarAPI;
import edu.neu.csye7374.Manufacturer;
import edu.neu.csye7374.CarCategory;
import edu.neu.csye7374.Factory.CarFactory;
import edu.neu.csye7374.fileUtil.GeneralFileUtil;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pavan munaganti
 */
public class AddMfrPanel extends javax.swing.JPanel {
    private List<Manufacturer> mfrList = new ArrayList<>();
    private static AddMfrPanel instance=null;

    private MainFrame mainFrameRef;
    private static String MFR_FILE_NAME = "MfrData.csv"; 

        
    /**
     * Creates new form AddCarsPanel
     */
    public AddMfrPanel() {
        initComponents();
        loadData();
    }
    
    public static AddMfrPanel getInstance(){
        if(instance == null){
            instance= new AddMfrPanel();
        }
        return instance;
    }

    private void loadData() {
        List<String> rawData = GeneralFileUtil.readFile(MFR_FILE_NAME);
        for (String line : rawData) {
            Manufacturer manufacturer = Manufacturer.getInstance();
            Manufacturer clone = manufacturer.clone();
            clone.setValues(line);
            mfrList.add(clone);
        }
        
        populateMfrTable();
    }
    
    void setMainFrame(MainFrame aThis) {
        this.mainFrameRef = aThis;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mfrTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        estYear = new javax.swing.JTextField();
        bookCreateBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mfrName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        carsSold = new javax.swing.JTextField();

        mfrTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "EST Year", "noOfCarsSold"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mfrTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mfrTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mfrTable);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("EST Year");

        estYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estYearActionPerformed(evt);
            }
        });

        bookCreateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bookCreateBtn.setText("Create");
        bookCreateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookCreateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookCreateBtnMouseExited(evt);
            }
        });
        bookCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookCreateBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Name");

        mfrName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mfrNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cars Sold");

        carsSold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carsSoldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carsSold, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(estYear, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mfrName, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bookCreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mfrName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carsSold, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(estYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addComponent(bookCreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(231, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mfrTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mfrTableMouseClicked
//        // TODO add your handling code here:
//        if(booksTable.getSelectedRow() != -1){
//            Book book = booksList.get(booksTable.getSelectedRow());
//            carId.setText(book.getId());
//            carName.setText(book.getBookName());
//            carPrice.setText(book.getBookAuthor());
//            carMfr.setText(book.getBookPublisher());
//            carCategory.setText(String.valueOf(book.getBookEdition()));
//            bookQuantity.setText(String.valueOf(book.getBookQuantity()));
//            booksRemaining.setText(String.valueOf(book.getRemainingBooks()));
//            bookCreateBtn.setEnabled(false);
//            bookUpdateBtn.setEnabled(true);
//            bookDeleteBtn.setEnabled(true);
//            carId.setEnabled(false);
//        }
//        else{
//            carId.setText("");
//            carName.setText("");
//            carPrice.setText("");
//            carMfr.setText("");
//            carCategory.setText("");
//            bookQuantity.setText("");
//            booksRemaining.setText("");
//            bookCreateBtn.setEnabled(true);
//            bookUpdateBtn.setEnabled(false);
//            bookDeleteBtn.setEnabled(false);
//        }

    }//GEN-LAST:event_mfrTableMouseClicked

    private void bookCreateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookCreateBtnMouseEntered
        // TODO add your handling code here:
        bookCreateBtn.setBackground(new Color(0,0,0));
        bookCreateBtn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_bookCreateBtnMouseEntered

    private void bookCreateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookCreateBtnMouseExited
        // TODO add your handling code here:
        bookCreateBtn.setBackground(new Color(255,255,255));
        bookCreateBtn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_bookCreateBtnMouseExited

    private void bookCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookCreateBtnActionPerformed
        // TODO add your handling code here:
        String name= mfrName.getText();
        int noOfCarsSold = Integer.parseInt(carsSold.getText());
        int establishedYear = Integer.parseInt(estYear.getText());

//        if(mfrList.stream().map(mfr -> mfr.getCarId()).toList().contains("id")){
//            JOptionPane.showMessageDialog(this, "Car with this ID already exists");
//            return;
//        }
        Manufacturer manufact = Manufacturer.getInstance();
        Manufacturer man = manufact.clone();
        man.setManufacturerName(name)
           .setManufacturingYear(establishedYear)
           .setNoOfCarsReleased(noOfCarsSold);
        
        mfrList.add(man);
        
        String lineToFile = name + "," + noOfCarsSold + "," + establishedYear;
        GeneralFileUtil.writeFile(MFR_FILE_NAME, lineToFile, false);
        
        mfrName.setText("");
        carsSold.setText("");
        estYear.setText("");
        

//        populateCarsList();
        populateMfrTable();
    }//GEN-LAST:event_bookCreateBtnActionPerformed

    private void mfrNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mfrNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mfrNameActionPerformed

    private void carsSoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carsSoldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carsSoldActionPerformed

    private void estYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estYearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookCreateBtn;
    private javax.swing.JTextField carsSold;
    private javax.swing.JTextField estYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mfrName;
    private javax.swing.JTable mfrTable;
    // End of variables declaration//GEN-END:variables

    private void populateMfrTable(){
        
        DefaultTableModel model = (DefaultTableModel) mfrTable.getModel();
        model.setRowCount(0);
        
        for(Manufacturer mfr : mfrList){
            Object[] row = new Object[4];
            
            String[] mfrString = mfr.toString().split(",");
            
            for (int i = 0; i < 3; i++) {
                row[i] = mfrString[i];
            }
            
            model.addRow(row);
        }
    }
}
