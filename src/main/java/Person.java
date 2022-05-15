public  class Person{
    public String name;
    public String surname;
    public boolean moneyNeed;
    public boolean moneySaved;
    public boolean canUseVacationDays;

    public Person(String name, String surname, boolean moneyNeed, boolean moneySaved, boolean canUseVacationDays) {
        this.name = name;
        this.surname = surname;
        this.moneyNeed = moneyNeed;
        this.moneySaved = moneySaved;
        this.canUseVacationDays = canUseVacationDays;
    }
}