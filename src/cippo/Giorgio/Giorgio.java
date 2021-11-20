package cippo.Giorgio;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDA.Status;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

public class Giorgio {
    
    private final JDA jda;

    public Giorgio(String token) throws LoginException {
        this.jda = JDABuilder.createDefault(token).setStatus(OnlineStatus.ONLINE).build();
    }
    

    
}
