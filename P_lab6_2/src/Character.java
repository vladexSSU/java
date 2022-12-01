public class Character {
    private String name;
    private CharacterRace race;
    private Stats attributes;

    public Character(ElfFactory factory1) {
        this.race = factory1.create();
    }

    public void addRaceBonuses() {
        this.attributes = race.getRaceBonuses();
    }

    public void talk() {
        this.race.talk();
    }

    public void printAttributes() {
        this.attributes.getStats().entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }

}
