package inflearn.lecture.creatinoal_patterns.builder.after;

import inflearn.lecture.creatinoal_patterns.builder.before.DetailPlan;
import inflearn.lecture.creatinoal_patterns.builder.before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourBuilderWithInstance implements TourPlanBuilderWithInstance{

    private TourPlan plan;

    @Override
    public TourPlanBuilderWithInstance newInstance() {
        this.plan = new TourPlan();
        return this;
    }

    @Override
    public TourPlanBuilderWithInstance title(String title) {
        this.plan.setTitle(title);
        return this;
    }

    @Override
    public TourPlanBuilderWithInstance nightsAndDays(int nights, int days) {
        this.plan.setNights(nights);
        this.plan.setDays(days);
        return this;
    }

    @Override
    public TourPlanBuilderWithInstance startDate(LocalDate localDate) {
        this.plan.setStartDate(localDate);
        return this;
    }

    @Override
    public TourPlanBuilderWithInstance whereToStay(String whereToStay) {
        this.plan.setWhereToStay(whereToStay);
        return this;
    }

    @Override
    public TourPlanBuilderWithInstance addPlan(int day, String plan) {
        if (this.plan.getPlans() == null || this.plan.getPlans().size() == 0) {
            this.plan.setPlans(new ArrayList<>());
        }
        this.plan.getPlans().add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return this.plan;
    }
}
