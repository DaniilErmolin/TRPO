public class Airbus extends Plain
{
    public Airbus(String name, int countPassenger, int countFuel, String flight, int distance)
    {
        super(name, countPassenger, countFuel, flight, distance);
    }

    @Override
    public String toString() {
        return "Airbus{" +
                "Name='" + Name + '\'' +
                ", CountPassenger=" + CountPassenger +
                ", CountFuel=" + CountFuel +
                ", Flight='" + Flight + '\'' +
                ", Distance=" + Distance +
                '}';
    }
}
