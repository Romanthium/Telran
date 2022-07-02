package game;


import game.hero.Elf;
import game.hero.Orc;
import game.hero.constant.Constant;

public class GameMain {
    public static void main(String[] args) {
        Elf elf = new Elf(2);
        elf.setName("Iorweth");
        elf.setGender(false);
        elf.setAbilities("Bowmanship, Melee combat, Playing the flute, Swordsmanship");
        elf.setLevel(35);
        elf.setRace("Aen Seidhe");

        System.out.println("About Elf: \n"
                + "\tName: " + elf.getName() + "\n"
                + "\tGender: " + (elf.getGender() ? "Female" : "Male") + "\n"
                + "\tRace: " + elf.getRace() + "\n"
                + "\tLevel: " + elf.getLevel() + "\n"
                + "\tPower: " + Constant.ELF_POWER + "\n"
                + "\tMagic: " + Constant.ELF_MAGIC + "\n"
                + "\tCharisma: " + Constant.ELF_CHARISMA + "\n"
                + "\tCharacter's ID: " + elf.getId() + "\n"
        );

        Orc orc = new Orc(1);
        orc.setName("Durotan");
        orc.setClan("Frostwolf");
        orc.setAbilities("Warrior");

        System.out.println("About Orc: \n"
                + "\tName: " + orc.getName() + "\n"
                + "\tClan: " + orc.getClan() + "\n"
                + "\tAbilities: " + orc.getAbilities() + "\n"
                + "\tPower: " + orc.getPower() + "\n"
                + "\tMagic: " + orc.getMagic() + "\n"
                + "\tHealth: " + orc.getHealth() + "\n"
                + "\tCharacter's ID: " + orc.getId() + "\n"
        );
    }
}
