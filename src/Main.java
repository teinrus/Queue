
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Person> generateClients(List temp) {


        temp.add(new Person("Petr", "Petrov", 1));
        temp.add(new Person("Vasiliy", "Vasiliev", 2));
        temp.add(new Person("Andrey", "Andreev", 3));
        temp.add(new Person("Nikolay", "Nikolaev", 3));
        temp.add(new Person("Valera", "Valeriev", 4));
        return temp;
    }

    public static void print(List list) {
        for (int j = 0; j < list.size(); j++) {
            System.out.println((j + 1) + "." + list.get(j));
        }
    }

    public static void main(String[] args) {
        List<Person> person = new LinkedList<>();

        print(generateClients(person));
        ;

        ArrayDeque<Person> client = new ArrayDeque<>();
        // Первое добавление очереди.
        for (int i = 0; i < person.size(); i++) {
            client.addLast(person.get(i));
        }

        //Первый вариант цикла
/*        while (!client.isEmpty()){

            for(Person p : client){

                if (p.count >0) {
                    p.count-=1;
                    System.out.println(p.name+" "+p.lastName+" прокатился на атракционе у клиента осталось билетов "
                            +p.getCount());
                }else {
                    client.remove();
                }

            }
        }*/
        //Второй вариант цикла
        while (!client.isEmpty()) {
            Person p = client.getFirst();

            if (p.count > 0) {
                p.count -= 1;
                System.out.println(p.name + " " + p.lastName + " прокатился на атракционе у клиента осталось билетов "
                        + p.getCount());
                client.addLast(p);
            }
            client.remove();
        }
    }
}










