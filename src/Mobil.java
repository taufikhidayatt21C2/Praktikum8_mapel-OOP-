import java.util.List;

public class Mobil {
    public String merk;
    public Engine mesin;
    public List<Wheel> roda;

    public Mobil() {
        this.roda = new List<Wheel>();
    }

    public AddRoda(Wheel w) {
        this.roda,add(w);
    }

    public void start(){
        mesin.start();
    }

    public void stop(){
        mesin.stop();
    }

    public void run(){
        System.out.println("Mobil running...");

    }
}
