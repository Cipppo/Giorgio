package cippo.Giorgio;

import java.io.IOException;

import javax.security.auth.login.LoginException;

public class GiorgioImpl {
    
    
    
    
    
    
    public static void main(String[] arg) {
        
        Giorgio giorgio = null;
        
        
        final keyReader reader = new keyReader("Key.txt");
        
        try {
            giorgio = new Giorgio(reader.read());
        } catch (LoginException | InterruptedException | IOException e) {
            e.printStackTrace();
        }
        
        
        //giorgio.SpawnMessage();
        
        
    }
    
}
