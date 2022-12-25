package Domain;

import Domain.TrainingSession;

import java.util.ArrayList;

import java.util.List;
import java.util.ArrayList;

public class TrainingSessionHandler {

    private List<TrainingSession> sessions;

    public TrainingSessionHandler() {
        sessions = new ArrayList<TrainingSession>();
    }

    public void bookSession(int day, int hour, MembershipPackage package) {
        TrainingSession session = new TrainingSession(day, hour, package);
        sessions.add(session);
    }

    public void cancelBooking(TrainingSession session) {
        sessions.remove(session);
    }

    public void modifyBooking(TrainingSession session, int newDay, int newHour) {
        session.setDay(newDay);
        session.setHour(newHour);
    }

    public List<TrainingSession> getBookedSessions() {
        return sessions;
    }

}
