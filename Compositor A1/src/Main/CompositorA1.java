/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


/**
 *
 * @author Alex Nelson
 */
//FEATURES-
//SHOULD ALLOW USER TO CREATE THEIR OWN COMPOSITIONAL ELEMENTS
//INTEGRATE WITH MATHS AND OTHER MEANS OF DESCRIPTION
//AND THE IMAGE SHOULD ALSO BE A SEPARATE EXTENSION OF JLabel
//ALL PLACED ON A JPanel
//MAYBE FIND WAY OF ENSURING ANY MODIFICATION OF jLayeredPane1 MODIFIES
//serComField   REMEMBER TO TEST
//FIELDS SHOULD HAVE m- PREFIX?
//DELEGATE CODE IN PANELA1 CLASS TO SEPARATE FUNCTIONS?
//MAY MAKE MORE SENSE FOR SerializableComposite TO CONTAIN ComElemJLab
//AND ImageJLab FIELDS RATHER THAN PRIMITIVES
//DEAL WITH THE PROBLEM OF OVERLAPPING jLABELS-MAYBE HAVE LIST ON SIDE
//HAVE SIX POINT IMAGE MANIPULATION NODES LIKE IN PAINT FOR ComElemJLabs
//IMPLEMENT JUnit TESTS
//CREATE CUSTOM CLASS EXTENDING DefaultMutableTreeNode??
//AS MUCH AS POSSIBLE ATTEMPT TO SIMPLIFY RECORD OF ELEMENTS E.G. COMBINE
//COMPOSITIONELEMENT WITH ComElemJLab
//HAVE ABSTRACT/DELEGATED DRAWING METHOD FROM WHICH OTHERS ARE DERIVED
//TRACINGS NEED TO BE EDITABLE IN ORDER FOR THE SIDE TREE TO HAVE A PURPOSE
//SO INSTEAD IT MIGHT BE USEFU TO HAVE EACH POINT IN A TRACING
//AS A COMPONENT OR PART OF A COMPONENT
//FOR GEOMETRY ETC USE http://tsusiatsoftware.net/
//MAYBE HAVE STYLE FOR LINES
//INSTEAD OF DRAGTABS, JUST USE THE TABS OF THE JLAYEREDPANE
//MAY NEED TO DE-DELEGATE InitializeCEJLab()
//LOOK INTO COMPONENT LAYOUTS
//LOOK INTO GARBAGE COLLECTION
//GETTING A LOT OF TRIVIAL NullPointerException ERRORS-SHOULD ENSURE FIELDS ARE INSTANTIATED IN CONSTRUCTORS ETC
//MAY JUST MAKE MORE SENSE TO DRAW LINE USING ROUNDED drawLine() METHOD-DRAWING SHAPES SEEMS TO BE BUGGY
//DISCREPANCY BETWEEN LISTENING SPACE AND DRAWING SPACE
//MAYBE DRAW DIRECTLY ON THE JLayeredPane, BUILDING A NETWORK OF ELEMENTS, AND USE DRAWING TO HIGHLIGHT SELECTED ELEMENTS
//IMPLEMENT TREE CODE IN 'CUSTOMIZE CODE' SECTION
//UPDATE TREE VIA MODEL
//IMPLEMENT RECT AND CIRCLE 
//ENSURE ERROR MESSAGE IS DISPLAYED IF NO FILE IS CHOSEN
public class CompositorA1 {

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
            java.util.logging.Logger.getLogger(PanelA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelA1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PanelA1().setVisible(true);
            }
        });
    }
    
}
