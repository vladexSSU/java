public class Character implements DataElement {
    private String name;
    private CharacterRace race;
    private Stats attributes;

    public void setName(String name) {
        this.name = name;
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

    Character(CharacterRace race) {
        this.race = race;
    }

    @Override
    public void accept() {

    }
}