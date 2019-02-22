import java.util.ArrayList;
import java.util.Arrays;

public class ClassList {

    ArrayList<Classmate> classList;

    public ClassList(){
        this.classList = new ArrayList<>();
        generateClassmateList();
    }

    private void generateClassmateList(){

        ArrayList<String> students = new ArrayList<>(Arrays.asList("Ja'mez", "Brian", "Christie", "Nada", "Mikayla", "Omar", "Jamie", "Kareem", "David", "Jordan", "Joe"));

        for (String student: students ) {
            classList.add(new Classmate(student));
        }
    }

    private void removeClassmate(String name){

        for(int i = 0; i < classList.size(); i++){
            if(classList.get(i).getName().equals(name)){
                classList.remove(i);
            }
        }
    }

    public void printClassListDetails(){
        for (Classmate classmate:classList) {
            System.out.println(classmate.getName() + ", ");
        }
    }
}
