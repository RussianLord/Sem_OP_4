import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stuff ivan = new Stuff(1,"Инженер",10000,"Иван","Петров",30);
        Stuff oleg = new Stuff(2,"Механик",20000,"Олег","Иванов",40);
        Stuff anton = new Stuff(3,"Бухгалтер",15000,"Антон","Сидоров",27);
        Company house = new Company();
        house.listAdd(ivan);
        house.listAdd(oleg);
        house.listAdd(anton);
        house.getList();
        System.out.println("Введи имя");
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        for (Stuff stuff: house) {
//            if(name.equals(stuff.getFirstName())){
//                System.out.println(stuff.getInfo());
//            }
//            else {
//                System.out.println("Нет такого сотрудника");
//            }
//        }
        int idSt = scanner.nextInt();
        house.removeStuff(idSt);
        house.getList();




    }
}