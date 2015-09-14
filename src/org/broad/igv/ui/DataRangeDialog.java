/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2007-2015 Broad Institute
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/*
 * DataRangeDialog.java
 *
 * Created on March 29, 2008, 9:51 PM
 */

package org.broad.igv.ui;

import org.broad.igv.renderer.DataRange;

import javax.swing.*;
import java.awt.*;

/**
 * @author jrobinso
 */
public class DataRangeDialog extends javax.swing.JDialog {

    private boolean canceled;
    private float min;
    private float base;
    private float max;
    private boolean isLog;

    /**
     * Creates new form DataRangeDialog
     */
    public DataRangeDialog(java.awt.Frame parent, DataRange axisDefinition) {
        super(parent, true);
        this.setLocationRelativeTo(parent);
        initComponents();

        if (axisDefinition != null) {
            min = axisDefinition.getMinimum();
            base = axisDefinition.getBaseline();
            max = axisDefinition.getMaximum();
            isLogCheckBox.setSelected(axisDefinition.isLog());
            minTextField.setText(String.valueOf(min));
            baseTextField.setText(String.valueOf(base));
            maxTextField.setText(String.valueOf(max));
        }
    }

    public void setHideMid(boolean hideMid) {
        baseTextField.setVisible(!hideMid);
        jLabel3.setVisible(!hideMid);
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        minTextField = new javax.swing.JTextField();
        baseTextField = new javax.swing.JTextField();
        maxTextField = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        getRootPane().setDefaultButton(okButton);
        cancelButton = new javax.swing.JButton();
        isLogCheckBox = new JCheckBox();
        isLogLabel = new JLabel("Log scale");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Range");

        jLabel1.setFont(FontManager.getFont(Font.BOLD, 12));
        jLabel1.setText("Data Range");

        jLabel2.setText("Min");

        jLabel3.setText("Mid");

        jLabel4.setText("Max");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                                .add(38, 38, 38)
                                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 299, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createSequentialGroup()
                                .add(77, 77, 77)
                                .add(cancelButton)
                                .add(31, 31, 31)
                                .add(okButton))
                        .add(layout.createSequentialGroup()
                                .add(63, 63, 63)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(jLabel2)
                                        .add(jLabel3)
                                        .add(jLabel4)
                                        .add(isLogLabel))
                                .add(83, 83, 83)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(maxTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 97, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(baseTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 97, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(minTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 97, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(isLogCheckBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 97, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                                .addContainerGap()
                                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(33, 33, 33)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(layout.createSequentialGroup()
                                                .add(jLabel2)
                                                .add(18, 18, 18)
                                                .add(jLabel3))
                                        .add(layout.createSequentialGroup()
                                                .add(minTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(baseTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(12, 12, 12)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                        .add(jLabel4)
                                        .add(maxTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                        .add(isLogLabel)
                                        .add(isLogCheckBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 77, Short.MAX_VALUE)

                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                        .add(cancelButton)
                                        .add(okButton))
                                .add(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if (convertParms()) {
            setVisible(false);
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        canceled = true;
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private boolean convertParms() {
        try {
            min = Float.valueOf(minTextField.getText());
            max = Float.valueOf(maxTextField.getText());
            base = Float.valueOf(baseTextField.getText());
            isLog = isLogCheckBox.isSelected();
            return true;

        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Min, base, and max must be numeric values");
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataRangeDialog dialog = new DataRangeDialog(new javax.swing.JFrame(), null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField baseTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField maxTextField;
    private javax.swing.JTextField minTextField;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

    private JCheckBox isLogCheckBox;
    private JLabel isLogLabel;

    public boolean isCanceled() {
        return canceled;
    }

    public float getMin() {
        return min;
    }

    public float getBase() {
        return base;
    }

    public float getMax() {
        return max;
    }

    public boolean isLog() {
        return isLog;
    }

    public DataRange.Type getDataRangeType(){
        return isLog() ? DataRange.Type.LOG : DataRange.Type.LINEAR;
    }

}
