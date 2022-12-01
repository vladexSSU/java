public class ElementVisitor implements DataElementsVisitor{
    public void visit(Character var){
        System.out.println("Visitor has it's influence on this object");

    }
    public void visit(Stats var){
        var.setStats("Dexterity",2);
    }
    public void visit(CharacterClass var){
        System.out.println("Visitor has it's influence on this object");

    }
    public void visit(CharacterRace var){

    }
}
