public class Application {

    public static void main(String[] args) {
        try {
            Controller controller = new Controller();
            controller.startCarRacing();
        } catch (IllegalArgumentException msg) {
            System.out.println(msg.getMessage());
        }

    }
}