package cippo.Giorgio;

import java.util.List;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.TextChannel;

public class Giorgio {
    
    private final JDA jda;

    public Giorgio(String token) throws LoginException, InterruptedException {
        this.jda = JDABuilder.createDefault(token).setStatus(OnlineStatus.ONLINE).addEventListeners(new cippo.Giorgio.ReadyListener())
                .addEventListeners(new cippo.Giorgio.reacListener()).build().awaitReady();
    }
    
    public void SpawnMessage() {
        List<TextChannel> channels = this.jda.getTextChannelsByName("chat", true);
        for(TextChannel ch : channels) {
            ch.sendMessage("Spawn").queue();
        }
    }
  
    
}
