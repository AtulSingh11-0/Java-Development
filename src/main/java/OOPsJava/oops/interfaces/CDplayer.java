package OOPsJava.oops.interfaces;

public class CDplayer implements Media{
    @Override
    public void start() {
        System.out.println("Music start");
    }
    public void stop() {
        System.out.println("Music stop");
    }
}
