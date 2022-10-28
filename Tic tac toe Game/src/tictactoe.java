import java.awt.*;
import javax.swing.*;

public class tictactoe extends javax.swing.JFrame {

    JButton[][] button = new JButton[3][3];

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;

    public tictactoe() {
        initComponents();
        setSize(1200, 600);
        setLocationRelativeTo(null);
        this.button[0][0] = jButton1;
        this.button[0][1] = jButton2;
        this.button[0][2] = jButton3;

        this.button[1][0] = jButton4;
        this.button[1][1] = jButton5;
        this.button[1][2] = jButton6;

        this.button[2][0] = jButton7;
        this.button[2][1] = jButton8;
        this.button[2][2] = jButton9;
        jTurn.setText("         Play :  " +startGame);
        gameScore();

    }

    private void gameScore() {
        jPlayerX.setText(String.valueOf(xCount));
        jPlayerO.setText(String.valueOf(oCount));
        
    }
    

    private void choose_a_player() {
        
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
        jTurn.setText("         Play :  " +startGame);
    }

    private void winningGame() {

        String[][] check = new String[3][3];

        check[0][0] = jButton1.getText();
        check[0][1] = jButton2.getText();
        check[0][2] = jButton3.getText();

        check[1][0] = jButton4.getText();
        check[1][1] = jButton5.getText();
        check[1][2] = jButton6.getText();

        check[2][0] = jButton7.getText();
        check[2][1] = jButton8.getText();
        check[2][2] = jButton9.getText();

        for (int i = 0; i < 3; i++) {
            System.out.println(check[i][0]);
        }

        // check all rows 
        for (int i = 0; i < 3; i++) {
            if (check[i][0] == check[i][1] && check[i][1] == check[i][2] && (check[i][0] == "X" || check[i][0] == "O")) {
                for (int j = 0; j < 3; j++) {
                    button[i][j].setBackground(Color.CYAN);
                }
                if (check[i][0] == "X") {
                    JOptionPane.showMessageDialog(this, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    xCount++;
                } else {
                    JOptionPane.showMessageDialog(this, "Player O WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    oCount++;
                }
                gameScore();

                // reset the game
            }
        }

        // check all columns
        for (int i = 0; i < 3; i++) {
            if (check[0][i] == check[1][i] && check[1][i] == check[2][i] && (check[0][i] == "X" || check[0][i] == "O")) {
                for (int j = 0; j < 3; j++) {
                    button[j][i].setBackground(Color.CYAN);
                }
                if (check[0][i] == "X") {
                    JOptionPane.showMessageDialog(this, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    xCount++;
                } else {
                    JOptionPane.showMessageDialog(this, "Player O WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    oCount++;
                }
                gameScore();

                
            }
        }
        
        // check two diagonal 
        
            if (check[0][0] == check[1][1] && check[1][1] == check[2][2] && (check[0][0] == "X" || check[0][0] == "O")) {
                
                for (int j = 0; j < 3; j++)     button[j][j].setBackground(Color.CYAN);
                
                if (check[0][0] == "X") {
                    JOptionPane.showMessageDialog(this, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    xCount++;
                } else {
                    JOptionPane.showMessageDialog(this, "Player O WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    oCount++;
                }
                gameScore();
            }
            if (check[0][2] == check[1][1] && check[1][1] == check[2][0] && (check[1][1] == "X" || check[1][1] == "O")) {
                
                for (int j = 0; j < 3; j++)     button[j][j].setBackground(Color.CYAN);
                
                if (check[1][1] == "X") {
                    JOptionPane.showMessageDialog(this, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    xCount++;
                } else {
                    JOptionPane.showMessageDialog(this, "Player O WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    oCount++;
                }
                gameScore();
            }
        
        
        // Nobody wins Match tie 
        boolean flag = true ;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0 ; j < 3 ; j++) {
            
                if (check[i][j] != "X" && check[i][j] != "O" ){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            JOptionPane.showMessageDialog(this, "Tie  No one Won ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTurn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPlayerX = new javax.swing.JLabel();
        jPlayerO = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jReset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1);

        jTurn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jPanel1.add(jTurn);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.GridLayout(3, 6, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Player : O");
        jPanel6.add(jLabel3, java.awt.BorderLayout.CENTER);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Player : X");
        jPanel6.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPlayerX.setBackground(new java.awt.Color(0, 0, 0));
        jPlayerX.setFont(new java.awt.Font("Segoe UI", 2, 48)); // NOI18N
        jPlayerX.setForeground(new java.awt.Color(204, 204, 204));
        jPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPlayerX.setText("0");
        jPanel7.add(jPlayerX, java.awt.BorderLayout.CENTER);

        jPlayerO.setBackground(new java.awt.Color(0, 0, 0));
        jPlayerO.setFont(new java.awt.Font("Segoe UI", 2, 48)); // NOI18N
        jPlayerO.setForeground(new java.awt.Color(204, 204, 204));
        jPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPlayerO.setText("0");
        jPanel7.add(jPlayerO, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI Light", 3, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 255, 255));
        jButton10.setText("Manual");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setFont(new java.awt.Font("Segoe UI Historic", 3, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(51, 0, 255));
        jButton11.setText("Auto");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jReset.setBackground(new java.awt.Color(0, 0, 0));
        jReset.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jReset.setForeground(new java.awt.Color(204, 204, 204));
        jReset.setText("Reset");
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });
        jPanel16.add(jReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jExit.setBackground(new java.awt.Color(0, 0, 0));
        jExit.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jExit.setForeground(new java.awt.Color(204, 204, 204));
        jExit.setText("EXIT");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jPanel17.add(jExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton5.setForeground(Color.GREEN);
        } else {
            jButton5.setForeground(Color.BLUE);
        }

        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        frame = new JFrame("EXIT");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit ", "Tic tac toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jButton1.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton1.setForeground(Color.GREEN);
        } else {
            jButton1.setForeground(Color.BLUE);
        }

        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton2.setForeground(Color.GREEN);
        } else {
            jButton2.setForeground(Color.BLUE);
        }

        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton3.setForeground(Color.GREEN);
        } else {
            jButton3.setForeground(Color.BLUE);
        }

        choose_a_player();
        winningGame();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton4.setForeground(Color.GREEN);
        } else {
            jButton4.setForeground(Color.BLUE);
        }

        choose_a_player();
        winningGame();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton6.setForeground(Color.GREEN);
        } else {
            jButton6.setForeground(Color.BLUE);
        }

        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton7.setForeground(Color.GREEN);
        } else {
            jButton7.setForeground(Color.BLUE);
        }

        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton8.setForeground(Color.GREEN);
        } else {
            jButton8.setForeground(Color.BLUE);
        }

        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton9.setForeground(Color.GREEN);
        } else {
            jButton9.setForeground(Color.BLUE);
        }

        choose_a_player();
        winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                button[i][j].setText(null);
                button[i][j].setBackground(Color.WHITE);
            }
        }
    }//GEN-LAST:event_jResetActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // heres comes code to start manual game 
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // Here comes code to start game to auto mode with computer
        
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jPlayerO;
    private javax.swing.JLabel jPlayerX;
    private javax.swing.JButton jReset;
    private javax.swing.JLabel jTurn;
    // End of variables declaration//GEN-END:variables
}
