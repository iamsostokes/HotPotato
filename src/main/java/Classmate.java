import java.util.ArrayList;

public class Classmate {

    private String name;
    private Potato currentPotato;

    public Classmate(String name){
        this.name = name;
    }

    public void printClassmateDetails() {
        System.out.println("The classmate name is " + name + ". \n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Potato getCurrentPotato() {
        return currentPotato;
    }

    public void passPotato(Potato potato, ClassList classlist, int number){

        if(number == 0) {
            System.out.println( potato.getPotato().get(potato.getPotato().size() - 1) + " HOT POTATO!!!!");
        } else if(number <= 10 && number > 0){
            int newNumber = number - 1;
            Potato newPotato = potato;
            ClassList classList = classlist;

            newPotato.addNameToPotato(this.name);
            newPotato.printPotatoDetails();
            Classmate randomClassmate = getRandomClassmate(classlist);
            randomClassmate.passPotato(newPotato, classlist, newNumber);
        }  else {
            System.out.println("___________________");
        }

    }


    public Classmate getRandomClassmate(ClassList classList){
        return classList.getRandomClassmate();

    }



}
