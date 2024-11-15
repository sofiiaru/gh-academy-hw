package doublecolon;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String make;
    private int model;

    public Car(){}

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, int model) {
        this.make = make;
        this.model = model;
    }
}
