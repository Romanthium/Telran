package game.hero;

import game.hero.constant.Constant;

public class Orc {
    private int id = 1;
    private String name;
    private String clan;
    private String abilities;
    private int power;
    private int health;
    private int magic;

    public Orc() {

    }
    public Orc(int id) {
        this.id = id;
        this.power = Constant.ORC_POWER;
        this.health = Constant.ORC_HEALTH;
        this.magic = Constant.ORC_MAGIC;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public int getPower() {
        return power;
    }

    public int getHealth() {
        return health;
    }

    public int getMagic() {
        return magic;
    }
}
