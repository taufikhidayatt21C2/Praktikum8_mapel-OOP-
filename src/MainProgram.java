public class MainProgram {
    public static void main(String[] args){
// Membuat object engine
        Engine mesin = new Engine();
        mesin.merk = "Honda F23A";
        mesin.cc = 2300;
        Mobil odyssey = new Mobil();
        odyssey.merk = "Honda Odyssey";
        odyssey.mesin = mesin;
        odyssey.addRoda(new Wheel(17, "GT Radial"));
        odyssey.addRoda(new Wheel(17, "GT Radial"));
        odyssey.addRoda(new Wheel(17, "GT Radial"));
        odyssey.addRoda(new Wheel(17, "GT Radial"));
        odyssey.start();
        odyssey.run();
        odyssey.stop();
    }
}