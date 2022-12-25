import java.util.Scanner;

public class TrainingSessionManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrainingSessionHandler handler = new TrainingSessionHandler();

        while (true) {
            System.out.println("1. Book session");
            System.out.println("2. Cancel booking");
            System.out.println("3. Modify booking");
            System.out.println("4. View booked sessions");
            System.out.println("5. Exit");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Enter day: ");
                int day = scanner.nextInt();
                System.out.print("Enter hour: ");
                int hour = scanner.nextInt();
                System.out.print("Enter membership package: ");
                String packageName = scanner.next();
                MembershipPackage package = getMembershipPackage(packageName);
                handler.bookSession(day, hour, package);
            } else if (option == 2) {
                System.out.print("Enter session to cancel: ");
                int sessionIndex = scanner.nextInt();
                TrainingSession session = handler.getBookedSessions().get(sessionIndex);
                handler.cancelBooking(session);
            } else if (option == 3) {
                System.out.print("Enter session to modify: ");
                int sessionIndex = scanner.nextInt();
                TrainingSession session = handler.getBookedSessions().get(sessionIndex);
                System.out.print("Enter new day: ");
                int newDay = scanner.nextInt();
                System.out.print("Enter new hour: ");
                int newHour = scanner.nextInt();
                handler.modifyBooking(session, newDay, newHour);
            } else if (option == 4) {
                for (int i = 0; i < handler.getBookedSessions().size(); i++) {
                    TrainingSession session = handler.getBookedSessions().get(i);
                    System.out.println(i + ". " + session.getDay() + " " + session.getHour() + " " + session.getPackage().getName());
                }
            } else if (option == 5) {
                break;
            }
        }
    }

    private static MembershipPackage getMembershipPackage(String name) {
        // code to retrieve the membership package with the given name
        // from the list of available packages
    }

}
