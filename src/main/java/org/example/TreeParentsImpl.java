package org.example;

import java.util.ArrayList;
import java.util.List;

/*реализуйте этим классом метод интерфейса TreeParents -> getTreeParents(), только сделайте его не статичным,
а в методе main при его вызове создавайте объект этого класса.
 В интерфейсе TreeParents -> void getTreeParents(Person father, Person mother, Person daughter, Person son);*/
class TreeParentsImpl extends Person implements TreeParents {

//    private String name;

    public TreeParentsImpl(Person name, Person daughter) {
        super(String.valueOf(name));
        List<Person> parents = new ArrayList<>();


        if (daughter != null) {
            parents.add(daughter);
        }
        System.out.println(daughter);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                '}';
    }
}





