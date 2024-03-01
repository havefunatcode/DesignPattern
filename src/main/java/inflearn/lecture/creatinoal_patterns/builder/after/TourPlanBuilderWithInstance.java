package inflearn.lecture.creatinoal_patterns.builder.after;

import inflearn.lecture.creatinoal_patterns.builder.before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilderWithInstance {
    TourPlanBuilderWithInstance newInstance();
    TourPlanBuilderWithInstance title(String title);
    TourPlanBuilderWithInstance nightsAndDays(int nights, int days);
    TourPlanBuilderWithInstance startDate(LocalDate localDate);
    TourPlanBuilderWithInstance whereToStay(String whereToStay);
    TourPlanBuilderWithInstance addPlan(int day, String plan);
    TourPlan getPlan();
}
