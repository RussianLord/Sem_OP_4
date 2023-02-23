import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<Stuff> {
    private List<Stuff> listPersonal = new ArrayList<>();
    public void listAdd(Stuff person){
        listPersonal.add(person);
    }

    public void removeStuff(int id){
        listPersonal.remove(checkPerson(id));
    }

    @Override
    public Iterator<Stuff> iterator() {
        return listPersonal.iterator();
    }

    public Stuff checkPerson(int id){
        for (Stuff stuff: listPersonal) {
            if(id == stuff.getId()){
                System.out.println(stuff.getInfo());
                return stuff;
            }
        }
        System.out.println("Нет такого сотрудника");
        return null;
    }
    public void getList(){
        for (Stuff stuff: listPersonal) {
            System.out.println(stuff.getInfo());
        }
    }

}
