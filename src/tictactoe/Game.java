package tictactoe;
import javax.swing.*;
public class Game extends javax.swing.JFrame {
    private int player=1;
    private Board board;
    private JButton[][] button=new JButton[3][3];
        protected void setButtonReferences()
        {
        button[0][0]=jButton1;
        button[0][1]=jButton2;
        button[0][2]=jButton3;
        button[1][0]=jButton4;
        button[1][1]=jButton5;
        button[1][2]=jButton7;
        button[2][0]=jButton8;
        button[2][1]=jButton9;
        button[2][2]=jButton10;        
        }
    public Game() {
        initComponents();
        
    }
    public void setPlayer(int value)
    {
        player=value;
    }
    public void refreshBoardDisplay()
    {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            {
                switch(board.getBoardValue(i, j))
                {
                    case 2:
                        button[i][j].setEnabled(true);
                        button[i][j].setText("");
                        break;
                    case 3:
                        button[i][j].setEnabled(false);
                        button[i][j].setText("X");
                        break;
                    case 5:
                        button[i][j].setEnabled(false);
                        button[i][j].setText("0");
                        break;
                }
                    
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setPreferredSize(new java.awt.Dimension(350, 400));
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(player==1)
        {
            board.setBoardValue(0, 0, 3);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
        else
        {
            board.setBoardValue(0, 0, 5);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(player==1)
        {
            board.setBoardValue(0, 1, 3);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
        else
        {
            board.setBoardValue(0, 1, 5);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(player==1)
        {
            board.setBoardValue(0, 2, 3);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
        else
        {
            board.setBoardValue(0, 2, 5);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       if(player==1)
        {
            board.setBoardValue(1, 0, 3);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
        else
        {
            board.setBoardValue(1, 0, 5);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(player==1)
        {
            board.setBoardValue(1, 1, 3);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
        else
        {
            board.setBoardValue(1, 1, 5);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(player==1)
        {
            board.setBoardValue(1, 2, 3);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
        else
        {
            board.setBoardValue(1, 2, 5);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(player==1)
        {
            board.setBoardValue(2, 0, 3);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
        else
        {
            board.setBoardValue(2, 0, 5);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       if(player==1)
        {
            board.setBoardValue(2, 1, 3);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
        else
        {
            board.setBoardValue(2, 1, 5);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(player==1)
        {
            board.setBoardValue(2, 2, 3);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
        else
        {
            board.setBoardValue(2, 2, 5);
            this.refreshBoardDisplay();
            if(board.checkWin(1))
            {
                JOptionPane.showMessageDialog(this, "Congrats!!You win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                if(board.isBoardFilled())
                {
                    JOptionPane.showMessageDialog(this, "Game Draw");
                    board.initializeBoard();
                    refreshBoardDisplay();
                    setPlayer(1);
                }
                else
                {
                    setPlayer(3-player);
                    playComputer();
                }
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed
    
    public void playComputer()
    {   int buttonNumber;
        buttonNumber=board.possibleWin(player);
        if(buttonNumber==0)
            buttonNumber=board.possibleWin(3-player);
        if(buttonNumber==0)
            buttonNumber=board.randomBlankButton();
        if(buttonNumber!=0)
        switch(buttonNumber)
        {
            case 1:
                if(player==1)
                board.setBoardValue(0, 0, 3);
                else
                    board.setBoardValue(0, 0, 5);
                this.refreshBoardDisplay();
                break;
            case 2:  if(player==1)
                board.setBoardValue(0, 1, 3);
                else
                    board.setBoardValue(0, 1, 5);
                this.refreshBoardDisplay();
                break;
            case 3:  if(player==1)
                board.setBoardValue(0, 2, 3);
                else
                    board.setBoardValue(0, 2, 5);
                this.refreshBoardDisplay();
                break;
            case 4:  if(player==1)
                board.setBoardValue(1, 0, 3);
                else
                    board.setBoardValue(1, 0, 5);
                this.refreshBoardDisplay();
                break;
            case 5:  if(player==1)
                board.setBoardValue(1, 1, 3);
                else
                    board.setBoardValue(1, 1, 5);
                this.refreshBoardDisplay();
                break;
            case 6:  if(player==1)
                board.setBoardValue(1, 2, 3);
                else
                    board.setBoardValue(1, 2, 5);
                this.refreshBoardDisplay();
                break;
            case 7:  if(player==1)
                board.setBoardValue(2, 0, 3);
                else
                    board.setBoardValue(2, 0, 5);
                this.refreshBoardDisplay();
                break;
            case 8:  if(player==1)
                board.setBoardValue(2, 1, 3);
                else
                    board.setBoardValue(2, 1, 5);
                this.refreshBoardDisplay();
                break;
            case 9:  if(player==1)
                board.setBoardValue(2, 2, 3);
                else
                    board.setBoardValue(2, 2, 5);
                this.refreshBoardDisplay();
                break;
        }
            if(board.checkWin(player))
            {
                JOptionPane.showMessageDialog(this, "Computer won the game");
                board.initializeBoard();
                this.refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
                {
                    
                JOptionPane.showMessageDialog(this, "Game Draw");
                board.initializeBoard();
                this.refreshBoardDisplay();
                setPlayer(1);
                }
            else{
                setPlayer(3-player);
                        
            }
                
    }
    
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Game game=new Game();
               game.setButtonReferences();
               game.setVisible(true);
               game.board=new Board();
               game.board.initializeBoard();
               game.setPlayer(1);
               game.refreshBoardDisplay();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
