public class GnomeFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        Gnome gnome = new Gnome();
        gnome.getRaceBonuses();
        return gnome;
    }
}
