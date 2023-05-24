public class Bombardier extends Plain
{
    public Bombardier(String name, int countPassenger, int countFuel, String flight, int distance)
    {
        super(name, countPassenger, countFuel, flight, distance);
    }

    @Override
    public String toString() {
        return "Bombardier{" +
                "Name='" + Name + '\'' +
                ", CountPassenger=" + CountPassenger +
                ", CountFuel=" + CountFuel +
                ", Flight='" + Flight + '\'' +
                ", Distance=" + Distance +
                '}';
    }
}
