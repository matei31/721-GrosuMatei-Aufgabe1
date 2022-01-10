package com.company;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Service {

    public List<Client> sortListByNumberOfEmployeesDescending(List<Client> list){
        return list.stream()
                .sorted(Comparator.comparing(Client::getNumberOfEmployees).reversed())
                .collect(Collectors.toList());
    }

    public HashMap<String, Integer> getTopLocations(List<Client> list) {

        return (HashMap<String, Integer>) list.stream()
                .collect(Collectors.groupingBy(Client::getLocation, Collectors.summingInt(Client::getIncome)));
    }
}
