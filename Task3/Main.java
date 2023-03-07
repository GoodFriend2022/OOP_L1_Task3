package Task3;
// Подумать как описать логику взаимодействия человека и домашнего питомца. 
// Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается. 
// Какое ещё взаимодействие может быть?
public class Main {
    public static void main(String[] args) {
        Human victor = new Human("Victor");
        victor.pat(Species.dog);
        
        Cat cat = new Cat();
        System.out.println(cat.sayAnimal());
    }
}