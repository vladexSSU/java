public class VisitorPatternDemo {
    public static void main(String[] args) {
        Character c1 = new Character(new CharacterRace());
        c1.talk();
        ElementVisitor ev1 = new ElementVisitor();
        ev1.visit(c1);

    }
}