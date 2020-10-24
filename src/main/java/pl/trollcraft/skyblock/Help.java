package pl.trollcraft.skyblock;

import org.bukkit.ChatColor;

public class Help {

    // instancja klasy inaczej egzemplarz klasy

    /**
     * Funkcja
     *
     * Widoczność Zwracany_Typ nazwa(Typ_Parametru nazwaParametru, ...) {
     *     return obiekt typu Zwracany_Typ
     * }
     */

    /**
     * Returns a colored String.
     * '&' = 'COLOR PARAM'
     *
     * @param toColor
     * @return colored toColor
     */
    public static String color(String toColor) {
        return toColor.replaceAll("&", String.valueOf(ChatColor.COLOR_CHAR));
    }

}
