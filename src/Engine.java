public class Engine implements IEngine {
        public String merk;
        public int cc;
        @Override
        public void start() {
            System.out.println("Engine starting... ");
        }
        @Override
        public void stop() {
            System.out.println("Engine stopped... ");
        }
    }
