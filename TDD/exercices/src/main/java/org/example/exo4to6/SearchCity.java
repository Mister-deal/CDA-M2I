package org.example.exo4to6;

import org.example.exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class SearchCity {

    private List<String> cities = new ArrayList<>();

    public void setCities(List<String> cities) {
        this.cities = cities;
    }
    public List<String> search(String word) {
        if(word.equals("*"))
            return cities;
        if(word.length() < 2)
            throw new NotFoundException();
        List<String> result = new ArrayList<>();
        for(String city: cities) {
            if(city.toLowerCase().contains(word.toLowerCase()))
                result.add(city);
        }
        return result;
    }
}
