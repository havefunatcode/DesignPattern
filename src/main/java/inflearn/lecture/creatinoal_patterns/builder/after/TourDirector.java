package inflearn.lecture.creatinoal_patterns.builder.after;

import inflearn.lecture.creatinoal_patterns.builder.before.TourPlan;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "Check In")
                .addPlan(0, "Dinner")
                .getPlan();
    }

    public TourPlan longBeachTrip() {
        return  tourPlanBuilder.title("Long Beach")
                .startDate(LocalDate.of(2021, 7, 15))
                .getPlan();
    }
}
