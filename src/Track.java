public class Track extends MotorTransport{
    public Track(String modelName){
        super(modelName, 6);
    }
    public Track(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }
    public void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service(){
        super.service();
        checkTrailer();
    }
}
