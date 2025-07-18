//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Clock brlclock = new BrazilClock();
        brlclock.setSecond(0);
        brlclock.setMinute(0);
        brlclock.setHour(10);

        System.out.println(brlclock.getTime());

        System.out.println(new USAClock().convert(brlclock).getTime());
    }

}