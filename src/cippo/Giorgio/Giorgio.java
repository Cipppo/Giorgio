package cippo.Giorgio;

import java.util.EventListener;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDA.Status;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.ReadyEvent;

public class Giorgio {
    
    private final JDA jda;

    public Giorgio(String token) throws LoginException, InterruptedException {
        this.jda = JDABuilder.createDefault(token).setStatus(OnlineStatus.ONLINE).addEventListeners(new cippo.Giorgio.ReadyEvent()).build().awaitReady();
    }
    

  
    
}
