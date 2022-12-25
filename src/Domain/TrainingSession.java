public class TrainingSession {

    private int day;
    private int hour;
    private MembershipPackage package;

    public TrainingSession(int day, int hour, MembershipPackage package) {
        this.day = day;
        this.hour = hour;
        this.package = package;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public MembershipPackage getPackage() {
        return package;
    }

}
