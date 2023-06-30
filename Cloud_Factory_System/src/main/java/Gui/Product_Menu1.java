/*
 * Created by JFormDesigner on Sun Jun 11 09:02:01 CST 2023
 */

package Gui;

import Program.Catalog;
import Program.CloudSystem;

import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 30894
 */
public class Product_Menu1 extends JFrame {
    public Product_Menu1() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
        formattedTextField1 = new JFormattedTextField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button6 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("\u7c7b\u522b\u540d\u79f0\u67e5\u8be2");

        //---- button2 ----
        button2.setText("\u91cd\u7f6e");

        //---- button3 ----
        button3.setText("\u65b0\u5efa");

        //---- button4 ----
        button4.setText("\u5220\u9664");

        //---- button5 ----
        button5.setText("\u4fee\u6539");

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null},
                },
                new String[] {
                    " ", "ID", "\u7c7b\u522b\u540d\u79f0"
                }
            ) {
                final Class<?>[] columnTypes = new Class<?>[] {
                    Boolean.class, Object.class, Object.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
            scrollPane1.setViewportView(table1);
        }

        //---- button6 ----
        button6.setText("\u8fd4\u56de");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                            .addComponent(button3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 376, Short.MAX_VALUE)
                            .addComponent(button5))
                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                            .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button2)
                            .addGap(0, 298, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(button6)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button2)
                        .addComponent(button1)
                        .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button3)
                        .addComponent(button4)
                        .addComponent(button5))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button6)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        table1.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);


        this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                CloudSystem.getCloudSystem().product_menu1().setVisible(false);
                CloudSystem.getCloudSystem().system_menu().setVisible(true);
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Search_Product_Type(CloudSystem.getCloudSystem(), formattedTextField1.getText());
                formattedTextField1.setText("");
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                table1.setVisible(false);
                table1.setModel(CloudSystem.getCloudSystem().LoadTableModel1_Product(CloudSystem.getCloudSystem().getProduct_Types()));
                table1.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                table1.setVisible(true);
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Add_Product_type(CloudSystem.getCloudSystem());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Delete(CloudSystem.getCloudSystem());
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Change_information(CloudSystem.getCloudSystem());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().product_menu1().setVisible(false);
                CloudSystem.getCloudSystem().system_menu().setVisible(true);
            }
        });
        formattedTextField1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Search_Product_Type(CloudSystem.getCloudSystem(), formattedTextField1.getText());
                    formattedTextField1.setText("");
                }
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
    private JFormattedTextField formattedTextField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public JTable getTable1() {
        return table1;
    }
    public void Delete(CloudSystem cloudSystem) throws FileNotFoundException {
        ArrayList<Integer> selectedRows = new ArrayList<>();
        for (int col = 0; col < table1.getRowCount(); col++) {
            if (((Boolean) table1.getValueAt(col, 0)).booleanValue()) {
                selectedRows.add(col);
            }
        }
        if (selectedRows.size() == 0) {
            JOptionPane.showMessageDialog(null, "请选择要删除的行", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (int i = selectedRows.size() - 1; i >= 0; i--) {
            int row = selectedRows.get(i);
            String product_type = (String) table1.getValueAt(row, 2);
            for(String product_type1:CloudSystem.getCloudSystem().getProduct_Types()){
                if(product_type1.equals(product_type)){
                    CloudSystem.getCloudSystem().getProduct_Types().remove(product_type1);
                    break;
                }
            }
            //CloudSystem.getCloudSystem().getCAs().remove(CloudSystem.getCloudSystem().getCAs().get(row));
            JOptionPane.showMessageDialog(null, "删除成功", null, JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            cloudSystem.Write_Product_Type(CloudSystem.getCloudSystem().getProduct_Types());
            cloudSystem.Load_Product_Type();
            table1.setVisible(false);
            table1.setModel(cloudSystem.LoadTableModel1_Product(CloudSystem.getCloudSystem().getProduct_Types()));
            table1.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            table1.setVisible(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void Change_information(CloudSystem cloudSystem) throws IOException {
        int[] selectedRows = table1.getSelectedRows();
        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(null, "请选择要修改的行", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (int i = selectedRows.length - 1; i >= 0; i--) {
            int row = selectedRows[i];
            DefaultTableModel model = CloudSystem.getCloudSystem().LoadTableModel1_Product(CloudSystem.getCloudSystem().getProduct_Types());
            JTable table = new JTable(model);
            String type = table.getValueAt(row, 2).toString();
            System.out.println(type);
            for(String product_type1:CloudSystem.getCloudSystem().getProduct_Types()){
                System.out.print(product_type1);
                System.out.println(type);
                if(product_type1.equals(type)){
                    System.out.print(product_type1);
                    System.out.println(type);
                    CloudSystem.getCloudSystem().getProduct_Types().change(product_type1, table1.getValueAt(row,2).toString());
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "修改成功", null, JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            cloudSystem.Write_Product_Type(CloudSystem.getCloudSystem().getProduct_Types());
            cloudSystem.Load_Product_Type();
            //table1.setModel(cloudSystem.LoadTableModel1_Device(CloudSystem.getCloudSystem().getDevice_types()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void Search_Product_Type(CloudSystem cloudSystem, String Search_key) {
        Catalog<String> catalog = new Catalog<>();
        for(String type:CloudSystem.getCloudSystem().getProduct_Types()){
            if(type.contains(Search_key)){
                catalog.add(type);
            }
        }
        table1.setVisible(false);
        table1.setModel(cloudSystem.LoadTableModel1_Product(catalog));
        table1.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        table1.setVisible(true);
    }
    public void Add_Product_type(CloudSystem cloudSystem) throws IOException {
        String type_name = JOptionPane.showInputDialog(new JFrame(), "请输入新类型的名称：", "", JOptionPane.PLAIN_MESSAGE);
        if(type_name==null){
            JOptionPane.showMessageDialog(null, "请输入名称", null, JOptionPane.WARNING_MESSAGE);
        }else{
            cloudSystem.getProduct_Types().add(type_name);
            cloudSystem.Write_Product_Type(CloudSystem.getCloudSystem().getProduct_Types());
            cloudSystem.Load_Product_Type();
            table1.setVisible(false);
            table1.setModel(cloudSystem.LoadTableModel1_Product(CloudSystem.getCloudSystem().getProduct_Types()));
            table1.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            table1.setVisible(true);
        }
    }
}
