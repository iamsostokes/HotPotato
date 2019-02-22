import java.util.ArrayList;

public class Potato {

    private ArrayList<String> potato;

    public Potato() {
        this.potato = new ArrayList<>();
    }

    public ArrayList<String> printPotatoDetails() {
        System.out.println(potato);
        return potato;
    }

    public void addNameToPotato(String name) {
        potato.add(name);
    }

    public ArrayList<String> getPotato() {
        return potato;
    }

    public void setPotato(ArrayList<String> potato) {
        this.potato = potato;
    }
}
