package carracing;

public class Application {

    public static void main(String[] args) {
        try {
            CarRacingManager carRacingManager = new CarRacingManager();
            carRacingManager.runCarRacing();
        } catch (IllegalArgumentException msg) {
            System.out.println(msg.getMessage());
        } catch (Exception msg) {
            System.out.println("알수 없는 예외가 발생하였습니다.");
        }
    }

}