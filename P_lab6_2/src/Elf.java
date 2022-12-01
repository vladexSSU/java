public class Elf extends CharacterRace {
    public Stats getRaceBonuses() {
        Stats s = new Stats();
        s.generate_stats();
        s.setStats("Dexterity",2);
        s.setStats("Charisma",1);
        return s;
    }

    public void talk() {
        System.out.println("elf thing");
    }
}
