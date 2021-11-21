package cippo.Giorgio;

import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.ReadyEvent;

public class ReadyListener implements net.dv8tion.jda.api.hooks.EventListener {

    @Override
    public void onEvent(GenericEvent event) {
        if(event instanceof ReadyEvent) {
            System.out.println("Bot Ready !");
        }
    }
}
