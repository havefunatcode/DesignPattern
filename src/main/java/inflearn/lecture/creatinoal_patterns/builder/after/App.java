package inflearn.lecture.creatinoal_patterns.builder.after;

import inflearn.lecture.creatinoal_patterns.builder.before.TourPlan;

public class App {

    public static void main(String[] args) {
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan plan = tourDirector.cancunTrip();
        TourPlan longBeachTrip = tourDirector.longBeachTrip();
    }

}
