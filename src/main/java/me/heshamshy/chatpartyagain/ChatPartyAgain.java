/*
 *     Chat Party Again - A port of the Minecraft server plugin Chat Party to 1.12
 *     Copyright (C) 2023  HeshamSHY
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package me.heshamshy.chatpartyagain;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;

public final class ChatPartyAgain extends JavaPlugin {

    private HashMap<String, Party> activeParties;
    private ArrayList<Player> spyPlayers;
    private boolean config_invertP;
    private boolean config_toggleWithP;
    public ChatColor config_messageColor;
    public String config_chatFormat;
    public final boolean GUILD_MODE = false;
    public final String TEXT_PARTY = (GUILD_MODE ? "guild" : "party");
    public final String TEXT_PARTY2 = (GUILD_MODE ? "Guild" : "Party");
    public final String TEXT_PARTIES = (GUILD_MODE ? "guilds" : "parties");
    public final String TEXT_P = (GUILD_MODE ? "g" : "p");

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
