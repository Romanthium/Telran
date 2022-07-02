package game.hero;

import game.hero.constant.Constant;

public class Elf {
    private int id = 1;
    private String name;
    private boolean gender; // false - for male, true - for female
    private String abilities;
    private int level;
    private String race;

    private int power;
    private int charisma;
    private int magic;

    public Elf() {

    }

    public Elf(int id) {
        this.id = id;
        this.power = Constant.ELF_POWER;
        this.charisma = Constant.ELF_CHARISMA;
        this.magic = Constant.ELF_MAGIC;
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

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
