// TODO: 11.02.2023
//  Реализовать readFile(). Логика проста...
//  Вытащить данные из текстового файла и записать их к объекту класса City.
//  Небольшая подсказказка можно использовать метод .split() класса String.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// TODO: 11.02.2023
//  После того как ты закончил предыдущий метод можешь приступить к следуещему.
//  Вся суть printAllCities() заключается в том, что надо вывести все города на консоль.
public class CityMethodsImpl implements CityMethods {


    @Override
    public City[] readFile() {
        City[] usingCity = new City[1109];
        int counter = 0;
        try {
            FileReader reader = new FileReader("city_ru.csv");
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNext()) {
                String[] check = scanner.nextLine().split(";");
//            City.addToCityList(
//                    new City(check[0],check[1],check[2],Integer.parseInt(check[3]),check[4])
//            );

                City city = new City();
                city.setID(Integer.parseInt(check[0]));
                city.setName(check[1]);
                city.setRegion(check[2]);
                city.setDistrict(check[3]);
                city.setPopulation(Integer.parseInt(check[4]));
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

    }

    @Override
    public void searchByName(String name) {

    }
}
