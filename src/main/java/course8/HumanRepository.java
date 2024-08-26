package Main.java.Course9;

import Main.java.course5.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HumanRepository<T extends Human> {
    private List<T> humans;

    public HumanRepository() {
        this.humans = new ArrayList<>();
    }

    public void add(T toAdd) {
        humans.add(toAdd);
    }

    public void getAll() {
        humans.forEach(System.out::println);
    }

    public void deleteById(String id) {
        humans.removeIf(humans -> humans.getUUID().toString().equals(id));
    }

    // TODO Update by Id method !!


    public void updateById(String id, T humanUpdate) {
        humans.stream()
                .filter(human->human.getUUID().toString().equals(id))
                .forEach(human->{
                    human.setFirstName(humanUpdate.getFirstName());
                    human.setLastName(humanUpdate.getLastName());
                    human.setBirthDate(humanUpdate.getBirthDate());
                    human.setUUID(humanUpdate.getUUID());
                });
        humans.forEach(System.out::println);

    }

    public void getById(String id) {
        List<T> readHumanBasedOnId = humans.stream().filter(humans -> humans.getUUID()
                .toString().
                equals(id)).collect(Collectors.toList());
        readHumanBasedOnId.forEach(System.out::println);
    }

    public void getAllByName(String name) {
        List<T> readHumanByName = humans.stream().
                filter(humans -> humans.getFirstName().
                        equals(name)).collect(Collectors.toList());
        readHumanByName.forEach(System.out::println);
    }


}
