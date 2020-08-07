
package nis_project;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NIS_PROJECT {

    
    public static void main(String[] args) {
        try{
        AES aes = new AES("lelelelelelelele");
        String data="ishaan";
        String edata=aes.encrypt(data);
        System.out.println("ENCRYPTED TEXT USING AES ALGORITHM: "+edata);
        String ddata=aes.decrypt(edata);
        System.out.println("DECRYPTED TEXT USING AES ALGORITHM: "+ddata);
        
        }
        catch(Exception e){
        Logger.getLogger(AES.class.getName()).log(Level.SEVERE,null,e);
        }
        
    }
    
}
