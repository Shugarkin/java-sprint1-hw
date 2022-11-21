public class Converter {
    public double kkal = 0;
    public double dist = 0;

    public double convertDist(int saveDayStep) {

        return dist = (saveDayStep * 75) / 10000;
    }

    public double convertKkal(int saveDayStep) {
        return kkal = saveDayStep * 0.05;
    }
}
