package cippo.Giorgio;

import javax.security.auth.login.LoginException;

public class TestGiorgio {

    
    public static void main(String arg) {
        
        try {
            Giorgio giorgio = new Giorgio("OTExNjcxMDA3NTU3ODQ5MjQw.YZkxyg.IuOuLRxf-CSOTb6rxS4doAfNcfU");
        } catch (LoginException e) {
            e.printStackTrace();
        }
        
        
        
    }
}
