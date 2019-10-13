import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many do you want add customer and employee?: ");
        int input = scan.nextInt();
        System.out.print("Please enter a id,name,lastname and an age\n");

        ArrayList<Person> customers = new ArrayList<>();
        ArrayList<Person> employees = new ArrayList<>();

        Person person;

        for (int i = 0; i < input; i++) {
            System.out.printf("%d.customer's informations\n", i + 1);
            System.out.print("id:");
            int id = scan.nextInt();

            System.out.print("name:");
            String name = scan.next();

            System.out.print("lastName:");
            String lastName = scan.next();

            System.out.print("Age:");
            int age = scan.nextInt();

            customers.add(new Customer(id, name, lastName, age));
        }

        for (int i = 0; i < input; i++) {
            System.out.printf("%d.employee's informations\n", i + 1);
            System.out.print("id:");
            int id = scan.nextInt();

            System.out.print("name:");
            String name = scan.next();

            System.out.print("lastName:");
            String lastName = scan.next();

            System.out.print("Age:");
            int age = scan.nextInt();

            employees.add(new Employee(id, name, lastName, age));
        }

        System.out.print("Which database do you want to save:? MySqlDal[1]-MsSqlDal[2]-OracleDal[3]:");

        IpersonDal personDal = null;

        int choice1 = scan.nextInt();

        switch (choice1) {
            case 1:
                personDal = new MySqlDal();
                personDal.add();

                break;
            case 2:
                personDal = new MsSqlDal();
                personDal.add();

                break;
            case 3:
                personDal = new OracleDal();
                personDal.add();

                break;

        }

        System.out.print("for customers press[1] for employees press[2]:");
        int choice2 = scan.nextInt();

        switch (choice2) {
            case 1:
                printPersons(customers);
                break;
            case 2:
                printPersons(employees);
                break;
        }

    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.printf("id:%d\nname:%s\nlastName:%s\nage:%d\n",
                    person.getId(), person.getName(), person.getLastName(), person.getAge());
            System.out.println();
        }

    }

}