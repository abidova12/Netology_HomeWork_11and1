import ru.netology.domain.Register;
import ru.netology.domain.FilmManager;

public class Main {
    public static void main(String[] args) {
        Register first = new Register("Бладшот");
        Register second = new Register("Вперед");
        Register third = new Register("Отель 'Белград'");
        Register fourth = new Register("Джентельмены");
        Register fifth = new Register("Человек-невидимка");
        Register sixth = new Register("Тролли");
        Register seventh = new Register("Номер один");
        Register eighth = new Register("Ночь");
        Register ninth = new Register("День");
        Register tenth = new Register("Маска");
        Register eleventh = new Register("Воскресение");
        Register twelfth = new Register("Человек-паук");

        FilmManager manager = new FilmManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

        Register[] all = manager.findAll();
        Register[] last = manager.findLast();
    }
}
