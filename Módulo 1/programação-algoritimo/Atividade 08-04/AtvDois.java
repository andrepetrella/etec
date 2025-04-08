public class AtvDois
{
    public static void main(String[] args)
    {
        double daily_spent = 5.20, total;
        int days = 30, times_spent_a_day = 4;

        total = (daily_spent * times_spent_a_day) * days;

        System.out.println("Total spent in " + days + " days: $" + total);
    }
}