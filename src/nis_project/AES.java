
package nis_project;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


public class AES {
    private static final String algo="AES";
    private byte[] keyval;
    
    public AES(String key){
        keyval=key.getBytes();
    }
    
    public String encrypt (String data) throws Exception{
    Key key=generateKey();
    Cipher cipher=Cipher.getInstance(algo);
    cipher.init(Cipher.ENCRYPT_MODE,key);
    byte[] enctext=cipher.doFinal(data.getBytes());
    String etext=new BASE64Encoder().encode(enctext);
    return etext;
    }
    
    public String decrypt(String etext) throws Exception{
    Key key=generateKey();
    Cipher cipher=Cipher.getInstance(algo);
    cipher.init(Cipher.DECRYPT_MODE, key);
    byte[] decodedtext=new BASE64Decoder().decodeBuffer(etext);
    byte[] dectext=cipher.doFinal(decodedtext);
    String dtext=new String(dectext);
    return dtext;
    }
    
    private Key generateKey() throws Exception{
    Key key=new SecretKeySpec(keyval,algo);
    return key;
    }
    
    
}
