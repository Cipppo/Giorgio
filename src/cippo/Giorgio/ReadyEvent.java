package cippo.Giorgio;

import java.util.EventListener;

import net.dv8tion.jda.api.events.GenericEvent;

public class ReadyEvent implements net.dv8tion.jda.api.hooks.EventListener{

    @Override
    public void onEvent(GenericEvent event) {
        if(event instanceof ReadyEvent) {
            System.out.println("Bot Ready !");
        }
        
    }
    
    
}
