package abstract_types;

import java.util.ArrayList;
import java.util.List;

public class Register {

    List<Nameable> nameables; //instance variable


    /**
     * we pass in a list of nameables to the class when instantiating it
     *
     * @param nameables list of nameables
     */
    public Register(List<Nameable> nameables) {
        this.nameables = nameables;
    }

    /**
     * this method loops through a list of nameable objects and extracts the names by calling getName() method
     *
     *
     * @return list of names
     */
    public List<String> getRegister() {
        List<String> names = new ArrayList<>(); // create a temporal list to hold our names

        for (Nameable nameable : nameables) { //loop through list of nameables
            names.add(nameable.getName()); // add the name of each nameable to the list we created earlier
        }

        return names; //return a list of names
    }
}
