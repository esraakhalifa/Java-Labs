

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;



public class Exercise2 {

    public static List<City> getHighestPopulatedCities(String continent)
    {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        List<Country> countries = countryDao.findAllCountries();
        return countries.stream()
        .filter(country -> country.getContinent().equals(continent))  // Filter by continent
        .map(country -> country.getCities().stream() 
            .max(Comparator.comparing(City::getPopulation)))  
        .filter(Optional::isPresent)  
        .collect(Collectors.toList()); 
    }

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
  //      write your answer here
        List<Country> countries = countryDao.findAllCountries();
        Set<String>  continents = countryDao.getAllContinents();
        List<City> highestPopulatedCities = countries.stream().map(country -> country.getCities().stream().max(Comparator.comparing(City::getPopulation)))
        .filter(Optional::isPresent).map(X -> X.get()).collect(Collectors.toList());

        continents.stream()
    .map(continent -> getHighestPopulatedCities(continent).stream() // filter by continent
        .max(Comparator.comparing(City::getPopulation)) // maximum population
        .orElse(null))
    .filter(Objects::nonNull).forEach(city -> System.out.println(city)) ;
    }
    }



