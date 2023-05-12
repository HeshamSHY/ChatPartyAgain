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

import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Party {

    private ChatPartyAgain plugin;

    public String name;
    public String shortName;
    public ArrayList<String> members;
    public ArrayList<String> leaders;

    public ArrayList<Player> activePlayers;

    public Party(ChatPartyAgain plugin, String name) {
        this.plugin = plugin;

        this.name = name;
        this.shortName = name.substring(0, 3);

        members = new ArrayList<String>();
        leaders = new ArrayList<String>();
        activePlayers = new ArrayList<Player>();
    }

    public void sendPlayerMessage(Player sender, String message) {
        for (Player player : activePlayers) {
            if(player.hasPermission("chatparty.user")) {
                String formattedMessage = plugin.config_chatFormat.replace("{DISPLAYNAME}", sender.getDisplayName()).replace("{PARTYNAME}", this.name).replace("{MESSAGE}", message);

                player.sendMessage(formattedMessage);
            }
        }
    }
    public void sendPartyMessage(String message) {
        for (Player player : activePlayers) {
            if (player.hasPermission("chatparty.user")) {
                player.sendMessage(plugin.config_messageColor + "["+plugin.TEXT_PARTY+"] " + message);
            }
        }
    }
}
