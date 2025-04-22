package homeassignments.task19;

import java.util.Collection;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        Collection<City> cities = createCities();

        System.out.println("Город с самым большим населением: " + findMaxPopulationCity(cities));
        System.out.println("Город с самым маленьким населением: " + findMinPopulationCity(cities));
        System.out.println("Cамый густонаселённый город на континенте: "
                + findMaxPopulationCityByContinent(cities, Continent.AUSTRALIA));
        System.out.println("Cамый малонаселённый город на континенте: "
                + findMinPopulationCityByContinent(cities, Continent.AUSTRALIA));
        System.out.println("Первый попавшийся город с населением больше 1 млн: "
                + findFirstMoreThanMillionPopulationCity(cities));
        System.out.println("Города с населением больше 1 млн: "
                + findMoreThanMillionPopulationCity(cities));
        System.out.println("Список городов: "
                + createCitiesMap(cities));
    }

    public static Collection<City> createCities() {
        City city1 = new City(1, "Минск", 1992862, Continent.EURASIA);
        City city2 = new City(2, "Москва", 13149803, Continent.EURASIA);
        City city3 = new City(3, "Вильнюс", 581475, Continent.EURASIA);
        City city4 = new City(4, "Вашингтон", 678972, Continent.NORTHAMERICA);
        City city5 = new City(5, "Торонто", 3026000, Continent.NORTHAMERICA);
        City city6 = new City(6, "Сидней", 5367206, Continent.AUSTRALIA);
        City city7 = new City(7, "Мельбурн", 5207000, Continent.AUSTRALIA);
        City city8 = new City(8, "Каир", 8105086, Continent.AFRICA);
        City city9 = new City(9, "Кейпутан", 4773000, Continent.AFRICA);
        City city10 = new City(10, "Сан-Паулу", 11450000, Continent.SOUTHAMERICA);
        City city11 = new City(11, "Сантьяго", 6903479, Continent.SOUTHAMERICA);

        List<City> cities = List.of(city1, city2, city3, city4, city5, city6, city7, city8, city9, city10, city11);

        return cities;
    }

    public static City findMinPopulationCity(Collection<City> cities) {
        return cities.stream().min(City::compareTo).get();
    }

    public static City findMaxPopulationCity(Collection<City> cities) {
        return cities.stream().max(City::compareTo).get();
    }

    public static City findMinPopulationCityByContinent(Collection<City> cities, Continent continent) {
        return cities.stream().filter(city -> city.getContinent().equals(continent)).min(City::compareTo).get();
    }

    public static City findMaxPopulationCityByContinent(Collection<City> cities, Continent continent) {
        return cities.stream().filter(city -> city.getContinent().equals(continent)).max(City::compareTo).get();
    }

    public static City findFirstMoreThanMillionPopulationCity(Collection <City> cities) {
        return cities.stream().filter(city -> city.getPopulation() > 1000000).findFirst().get();
    }

    public static List<City> findMoreThanMillionPopulationCity(Collection<City> cities) {
        return cities.stream().filter(city -> city.getPopulation() > 1000000).toList();
    }

    public static Collection<String> createCitiesMap(Collection<City> cities) {
        return cities.stream().map(city -> city.getName()).toList();
    }
}