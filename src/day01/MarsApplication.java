package day01;

class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;
        spirit.showAttributes();

        System.out.println("Increasing speed to 3.");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("Increasing temperature to -90.");
        spirit.temperature = -90;
        spirit.showAttributes();

        spirit.checkTemperature();
        spirit.showAttributes();

    }
}