public class ClassFactory {
    public CharacterClass getCharClass(String type){
        if(type.equalsIgnoreCase("Barbarian")){
            return new Barbarian();
        }
        else return new Druid();
    }
}
