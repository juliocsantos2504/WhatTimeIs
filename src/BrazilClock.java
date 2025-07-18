public non-sealed class BrazilClock extends Clock{


    @Override
    Clock convert(final Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USAClock usaClock -> this.hour = (usaClock.getPeriodIndicator().equals("PM"))?
                        usaClock.getHour() + 12 :
                        usaClock.getHour();

            case BrazilClock brlClock -> this.hour = brlClock.getHour();

        }
        return this;
    }

}
