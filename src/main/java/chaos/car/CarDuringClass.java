package chaos.car;

import lombok.Getter;
import lombok.Setter;

public class CarDuringClass {
    public final String id;
    public final int power;
    public final double capacityFuel;
    @Getter @Setter private double fuelLevel;

    public CarDuringClass(String id, int power, double capacityFuel){
        this.id = id;
        this.power = power;
        this.capacityFuel = capacityFuel;
        this.fuelLevel = fuelLevel;
    }
    public double refuel(double level){
        if(capacityFuel>= level+fuelLevel){
            fuelLevel= fuelLevel + level;
            return 0;
        }else{
            double diff = capacityFuel - fuelLevel;
            fuelLevel = capacityFuel;
            return  level - diff;
        }
    }

    public String toString(){
        return id+" " + power;
    }
}
