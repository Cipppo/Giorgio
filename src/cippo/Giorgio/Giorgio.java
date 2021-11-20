package cippo.Giorgio;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Giorgio {
    
    private final JDA jda;

    public Giorgio(String token) throws LoginException {
        this.jda = JDABuilder.createDefault(token).build();
    }
    
}
