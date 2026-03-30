public class OrbitRunner {

    public static void main(String[] args) {

        SatelliteOrbit o1 = new SatelliteOrbit();
        SatelliteOrbit o2 = new SatelliteOrbit();

        o1.planet = "Earth";
        o1.distance = 35786;
        o1.shape = "Circular";
        o1.satelliteName = "INSAT";
        o1.artificial = true;
        o1.period = 24;
        o1.agency = "ISRO";
        o1.active = true;

        o1.revolve();
        o1.calculateSpeed();
        o1.showSatelliteOrbit();

        System.out.println("-------------");

        o2.planet = "Mars";
        o2.distance = 6000;
        o2.shape = "Elliptical";
        o2.satelliteName = "Mars Orbiter";
        o2.artificial = true;
        o2.period = 26;
        o2.agency = "ISRO";
        o2.active = true;

        o2.revolve();
        o2.calculateSpeed();
        o2.showSatelliteOrbit();

        System.out.println("-------------");

        Orbit ob1 = new SatelliteOrbit();
        Orbit ob2 = new SatelliteOrbit();

        ob1.planet = "Jupiter";
        ob1.distance = 10000;
        ob1.shape = "Elliptical";

        ob1.revolve();
        ob1.calculateSpeed();
        ob1.showOrbit();

        System.out.println("-------------");

        ob2.planet = "Saturn";
        ob2.distance = 12000;
        ob2.shape = "Circular";

        ob2.revolve();
        ob2.calculateSpeed();
        ob2.showOrbit();

        System.out.println("-------------");

        Orbit ob3 = new Orbit();
        Orbit ob4 = new Orbit();

        ob3.planet = "Venus";
        ob3.distance = 8000;
        ob3.shape = "Circular";

        ob3.revolve();
        ob3.calculateSpeed();
        ob3.showOrbit();

        System.out.println("-------------");

        ob4.planet = "Mercury";
        ob4.distance = 5000;
        ob4.shape = "Elliptical";

        ob4.revolve();
        ob4.calculateSpeed();
        ob4.showOrbit();
    }
}