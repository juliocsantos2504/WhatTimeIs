public non-sealed class USAClock extends Clock{
    private  String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setBeforeMidday(){
        this.periodIndicator ="AM";
    }
    public void setAfterMidday(){
        this.periodIndicator ="PM";
    }

    public void setHour(int hour) {
        setBeforeMidday();
        if((hour>12)&&(hour <=23)){
            setAfterMidday();
            this.hour = hour - 12;
        }
        else if (hour >= 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }


    @Override
    Clock convert(Clock clock) {
        switch (clock) {
            case USAClock usaClock ->{
                this.hour = usaClock.getHour();
                this.periodIndicator = usaClock.getPeriodIndicator();
            }
            case BrazilClock brlClock -> this.setHour(brlClock.getHour());
        }
        return this;
    }

    @Override
    public String getTime() {
        return super.getTime()+ " "+ this.periodIndicator;
    }
}
