/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.neu.csye7374.views;

import edu.neu.csye7374.Car;
import edu.neu.csye7374.CarAPI;
import edu.neu.csye7374.Decorator.CarDecorator;
import edu.neu.csye7374.Decorator.DashcamDecorator;
import edu.neu.csye7374.Decorator.SeatCoverDecorator;
import edu.neu.csye7374.Facade.CarOrderFacade;
import edu.neu.csye7374.Observer.CarOrder;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zainabkhokawala
 */
public class OrderPanel extends javax.swing.JPanel {
    private static OrderPanel instance=null;

    
    private CarAPI selectedCar = null;
    private CarOrder currentOrder = null;
    private MainFrame mainFrameRef;
    /**
     * Creates new form StartOrderPanel
     */
    public OrderPanel() {
        initComponents();
        populateCarsTable();
    }
    
    
    public static OrderPanel getInstance(){
        if(instance == null){
            instance= new OrderPanel();
        }
        return instance;
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
        carsTable = new javax.swing.JTable();
        insurance = new javax.swing.JCheckBox();
        dashcam = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        seatcovers = new javax.swing.JCheckBox();
        applyDecoratorsAndNext = new javax.swing.JButton();
        selectCar = new javax.swing.JButton();
        carsRefreshBtn = new javax.swing.JButton();

        carsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Car Id", "Name", "Price", "Category", "Manufacturer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        insurance.setSelected(true);
        insurance.setText("Insurance (Mandatory)");
        insurance.setEnabled(false);
        insurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insuranceActionPerformed(evt);
            }
        });

        dashcam.setText("Dashcam");
        dashcam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashcamActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Additional Modifications");

        seatcovers.setText("Seat Covers");

        applyDecoratorsAndNext.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        applyDecoratorsAndNext.setText("Next");
        applyDecoratorsAndNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                applyDecoratorsAndNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                applyDecoratorsAndNextMouseExited(evt);
            }
        });
        applyDecoratorsAndNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyDecoratorsAndNextActionPerformed(evt);
            }
        });

        selectCar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectCar.setText("Select Car");
        selectCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectCarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectCarMouseExited(evt);
            }
        });
        selectCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCarActionPerformed(evt);
            }
        });

        carsRefreshBtn.setText("Refresh");
        carsRefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carsRefreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(applyDecoratorsAndNext, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insurance)
                                .addGap(18, 18, 18)
                                .addComponent(dashcam)
                                .addGap(18, 18, 18)
                                .addComponent(seatcovers))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selectCar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(carsRefreshBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carsRefreshBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectCar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insurance)
                    .addComponent(dashcam)
                    .addComponent(seatcovers))
                .addGap(49, 49, 49)
                .addComponent(applyDecoratorsAndNext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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

    private void insuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insuranceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insuranceActionPerformed

    private void applyDecoratorsAndNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyDecoratorsAndNextMouseEntered
        // TODO add your handling code here:
        applyDecoratorsAndNext.setBackground(new Color(0,0,0));
        applyDecoratorsAndNext.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_applyDecoratorsAndNextMouseEntered

    private void applyDecoratorsAndNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyDecoratorsAndNextMouseExited
        // TODO add your handling code here:
        applyDecoratorsAndNext.setBackground(new Color(255,255,255));
        applyDecoratorsAndNext.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_applyDecoratorsAndNextMouseExited

    private void applyDecoratorsAndNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyDecoratorsAndNextActionPerformed
        // TODO add your handling code here:
        if(selectedCar == null){
            JOptionPane.showMessageDialog(this, "Please select a car before proceeding");
        }else{
            CarOrderFacade orderFacade = new CarOrderFacade(selectedCar);
            currentOrder= orderFacade.carOrder();
            this.selectedCar = orderFacade.getCar();
            
            System.out.println("Dashcam: "+ dashcam.isEnabled());
            if(dashcam.isSelected()){
                System.out.println("SelectedCar: "+ selectedCar);
                CarDecorator decoratedCar= new DashcamDecorator(selectedCar);
                System.out.println("decoratedCar: "+ decoratedCar);
                this.selectedCar = decoratedCar;
            }
            
            System.out.println("seatcovers: "+ seatcovers.isEnabled());
            if(seatcovers.isSelected()){
                System.out.println("SelectedCar: "+ selectedCar);

                CarDecorator decoratedCar= new SeatCoverDecorator(selectedCar);
                System.out.println("decoratedCar: "+ decoratedCar);

                this.selectedCar = decoratedCar;
            }
            
            OrderSummary os= OrderSummary.getInstance();
            this.mainFrameRef.getMainSplitPanel().setRightComponent(os);
        }
    }//GEN-LAST:event_applyDecoratorsAndNextActionPerformed

    private void selectCarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectCarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_selectCarMouseEntered

    private void selectCarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectCarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_selectCarMouseExited

    private void selectCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCarActionPerformed
        // TODO add your handling code here:
        if(carsTable.getSelectedRow() != -1){
            int selected = carsTable.getSelectedRow();
            int carId = Integer.parseInt(carsTable.getValueAt(selected, 0).toString());
            for(CarAPI car: AddCarsPanel.getInstance().getCarList()){
                if(car.getCarId() == carId){
                    this.selectedCar = car;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a car");
        }
    }//GEN-LAST:event_selectCarActionPerformed

    private void carsRefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carsRefreshBtnActionPerformed
        // TODO add your handling code here:
        populateCarsTable();
    }//GEN-LAST:event_carsRefreshBtnActionPerformed

    private void dashcamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashcamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashcamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyDecoratorsAndNext;
    private javax.swing.JButton carsRefreshBtn;
    private javax.swing.JTable carsTable;
    private javax.swing.JCheckBox dashcam;
    private javax.swing.JCheckBox insurance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox seatcovers;
    private javax.swing.JButton selectCar;
    // End of variables declaration//GEN-END:variables

    private void populateCarsTable(){
        
        DefaultTableModel model = (DefaultTableModel) carsTable.getModel();
        model.setRowCount(0);
        List<CarAPI> carList= AddCarsPanel.getInstance().getCarList();
        System.out.println(carList);
        for(CarAPI car : carList){
            Object[] row = new Object[5];
            
            String[] carString = car.toString().split(",");
            
            for (int i = 0; i < 5; i++) {
                row[i] = carString[i];
            }
            
            model.addRow(row);
        }
    }
}
