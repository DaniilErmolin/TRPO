import java.util.ArrayList;

public class Plain {
    public String Name;
    public int CountPassenger;
    public int CountFuel;
    public String Flight;
    public int Distance;


    public Plain(String name, int countPassenger, int fuel, String flight, int distance)
    {
        Name = name;
        CountPassenger = countPassenger;
        CountFuel = fuel;
        Flight = flight;
        Distance = distance;
    }

    @Override
    public String toString() {
        return "Plain{" +
                "Name='" + Name + '\'' +
                ", CountPassenger=" + CountPassenger +
                ", CountFuel=" + CountFuel +
                ", Flight='" + Flight + '\'' +
                ", Distance=" + Distance +
                '}';
    }

    public double GetFuelConsumption(){
        return Math.rint((double)(CountFuel) / Distance * 100);
    }
}