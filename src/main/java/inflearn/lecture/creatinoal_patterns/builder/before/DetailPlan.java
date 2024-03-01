package inflearn.lecture.creatinoal_patterns.builder.before;

public class DetailPlan {

    private int day;
    private String plan;

    @Override
    public String toString() {
        return "DetailPlan{" +
                "day=" + day +
                ", plan='" + plan + '\'' +
                '}';
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public DetailPlan(int day, String plan) {
        this.day = day;
        this.plan = plan;
    }
}
