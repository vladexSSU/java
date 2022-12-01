import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class VisitorPatternDemo {
    public static void main(String[] args) throws IOException {
        Character c1 = new Character(new CharacterRace());
        c1.talk();
        c1.setName("Budha");
        ElementVisitor ev1 = new ElementVisitor();
        ev1.visit(c1);
        Character c2 = new Character(new CharacterRace());
        c2.setName("Rayan");
        c2.addRaceBonuses();

        Gson json = new Gson();

        String character1_as_json = json.toJson(c1);
        BufferedWriter writer = new BufferedWriter(new FileWriter("Char1.txt"));
        writer.write(character1_as_json);
        writer.close();

        String character2_as_json = json.toJson(c2);
        BufferedWriter writer1 = new BufferedWriter(new FileWriter("Char2.txt"));
        writer1.write(character2_as_json);
        writer1.close();


    }
}