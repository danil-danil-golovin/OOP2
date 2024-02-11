public class Main {
    public static void main(String[] args) {
     Car car = new Car("car1");
     Car car1 = new Car("car2");

     Track track = new Track("track1");
     Track track1 = new Track("track2");

     Bicycle bicycle = new Bicycle("bicycle1");
     Bicycle bicycle1 = new Bicycle("bicycle2");

     Transport[] transports = {
             car,
             car1,
             track,
             track1,
             bicycle,
             bicycle1
     };
     ServiceStation station = new ServiceStation();
     for (Transport transport: transports){
         station.check(transport);
     }
    }
}