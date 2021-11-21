package cippo.Giorgio;

import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class reacListener extends ListenerAdapter{
    
    public void onMessageReactionAdd(MessageReactionAddEvent event) {
        
        System.out.println("Reaction Added " + event.getMember().getUser());
        
    }
}
