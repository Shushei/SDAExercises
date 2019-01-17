package chaos.resztaRzeczy;

import lombok.Getter;
import lombok.Setter;

public class Engine {
    @Setter @Getter int capacity;
    @Setter @Getter int horsePower;
    @Setter @Getter int fuelConsumption;

    public Engine(int capacity,int horsePower,int fuelConsumption){
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
    }

}
