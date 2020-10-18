package gui.page;
 
public class SpendPage {
    //Monthly Expense
    public String monthSpend;
    //Today Expense
    public String todaySpend;
    //Daily Expense
    public String avgSpendPerDay;
    //Month available
    public String monthAvailable;
    //Daily available
    public String dayAvgAvailable;
    //Month left day
    public String monthLeftDay;
    //Usage Percentage
    public int usagePercentage;
    //is Overspend
    public boolean isOverSpend = false;
 
    public SpendPage(int monthSpend, int todaySpend, int avgSpendPerDay, int monthAvailable, int dayAvgAvailable,
            int monthLeftDay, int usagePercentage) {
        this.monthSpend = "$" + monthSpend;
        this.todaySpend = "$" + todaySpend;
        this.avgSpendPerDay = "$" + avgSpendPerDay;
        if (monthAvailable < 0)
            isOverSpend = true;
 
        if (!isOverSpend) {
            this.monthAvailable = "$" + monthAvailable;
            this.dayAvgAvailable = "$" + dayAvgAvailable;
        } else {
            this.monthAvailable = "overspend:" + (0 - monthAvailable);
            this.dayAvgAvailable = "$0";
        }
 
        this.monthLeftDay = monthLeftDay + " days";
        this.usagePercentage = usagePercentage;
    }
}