/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;

/**
 *
 * @author WS
 */
public class Cal_Briones extends javax.swing.JFrame {

    
    private String currentNum = "";
    private String operations = "";
    double secondnum;
    double result;
    
    public Cal_Briones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtnClearEntry = new javax.swing.JButton();
        jbtnClearAll = new javax.swing.JButton();
        jbtnPercent = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();
        jbtnMultiply = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtnAdd = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnPlusMinus = new javax.swing.JButton();
        jbtnDecimal = new javax.swing.JButton();
        jbtnEqual = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtnMinus1 = new javax.swing.JButton();
        jLblDisplay = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CALCULATOR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
        );

        jbtnClearEntry.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtnClearEntry.setText("CE");
        jbtnClearEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearEntryActionPerformed(evt);
            }
        });

        jbtnClearAll.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtnClearAll.setText("C");
        jbtnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearAllActionPerformed(evt);
            }
        });

        jbtnPercent.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtnPercent.setText("%");
        jbtnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPercentActionPerformed(evt);
            }
        });

        jbtnDivide.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtnDivide.setText("/");
        jbtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivideActionPerformed(evt);
            }
        });

        jbtnMultiply.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtnMultiply.setText("*");
        jbtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultiplyActionPerformed(evt);
            }
        });

        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtnAdd.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtnAdd.setText("+");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });

        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtnPlusMinus.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbtnPlusMinus.setText("+/-");
        jbtnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusMinusActionPerformed(evt);
            }
        });

        jbtnDecimal.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtnDecimal.setText(".");
        jbtnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDecimalActionPerformed(evt);
            }
        });

        jbtnEqual.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtnEqual.setText("=");
        jbtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualActionPerformed(evt);
            }
        });

        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtnMinus1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbtnMinus1.setText("-");
        jbtnMinus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinus1ActionPerformed(evt);
            }
        });

        jLblDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblDisplay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLblDisplay.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnClearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnMinus1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnClearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMinus1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void performOperation(String operation, double secondnum) {
    switch (operation) {
        case "+":
            result += secondnum;
            break;
        case "-":
            result -= secondnum;
            break;
        case "*":
            result *= secondnum;
            break;
        case "/":
            if (secondnum != 0) {
                result /= secondnum; 
            }else{
                result = 0;
            }
            break;
        case "%":
            double percentageValue = secondnum;
            result = percentageValue;
            break;
    }
    }

    private void jbtnClearEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearEntryActionPerformed
        if (!currentNum.isEmpty() || !operations.isEmpty()) {
        if (!currentNum.isEmpty()) {
            currentNum = currentNum.substring(0, currentNum.length() - 1);
            jLblDisplay.setText(jLblDisplay.getText().substring(0, jLblDisplay.getText().length() - 1));
        } else if (!operations.isEmpty()) {
            operations = operations.substring(0, operations.length() - 1);
            jLblDisplay.setText(jLblDisplay.getText().substring(0, jLblDisplay.getText().length() - 1));
        }

        result = 0;
        String displayText = jLblDisplay.getText();
        String[] parts = displayText.split("\\+|-|\\*|/|%");
        String lastOperation = "";

        for (int i = 0; i < parts.length; i++) {
            if (i < parts.length - 1) {
                result += Double.parseDouble(parts[i]);
                lastOperation = displayText.replaceAll("[0-9]+", "").substring(0, 1);
            } else {
                currentNum = parts[i];
            }
        }
        operations = lastOperation;
    }
    }//GEN-LAST:event_jbtnClearEntryActionPerformed

    private void jbtnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearAllActionPerformed
        jLblDisplay.setText("");
        currentNum = "";
        result = 0;
        operations = "";
    }//GEN-LAST:event_jbtnClearAllActionPerformed

    private void jbtnPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPercentActionPerformed
        if (!currentNum.isEmpty()) {
        if (operations.isEmpty()) {
            result = (Double.parseDouble(currentNum) / 100);
        } else {
            double secondnum = (Double.parseDouble(currentNum) / 100);
            performOperation(operations, secondnum);
        }
        jLblDisplay.setText(jLblDisplay.getText() + "%");
        currentNum = Double.toString(result);
        operations = "%";
    }
    }//GEN-LAST:event_jbtnPercentActionPerformed

    private void jbtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivideActionPerformed
        if (!currentNum.isEmpty()) {
        if (operations.isEmpty()) {
            result = Double.parseDouble(currentNum);
        } else {
            double secondnum = Double.parseDouble(currentNum);
            performOperation(operations, secondnum);
            
        }
        operations = "/";
        jLblDisplay.setText(jLblDisplay.getText() + "/");
        currentNum = "";
    }
    }//GEN-LAST:event_jbtnDivideActionPerformed

    private void jbtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultiplyActionPerformed
        if (!currentNum.isEmpty()) {
        if (operations.isEmpty()) {
            result = Double.parseDouble(currentNum);
        } else {
            double secondnum = Double.parseDouble(currentNum);
            performOperation(operations, secondnum);
        }
        operations = "*";
        jLblDisplay.setText(jLblDisplay.getText() + "*");
        currentNum = "";
    }
    }//GEN-LAST:event_jbtnMultiplyActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        currentNum += jbtn9.getText();
        jLblDisplay.setText(jLblDisplay.getText() + jbtn9.getText());
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        currentNum += jbtn8.getText();
        jLblDisplay.setText(jLblDisplay.getText() + jbtn8.getText());
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        currentNum += jbtn7.getText();
        jLblDisplay.setText(jLblDisplay.getText() + jbtn7.getText());
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        currentNum += jbtn5.getText();
        jLblDisplay.setText(jLblDisplay.getText() + jbtn5.getText());
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        currentNum += jbtn6.getText();
        jLblDisplay.setText(jLblDisplay.getText() + jbtn6.getText());
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        currentNum += jbtn4.getText();
        jLblDisplay.setText(jLblDisplay.getText() + jbtn4.getText());
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        if (!currentNum.isEmpty()) {
        if (operations.isEmpty()) {
            result = Double.parseDouble(currentNum);
        } else {
            double secondnum = Double.parseDouble(currentNum);
            performOperation(operations, secondnum);
        }
        operations = "+";
        jLblDisplay.setText(jLblDisplay.getText() + "+");
        currentNum = "";
    }
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        currentNum += jbtn0.getText();
        jLblDisplay.setText(jLblDisplay.getText() + jbtn0.getText());
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusMinusActionPerformed
        if (!currentNum.isEmpty()) {
        double num = Double.parseDouble(currentNum);
        num = -num; // Negate the current number

        // Update the display with the negated number
        if (num % 1 == 0) {
            jLblDisplay.setText(String.format("%.0f", num));
        } else {
            jLblDisplay.setText(String.valueOf(num));
        }

        currentNum = Double.toString(num);
    }
    }//GEN-LAST:event_jbtnPlusMinusActionPerformed

    private void jbtnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDecimalActionPerformed
        currentNum += jbtnDecimal.getText();
        jLblDisplay.setText(jLblDisplay.getText() + jbtnDecimal.getText());
    }//GEN-LAST:event_jbtnDecimalActionPerformed

    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualActionPerformed
        if (!currentNum.isEmpty()&&!operations.isEmpty()) {
            double secondnum = Double.parseDouble(currentNum);
            performOperation(operations, secondnum);
            if (result % 1 == 0) {
                jLblDisplay.setText(String.format(""+"%.0f", result));  
            } else {
                jLblDisplay.setText(""+Double.toString(result)); 
            }
            
            currentNum = Double.toString(result);
            operations = "";
        }else{
            jLblDisplay.setText(""+currentNum); 
        }
    }//GEN-LAST:event_jbtnEqualActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        currentNum += jbtn1.getText();
        jLblDisplay.setText(jLblDisplay.getText() + jbtn1.getText());
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        currentNum += jbtn2.getText();
        jLblDisplay.setText(jLblDisplay.getText() + jbtn2.getText());
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        currentNum += jbtn3.getText();
        jLblDisplay.setText(jLblDisplay.getText() + jbtn3.getText());
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtnMinus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinus1ActionPerformed
        if (!currentNum.isEmpty()) {
        if (operations.isEmpty()) {
            result = Double.parseDouble(currentNum);
        } else {
            double secondnum = Double.parseDouble(currentNum);
            performOperation(operations, secondnum);
        }
        operations = "-";
        jLblDisplay.setText(jLblDisplay.getText() + "-");
        currentNum = "";
    }
    }//GEN-LAST:event_jbtnMinus1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cal_Briones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cal_Briones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cal_Briones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cal_Briones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cal_Briones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblDisplay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnClearAll;
    private javax.swing.JButton jbtnClearEntry;
    private javax.swing.JButton jbtnDecimal;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnMinus1;
    private javax.swing.JButton jbtnMultiply;
    private javax.swing.JButton jbtnPercent;
    private javax.swing.JButton jbtnPlusMinus;
    // End of variables declaration//GEN-END:variables
}
