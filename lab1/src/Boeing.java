public class Boeing extends Plain
{
    public Boeing(String name, int countPassenger, int countFuel, String flight, int distance)
    {
        super(name, countPassenger, countFuel, flight, distance);
    }

    @Override
    public String toString() {
        return "Boeing{" +
                "Name='" + Name + '\'' +
                ", CountPassenger=" + CountPassenger +
                ", CountFuel=" + CountFuel +
                ", Flight='" + Flight + '\'' +
                ", Distance=" + Distance +
                '}';
    }
}
