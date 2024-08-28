package Main.java.Course9;

import Main.java.Course10.EntityNotFoundException;
import Main.java.Course10.ValidationException;
import Main.java.course5.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class HumanRepository<T extends Human> {
    private List<T> humans;

    public HumanRepository() {
        this.humans = new ArrayList<>();
    }

    public void add(T toAdd) {
        humans.add(toAdd);
        if (toAdd == null) {
            throw new ValidationException("The object cannot be null!");
        }
    }

    public void getAll() {
        humans.forEach(System.out::println);
    }

    public void deleteById(String id) {
        boolean removed = humans.removeIf(humans -> humans.getUUID().toString().equals(id));
        if (!removed) {
            throw new EntityNotFoundException("Try another Id!");
        }
    }

    public void updateById(String id, T humanUpdate) {
        humans.stream()
                .filter(human -> human.getUUID().toString().equals(id))
                .forEach(human -> {
                    if (humanUpdate.getUUID() == null || Objects.equals(humanUpdate.getFirstName(), "")
                            || Objects.equals(humanUpdate.getLastName(), "")
                            || humanUpdate.getType() == null) {
                        throw new ValidationException("Null human value!");

                    }

                    human.setFirstName(humanUpdate.getFirstName());
                    human.setLastName(humanUpdate.getLastName());
                    human.setBirthDate(humanUpdate.getBirthDate());
                    human.setUUID(humanUpdate.getUUID());
                });

        if (humans.stream().noneMatch(human -> human.getUUID().toString().equals(id))) {
            throw new EntityNotFoundException("No human found with ID: " + id);
        }
        humans.forEach(System.out::println);
    }

    public void getById(String id) {
        if (Objects.equals(id, "")) {
            throw new ValidationException("The Id cannot be null!");
        }
        List<T> readHumanBasedOnId = humans.stream().filter(humans -> humans.getUUID()
                .toString().
                equals(id)).collect(Collectors.toList());
        readHumanBasedOnId.forEach(System.out::println);

    }

    public void getAllByName(String name) {
        List<T> readHumanByName = humans.stream().
                filter(humans -> humans.getFirstName().
                        equals(name)).collect(Collectors.toList());

        if (name == "") {
            throw new ValidationException("The name cannot be null!");
        }
        readHumanByName.forEach(System.out::println);
    }


}
