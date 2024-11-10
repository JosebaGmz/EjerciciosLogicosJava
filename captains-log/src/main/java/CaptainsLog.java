import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int position = random.nextInt(10);

        return PLANET_CLASSES[position];
    }

    String randomShipRegistryNumber() {
        int shipNumber = 1000 + random.nextInt(9000);

        return "NCC-"+shipNumber;
    }

    double randomStardate() {
        return  41000.0 + 1000.0 * random.nextDouble();
    }
}
