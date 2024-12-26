



import java.util.Objects;
import java.util.Optional;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

public class Exercise5 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
        List<City> cities = cityDao.findAllCities();
        List<Country> countries = countryDao.findAllCountries();
       cities.stream()
      .filter(city -> countries.stream()
        .anyMatch(country -> country.getCapital() == city.getCode()))
      .max(Comparator.comparing(City::getPopulation)) 
      .ifPresent(System.out::println); 
       //write your answer here 
    }

}