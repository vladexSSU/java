public class ElfFactory implements RaceAbstractFactory{
    @Override
    public CharacterRace create() {
        Elf elf = new Elf();
        elf.getRaceBonuses();
        return elf;
    }
}
