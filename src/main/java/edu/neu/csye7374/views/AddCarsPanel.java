/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.neu.csye7374.views;

import edu.neu.csye7374.Builder.CarBuilder;
import edu.neu.csye7374.Car;
import edu.neu.csye7374.CarAPI;
import edu.neu.csye7374.CarCategory;
import edu.neu.csye7374.Factory.CarFactory;
import edu.neu.csye7374.Manufacturer;
import edu.neu.csye7374.fileUtil.GeneralFileUtil;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.UUID;

/**
 *
 * @author Pavan munaganti
 */
public class AddCarsPanel extends javax.swing.JPanel {

    private List<CarAPI> carList = new ArrayList<>();
    private static AddCarsPanel instance = null;
    private MainFrame mainFrameRef;
    private String CARS_FILE_NAME = "CarsData.txt";
    private static String MFR_FILE_NAME = "MfrData.csv";

    /**
     * Creates new form AddCarsPanel
     */
    public AddCarsPanel() {
        initComponents();
        loadData();
    }

    public static AddCarsPanel getInstance() {
        if (instance == null) {
            instance = new AddCarsPanel();
        }
        return instance;
    }

    public List<CarAPI> getCarList() {
        return this.carList;

    }

    private void loadData() {
        List<String> rawData = GeneralFileUtil.readFile(CARS_FILE_NAME);
        for (String line : rawData) {
            CarBuilder carBuilder = new CarBuilder(line);
            carList.add(carBuilder.build());
        }
        populateCarsTable();
        
        List<String> rawManData = GeneralFileUtil.readFile(MFR_FILE_NAME);
        carManufacturer.removeAllItems();
        for (String line : rawManData) {
            carManufacturer.addItem(line.strip().split(",")[0]);
        }
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
        carsTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        carCreateBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        carName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        carPrice = new javax.swing.JTextField();
        carManufacturer = new javax.swing.JComboBox<>();
        carCategory = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        carsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Car Id", "Name", "Category", "Manufacturer", "Buy Price", "Rent Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        carsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carsTable);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Mfr. Name");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Add Your Car Here");

        carCreateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        carCreateBtn.setText("Create");
        carCreateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                carCreateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carCreateBtnMouseExited(evt);
            }
        });
        carCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carCreateBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Name");

        carName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Category");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Price");

        carPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carPriceActionPerformed(evt);
            }
        });

        carManufacturer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carManufacturerMouseClicked(evt);
            }
        });
        carManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carManufacturerActionPerformed(evt);
            }
        });

        carCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUV", "SPORTS", "MINIVAN", "LIMO", "SEDAN" }));
        carCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carCategoryActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Add Cars");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(354, 354, 354))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(carCreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(carManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(369, 369, 369)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(carName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(carCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(287, 287, 287)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(carCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(carManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(carCreateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(279, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void carsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carsTableMouseClicked
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


    }//GEN-LAST:event_carsTableMouseClicked

    private void carCreateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carCreateBtnMouseEntered
        // TODO add your handling code here:
        carCreateBtn.setBackground(new Color(0, 0, 0));
        carCreateBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_carCreateBtnMouseEntered

    private void carCreateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carCreateBtnMouseExited
        // TODO add your handling code here:
        carCreateBtn.setBackground(new Color(255, 255, 255));
        carCreateBtn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_carCreateBtnMouseExited

    private void carCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carCreateBtnActionPerformed
        // TODO add your handling code here:
        
        int maxId = -1;
        
        for(CarAPI car: carList){
           maxId = Math.max(maxId, car.getCarId());            
        }
        int id = maxId + 1;
        String name = carName.getText();
        double price = Double.parseDouble(carPrice.getText());
        String mfr = carManufacturer.getSelectedItem().toString();
        String category = carCategory.getSelectedItem().toString();
        CarCategory categoryEnumVal = CarCategory.getCarCategory(category.toLowerCase());

//        if(carList.stream().map(car -> car.getCarId()).toList().contains("id")){
//            JOptionPane.showMessageDialog(this, "Car with this ID already exists");
//            return;
//        }
        CarBuilder carBuilder = new CarBuilder(id, name, price, categoryEnumVal, mfr);
        CarAPI car = CarFactory.getInstance().getObject(carBuilder);
        carList.add((Car) car);
//      OperatingSystem.getInstance().writeBooks();

        String lineToFile = id + "," + name + "," + category + "," + mfr + "," + price ;
        GeneralFileUtil.writeFile(CARS_FILE_NAME, lineToFile, false);

        
        carName.setText("");
        carPrice.setText("");
        
        populateCarsTable();


    }//GEN-LAST:event_carCreateBtnActionPerformed

    private void carNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carNameActionPerformed

    private void carPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carPriceActionPerformed

    private void carManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carManufacturerActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_carManufacturerActionPerformed

    private void carCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carCategoryActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void carManufacturerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carManufacturerMouseClicked
        // TODO add your handling code here:
        loadData();
    }//GEN-LAST:event_carManufacturerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> carCategory;
    private javax.swing.JButton carCreateBtn;
    private javax.swing.JComboBox<String> carManufacturer;
    private javax.swing.JTextField carName;
    private javax.swing.JTextField carPrice;
    private javax.swing.JTable carsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateCarsTable() {
        DefaultTableModel model = (DefaultTableModel) carsTable.getModel();
        model.setRowCount(0);

         for(CarAPI car : carList){
            Object[] row = new Object[6];
            
            String[] carString = car.toString().split(",");
            int i;
            for (i = 0; i < 5; i++) {
                row[i] = carString[i];
            }
            row[i] = car.getCarRentPrice();
            
            model.addRow(row);
        }
    }

    void setMainFrame(MainFrame aThis) {
        this.mainFrameRef = aThis;
    }
}
