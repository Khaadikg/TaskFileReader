// TODO: 11.02.2023
//  надо создать класс City с полями:
//  ID, NAME, REGION, DISTRICT, POPULATION, FOUNDATION.
//  Класс должен отвечать принципу инкапсуляции и иметь метод toString().
public class City {
    private int ID;
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

// Использование Листов облегчило бы написание кода!
//    private static ArrayList<City> cityList = new ArrayList<>();

    public City() {}
    // Я бы создавал обьект все же через конструктор
//    public City(int ID, String name, String region, String district, int population, String foundation) {
//        // Я дуал ID будет с автозаполнением
//        this.ID++;
//        this.ID = ID;
//        this.name = name;
//        this.region = region;
//        this.district = district;
//        this.population = population;
//        this.foundation = foundation;
//    }


//    public static ArrayList<City> getCityList() {
//        return cityList;
//    }
//
//    protected static void addToCityList(City city) {
//        City.cityList.add(city);
//    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

//1;Адыгейск;Адыгея;Южный;12248;1973
    @Override
    public String toString(){
        return getID() + ";" + getName() + ";" + getRegion() + ";" + getDistrict() + ";" + getPopulation() + ";" + getFoundation();
    }
}
