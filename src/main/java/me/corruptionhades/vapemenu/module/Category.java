package me.corruptionhades.vapemenu.module;

public enum Category {
    COMBAT("Combat"),
    MOVEMENT("Movement"),
    RENDER("Render"),
    PLAYER("Player"),
    MISC("Misc"),
    HIDDEN("Hidden"),
    NIMORANT("Nimorant"),
    NIMNITE("Nimnite");

    public String name;

    Category(String name) {
        this.name = name;
    }
}
