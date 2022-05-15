import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VacationPlansTestClass {
    VacationPlans plans = new VacationPlans();

    //    //(person.moneySaved > person.moneyNeed) = a
    //    //(vacationDates.datesAreWorkingDays) = b
    //    //(person.canUseVacationDays == 1)   = c
    // 1: a = T , b = T , c = T
    @Test
    public void testRow1() throws Exception {
        VacationDates date = new VacationDates(true);
        Person person = new Person("Mihaela", "Obadikj",100, 150, 1);
        assertTrue(plans.canGoOnVacation(person,date));
    }

    //2: a = T , b = T , c = F
    @Test
    public void testRow2() throws Exception {
        VacationDates date = new VacationDates(true);
        Person person = new Person("Petar", "Petrovski",200, 350, 0);
        assertTrue(plans.canGoOnVacation(person,date));
    }

    //4: a = T , b = F , c = F
    @Test
    public void testRow4() throws Exception {
        VacationDates date = new VacationDates(false); //(vacationDates.datesAreWorkingDays) = F
        Person person = new Person("Petar", "Petrov",100, 500, 0);
        assertTrue(plans.canGoOnVacation(person,date));
    }

    // 8: a = F , b = F , c = F
    @Test
    public void testRow8() throws Exception {
        VacationDates date = new VacationDates(false); //(vacationDates.datesAreWorkingDays) = F
        Person person = new Person("Maja", "Petrova",100, 10, 0);
        assertTrue(plans.canGoOnVacation(person,date));
    }

}
