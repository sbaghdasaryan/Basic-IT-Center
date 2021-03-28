package generics;

import interfaces.Flyable;

public class Airplane implements Flyable {
    private String name;

    public Airplane(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("Have wings but fly with the help of some engine");
    }

    @Override
    public boolean equals(Object anObject) {
        if (!(anObject instanceof Airplane))
            return false;
        Airplane param = (Airplane) anObject;
        if (param.getName().equals(this.getName())) {
            return true;
        } else {
            return false;
        }
    }
}
