public class Character {
    private String characterType;
    private CharacterClass ChClass;
    private Stats attributes;
    private int hp;

    public void addBonuses() {
        if(characterType.equalsIgnoreCase("Barbarian")) {
            this.hp = (attributes.getStats().getOrDefault("Constitution", 1) / 2) + 5 + 12;
        }
        else{
            this.hp = (attributes.getStats().getOrDefault("Constitution", 1) / 2) + 5 + 8;
        }
    }

    public void printHp() {
        System.out.println(hp);
    }

    public void talk() {
        ChClass.talk();
    }

    public Character(ClassFactory factory, String characterType) {
        Stats stats1 = new Stats();
        this.attributes = stats1.generate_stats();
        this.characterType = characterType;
        this.ChClass = factory.getCharClass(this.characterType);
    }
}
