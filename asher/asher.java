import javax.security.auth.login.LoginException;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;
import asher.Commands.Clear;
import asher.Commands.Events.GuildMemberJoin;
import asher.Commands.Events.GuildMemberLeave;
import asher.Commands.Events.GuildMessageReactionAdd;
import asher.Commands.Events.GuildMessageReceived;
import asher.Commands.Television;

public class Television {
  public static JDA jda;
  
  public static String prefix = "as-";
  
  public static void main(String[] args) throws LoginException {
    jda = (new JDABuilder(AccountType.BOT)).setToken("NTI4MDA2MjM4MTMxNDUzOTgz.DwmJsw.DlFSxU9QNiT4jgW65H3DumHSa0c").build();
    jda.getPresence().setStatus(OnlineStatus.ONLINE);
    jda.getPresence().setGame(Game.watching("boring comedy shows."));
    jda.addEventListener(new Object[] { new Clear() });
    jda.addEventListener(new Object[] { new GuildMemberJoin() });
    jda.addEventListener(new Object[] { new GuildMemberLeave() });
    jda.addEventListener(new Object[] { new GuildMessageReceived() });
    jda.addEventListener(new Object[] { new GuildMessageReactionAdd() });
  }
}
