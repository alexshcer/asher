import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import asher.Television;

public class Commands extends ListenerAdapter {
  public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
    String[] args = event.getMessage().getContentRaw().split("\\s+");
    if (args[0].equalsIgnoreCase(String.valueOf(Television.prefix) + "info")) {
      EmbedBuilder info = new EmbedBuilder();
      info.setTitle("Television");
      info.setDescription("Completely useless information about a useless bot called 'Television'.");
      info.setColor(16012866);
      info.setFooter("Created by techtoolbox", event.getMember().getUser().getAvatarUrl());
      event.getChannel().sendTyping().queue();
      event.getChannel().sendMessage(info.build()).queue();
      info.clear();
    } 
  }
}
