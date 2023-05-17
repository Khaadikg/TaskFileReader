// TODO: 11.02.2023
//  Реализовать readFile(). Логика проста...
//  Вытащить данные из текстового файла и записать их к объекту класса City.
//  Небольшая подсказказка можно использовать метод .split() класса String.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

// TODO: 11.02.2023
//  После того как ты закончил предыдущий метод можешь приступить к следуещему.
//  Вся суть printAllCities() заключается в том, что надо вывести все города на консоль.
public class CityMethodsImpl implements CityMethods {

//    private static City[] usingCity = new City[1109];

    @Override
    public City[] readFile() {
        City[] usingCity = new City[1109];
        int counter = 0;
        try {
            FileReader reader = new FileReader("city_ru.csv");
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                String[] check = scanner.nextLine().split(";");
                City city = new City();
                // filing City with info
                city.setId(Integer.parseInt(check[0]));
                city.setName(check[1]);
                city.setDistrict(check[2]);
                city.setRegion(check[3]);
                city.setPopulation(Integer.parseInt(check[4]));
                // some Cities don't have foundation date
                // catching null pointer exception for date of foundation
                try {
                    city.setFoundation(check[5]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    city.setFoundation(null);
                }
                usingCity[counter] = city;
                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return usingCity;
    }

    @Override
    public void printAllCities(City[] cities) {
        for (City out: cities) {
            System.out.println(out);
        }
    }

    @Override
    public void groupByRegion(City[] cities) {
        List<City> newCities = new ArrayList<>();
        for (int i = 0; i < cities.length; i++) {
            if (cities[i] != null) {
                newCities.add(cities[i]);
                for (int j = i + 1; j < cities.length - 1; j++) {
                    if(cities[j] != null) {
                        if (cities[i].getRegion().equalsIgnoreCase(cities[j].getRegion())) {
                            newCities.add(cities[j]);
                            cities[j] = null;
                        }
                    }
                }
            }
        }
        Arrays.stream(newCities.toArray(new City[1109])).forEach(System.out::println);
    }

    @Override
    public void searchByName(String name) {
        City[] cities = readFile();
        System.out.println(Arrays.stream(cities).filter(x -> x.getName().equals(name)).findFirst().get());
    }
}