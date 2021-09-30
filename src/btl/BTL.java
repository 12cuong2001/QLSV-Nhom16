/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl;

import GUI.Login;
import static btl.MyConnection.getConnection;

/**
 *
 * @author Administrator
 */
public class BTL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        getConnection();
        Login l=new Login();
        l.setVisible(true);
        
    }
    
}
