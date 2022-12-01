public class CharacterRace implements DataElement{
    private String name;
    private Stats bonuses;

    public Stats getRaceBonuses() {
        return this.bonuses;
    }

    public void talk() {
        System.out.println("Race talk");
    }

    @Override
    public void accept() {

    }
}
