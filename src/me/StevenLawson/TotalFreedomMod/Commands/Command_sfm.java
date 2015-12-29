package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(
        description = "SFM INFO",
        aliases = "SprucyFreedomMod",
        usage = "/<command>")
public class Command_sfm extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        TFM_Util.playerMsg(sender_p, "Welcome to the SprucyFreedomMod our servers Base! ", ChatColor.RED);
        TFM_Util.playerMsg(sender_p, "It was Created by xShadowing ", ChatColor.GREEN);
        TFM_Util.playerMsg(sender_p, "It is a fork of the ShadowFreedomMod and TotalFreedomMod", ChatColor.GREEN);
        TFM_Util.playerMsg(sender_p, "You may not fork this mod or use it on your server without a Developers permission", ChatColor.GREEN);
        TFM_Util.playerMsg(sender_p, "Post a thread on sprucyfreedom.boards.net if you have any questions or comments", ChatColor.RED);
        return true;
    }
}
