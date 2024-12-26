

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;




public class Exercise1 {

List<City> getHighestPopulatedCities()
{
   return countries.stream()
    .map(country -> country.getCities().stream()
        .max(Comparator.comparing(City::getPopulation)))
    .filter(Optional::isPresent)
    .map(Optional::get)
    .collect(Collectors.toList());
}


   public static void main(String[] args) {
      CountryDao countryDao= InMemoryWorldDao.getInstance();
      //write your answer here
      List<Country> countries = countryDao.findAllCountries();
      List<City> highestPopulatedCities = countries.stream().map(country -> country.getCities().stream().max(Comparator.comparing(City::getPopulation)))
      .filter(Optional::isPresent).map(X -> X.get()).forEach(x -> System.out.println(x));



   
   }

}
