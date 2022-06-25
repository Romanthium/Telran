package game.hero;

public class Main {
    public static void main(String[] args) {
        Elf elf = new Elf();
        elf.setName("Iorweth");
        elf.setGender(false);
        elf.setAbilities("Bowmanship, Melee combat, Playing the flute, Swordsmanship");
        elf.setLevel(35);
        elf.setRace("Aen Seidhe");

        System.out.println("About Elf: \n"
                + "Name: " + elf.getName() + "\n"
                + "Gender: " + (elf.getGender() ? "Female" : "Male") + "\n"
                + "Race: " + elf.getRace() + "\n"
                + "Abilities: " + elf.getAbilities() + "\n"
                + "Level: " + elf.getLevel() + "\n"
                + "Power: " + Constant.POWER + "\n"
                + "Magic: " + Constant.MAGIC + "\n"
                + "Charisma: " + Constant.CHARISMA + "\n"
                +"Character's ID: " + elf.getId()
        );
    }
}
