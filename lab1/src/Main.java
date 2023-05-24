import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static PlainRepository plainRepository = new PlainRepository(new ArrayList<>(Arrays.asList(
            new Boeing("Boeing 747-400", 4142, 3290, "Беларусь-Туркменистан", 2390),
            new Bombardier("Bombardier CRJ-200LR", 5521, 1320, "Беларусь-Турция", 6700),
            new Airbus("Airbus A330-300", 3127, 7980, "Беларусь-Египет", 1370))));

    public static void main(String[] args){
        var flag = true;

        while(flag){
            ShowMenu();
            String choice = (new Scanner(System.in)).next();
            System.out.println("\f");

            switch (choice){
                case "1":
                    ShowPlains();
                    break;
                case "2":
                    AddPlane();
                    break;
                case "3":
                    System.out.println("Введите номер самолёта который надо удалить: ");
                    int index = (new Scanner(System.in)).nextInt();
                    plainRepository.Remove(index);
                    break;
                case "4":
                    UpdatePlane();
                    break;
                case "5":
                    System.out.println("Введите номер самолёта для которого вы хотите найти расход топлива: ");
                    index = (new Scanner(System.in)).nextInt();
                    System.out.println("Расход топлива: " + GetFuelConsumptionByIndex(index));
                    break;
                case "6":
                    System.out.println("Введите количество пассажиров: ");
                    int count = (new Scanner(System.in)).nextInt();
                    var plains = plainRepository.GetPlainsWhereCountPassengerLess(count);
                    System.out.println("\nСамолеты где количество пассажиров меньше чем " + count + "\n");
                    for(var plain : plains){
                        System.out.println(plain);
                    }
                    break;
                case "7":
                    System.out.println("Введите первую букву: ");
                    String letter = (new Scanner(System.in)).next();
                    plains = plainRepository.GetPlainWhereNameStartFromLetter(letter);
                    System.out.println("\nСамолеты которые начинаются на букву" + letter + "\n");
                    for(var plain : plains){
                        System.out.println(plain);
                    }
                    break;
                case "8":
                    flag = false;
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Такого пункта меню нет");
                    break;
            }
            System.out.println("\n\n");
        }
    }

    private static void ShowMenu(){
        System.out.println("1. Вывести все самолёты");
        System.out.println("2. Добавить самолёт");
        System.out.println("3. Удалить самолёт");
        System.out.println("4. Обновить самолёт");
        System.out.println("5. Посчитать расход топлива самолёта");
        System.out.println("6. Вывести все самолеты, которые содержать количество пассажиров меньше заданного");
        System.out.println("7. Вывести все самолеты, название которых начинается с букву заданную букву");
        System.out.println("8. Выход");
    }

    private static void ShowPlains(){
        System.out.println("Список самолётов:\n");
        for(int i = 0; i < plainRepository.GetLen(); i++)
            System.out.println(i + ". " + plainRepository.Get(i));
    }

    private static double GetFuelConsumptionByIndex(int index){
        return plainRepository.Get(index).GetFuelConsumption();
    }

    private static void AddPlane(){
        System.out.println("Выберите тип самолета:");
        System.out.println("1. Boeing");
        System.out.println("2. Airbus");
        System.out.println("3. Bombardier");
        var type = (new Scanner(System.in)).nextInt();

        System.out.println("Введите название самолета:");
        var name = (new Scanner(System.in)).next();

        System.out.println("Введите количество пассажиров:");
        var countPassenger = (new Scanner(System.in)).nextInt();

        System.out.println("Введите количество топлива:");
        var countFuel  = (new Scanner(System.in)).nextInt();

        System.out.println("Введите маршрут:");
        var flight  = (new Scanner(System.in)).next();

        System.out.println("Введите дистанцию:");
        var distance  = (new Scanner(System.in)).nextInt();


        if (type == 1){
            plainRepository.Add(new Boeing(name, countPassenger, countFuel, flight, distance));
        } else if (type == 2){
            plainRepository.Add(new Airbus(name, countPassenger, countFuel, flight, distance));
        } else if (type == 3){
            plainRepository.Add(new Bombardier(name, countPassenger, countFuel, flight, distance));
        } else {
            System.out.println("Такого типа нет");
        }
    }

    private static void UpdatePlane(){
        System.out.println("Введите номер самолета который надо изменить");
        var index = (new Scanner(System.in)).nextInt();

        var plane = plainRepository.Get(index);

        System.out.println("Введите название самолета:");
        plane.Name = (new Scanner(System.in)).next();

        System.out.println("Введите количество пассажиров:");
        plane.CountPassenger = (new Scanner(System.in)).nextInt();

        System.out.println("Введите количество топлива:");
        plane.CountFuel = (new Scanner(System.in)).nextInt();

        System.out.println("Введите маршрут:");
        plane.Flight = (new Scanner(System.in)).next();

        System.out.println("Введите дистанцию:");
        plane.Distance  = (new Scanner(System.in)).nextInt();

        plainRepository.Update(index, plane);
    }
}