public class HotPotatoDemo {

    public static void main(String[] args) {

    ClassList classList = new ClassList();
    Potato potato = new Potato();

    Classmate firstClassmateWithPotato = classList.getRandomClassmate();
        firstClassmateWithPotato.passPotato(potato, classList, 10);


    }
}
