public enum Planets {
    MERCURY(1, 0, 2440, null),
    VENUS(2, 50290000,  6052, MERCURY),
    EARTH(3, 41400000, 6371, VENUS),
    MARS(4, 78340000, 3390, EARTH),
    JUPITER(5, 550390000, 69911, MARS),
    SATURN(6, 646270000, 58232, JUPITER),
    URANUS(7, 1448950000, 25362, SATURN),
    NEPTUNE(8, 1627450000, 24622, URANUS),
    PLUTO(9, 544840, 1153,NEPTUNE);

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    private final int number;
    private final int distanceFromPrevious;
    private final int distanceFromSun;
    private final int radius;
    private final Planets previousPlanet;

    Planets(int number, int distanceFromPrevious, int radius, Planets previousPlanet) {
        this.number = number;
        this.distanceFromPrevious = distanceFromPrevious;
        this.distanceFromSun = previousPlanet == null ? 58000000 : previousPlanet.getDistanceFromSun() + distanceFromPrevious;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
    }
}