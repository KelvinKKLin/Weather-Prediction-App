package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Weather extends javax.swing.JFrame {
    /** Creates new form Find */
    public Weather() {
        initComponents();
        dangerLabel.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ice = new javax.swing.JCheckBox();
        dry = new javax.swing.JCheckBox();
        rain = new javax.swing.JCheckBox();
        snow = new javax.swing.JCheckBox();
        wind = new javax.swing.JCheckBox();
        cold = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        dangerLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        iceBox = new javax.swing.JTextField();
        windBox = new javax.swing.JTextField();
        dryBox = new javax.swing.JTextField();
        snowBox = new javax.swing.JTextField();
        coldBox = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        temperatureLabel = new javax.swing.JLabel();
        rainBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Find");

        ice.setText("Ice");
        ice.setName("iceCheckBox"); // NOI18N

        dry.setText("Dry");
        dry.setName("dryCheckbox"); // NOI18N

        rain.setText("Rain");
        rain.setName("rainCheckbox"); // NOI18N

        snow.setText("Snow");
        snow.setName("snowCheckbox"); // NOI18N

        wind.setText("Wind");
        wind.setName("windCheckbox"); // NOI18N

        cold.setText("Cold");
        cold.setName("coldCheckbox"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WEATHER");

        dangerLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dangerLabel.setForeground(new java.awt.Color(255, 0, 0));
        dangerLabel.setText("Danger !");
        dangerLabel.setName("dangerLabel"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Test");

        iceBox.setText("Ice");
        iceBox.setName("iceBox"); // NOI18N

        windBox.setText("Wind");
        windBox.setToolTipText("");
        windBox.setName("windBox"); // NOI18N

        dryBox.setText("Dry");
        dryBox.setToolTipText("");
        dryBox.setName("dryBox"); // NOI18N

        snowBox.setText("Snow");
        snowBox.setName("snowBox"); // NOI18N

        coldBox.setText("Cold");
        coldBox.setName("coldBox"); // NOI18N

        submitButton.setText("Submit");
        submitButton.setName("submitButton"); // NOI18N
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        temperatureLabel.setText("Temperature");

        rainBox.setText("Rain");
        rainBox.setName("rainBox"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(296, 296, 296)
                .add(submitButton)
                .addContainerGap(361, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(203, 203, 203)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 297, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(temperatureLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                            .add(95, 95, 95)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(dry, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(ice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(58, 58, 58)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(layout.createSequentialGroup()
                                    .add(rain, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(66, 66, 66)
                                    .add(wind, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createSequentialGroup()
                                    .add(snow, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(cold, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(layout.createSequentialGroup()
                            .add(185, 185, 185)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(layout.createSequentialGroup()
                                    .add(iceBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(18, 18, 18)
                                    .add(rainBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(18, 18, 18)
                                    .add(windBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(18, 18, 18)
                                    .add(dryBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(18, 18, 18)
                                    .add(snowBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(18, 18, 18)
                                    .add(coldBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 297, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(42, 42, 42)))
                    .add(dangerLabel))
                .add(0, 121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(dangerLabel)
                .add(47, 47, 47)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(temperatureLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 10, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(rain, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(wind, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(41, 41, 41)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(dry, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(snow, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cold, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(111, 111, 111)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(iceBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(windBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(dryBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(snowBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(coldBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(rainBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 33, Short.MAX_VALUE)
                .add(submitButton)
                .add(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method handles the actions preformed when the submit button is pressed.
     * 
     * It checks to see which checkboxes are selected, and then verifies that the values
     * present in the textboxes of the corresponding checkboxes are within range. If so,
     * then the program will concatenate the values and launch the python based SVM.
     * Otherwise, a popup will appear to alert the user of any errors.
     * @param evt The action clicked event
     */
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        //Read the values from the checkboxes
        boolean considerIce = ice.isSelected();
        boolean considerRain = rain.isSelected();
        boolean considerWind = wind.isSelected();
        boolean considerDry = dry.isSelected();
        boolean considerSnow = snow.isSelected();
        boolean considerCold = cold.isSelected();

        //The command used to start the SVM
        String command = "python SVM.py ";

        //Check the values of each box checked, and append the corresponding flag
        //to the SVM control
        if(considerIce){
            command += "1 ";
            try{
                if(Integer.parseInt(iceBox.getText()) != 1 && Integer.parseInt(iceBox.getText()) != 0){
                    JOptionPane.showMessageDialog(null, "The value of ice must be either 0 or 1.");
                    return;
                }
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "The value of ice must be an integer.");
                return;
            }
        }else{
            command += "0 ";
        }

        if(considerRain){
            command += "1 ";
            try{
                if(Integer.parseInt(rainBox.getText()) < 0){
                    JOptionPane.showMessageDialog(null, "The value of rain must be greater than or equal to 0.");
                    return;
                }
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "The value of rain must be an integer.");
                return;
            }
        }else{
            command += "0 ";
        }

        if(considerWind){
            command += "1 ";
            try{
                if(Integer.parseInt(windBox.getText()) < 0){
                    JOptionPane.showMessageDialog(null, "The value of wind must be greater than or equal to 0.");
                    return;
                }
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "The value of wind must be an integer.");
                return;
            }
        }else{
            command += "0 ";
        }

        if(considerDry){
            command += "1 ";
            try{
                if(Integer.parseInt(dryBox.getText()) != 1 && Integer.parseInt(dryBox.getText()) != 0){
                    JOptionPane.showMessageDialog(null, "The value of dry must be either 0 or 1.");
                    return;
                }
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "The value of dry must be an integer.");
                return;
            }
        }else{
            command += "0 ";
        }

        if(considerSnow){
            command += "1 ";
            try{
                if(Integer.parseInt(snowBox.getText()) < 0){
                    JOptionPane.showMessageDialog(null, "The value of snow must be greater than or equal to 0.");
                    return;
                }
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "The value of snow must be an integer");
                return;
            }
        }else{
            command += "0 ";
        }

        if(considerCold){
            command += "1 ";
            try{
                if(Integer.parseInt(coldBox.getText()) < 0){
                    JOptionPane.showMessageDialog(null, "The value of cold must be greater than or equal to 0.");
                    return;
                }
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "The value of cold must be an integer.");
                return;
            }
        }else{
            command += "0 ";
        }

        //Concatenate the command
        command += iceBox.getText() + " " + rainBox.getText() + " " + windBox.getText() + " " + dryBox.getText() + " " + snowBox.getText() + " " + coldBox.getText();

        //Execute the Python SVM
        String s = null;
        try {
            Process p = Runtime.getRuntime().exec(command);

            BufferedReader stdInput = new BufferedReader(new
                         InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new
                         InputStreamReader(p.getErrorStream()));

            //The SVM output
            s = stdInput.readLine();
            
            //Parse the output and determine whether the weather condition is dangerous
            if(s.equals("[ 1.]")){
                dangerLabel.setVisible(true);
            } else{
                dangerLabel.setVisible(false);

            }
        } catch (IOException ex) {
            Logger.getLogger(Weather.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Update the temperature text box
        temperatureLabel.setText(coldBox.getText());
    }//GEN-LAST:event_submitButtonActionPerformed
    
    /**
     * The entry point to the program.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Weather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Weather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Weather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Weather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Weather().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cold;
    private javax.swing.JTextField coldBox;
    private javax.swing.JLabel dangerLabel;
    private javax.swing.JCheckBox dry;
    private javax.swing.JTextField dryBox;
    private javax.swing.JCheckBox ice;
    private javax.swing.JTextField iceBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JCheckBox rain;
    private javax.swing.JTextField rainBox;
    private javax.swing.JCheckBox snow;
    private javax.swing.JTextField snowBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JCheckBox wind;
    private javax.swing.JTextField windBox;
    // End of variables declaration//GEN-END:variables

}
