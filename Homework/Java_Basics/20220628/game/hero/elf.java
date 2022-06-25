package game.hero;

public class Elf {
    private int id = 1;
    private String name;
    private boolean gender; // false - for male, true - for female
    private String abilities;
    private int level;
    private String race;

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
