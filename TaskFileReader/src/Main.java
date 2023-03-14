/**
 * УДАЧИ ТЕБЕ
 */
public class Main {
    public static void main(String[] args) {
//        City city = new City("Адыгейск","Адыгея","Южный",12248,"1973");
        CityMethodsImpl check = new CityMethodsImpl();
        check.printAllCities(check.readFile());
    }

}