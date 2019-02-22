public class HotPotatoDemo {

    public static void main(String[] args) {

    ClassList classList = new ClassList();
        classList.printClassListDetails();

        classList.removeClassmate("Joe");

        classList.printClassListDetails();

       Classmate randomClassmate = classList.getRandomClassmate();
       randomClassmate.printClassmateDetails();

    }
}
