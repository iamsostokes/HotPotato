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

    public void setCurrentPotato(Potato currentPotato) {
        this.currentPotato = currentPotato;
    }

    //    public void passPotato(Potato potato){
//        this.currentPotato = potato;
//        this.currentPotato.addNameToPotato(this.name);
//    }




}
