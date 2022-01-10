package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Service {

    public List<Client> sortListByNumberOfEmployeesDescending(List<Client> list){
        return list.stream()
                .sorted(Comparator.comparing(Client::getNumberOfEmployees).reversed())
                .collect(Collectors.toList());
    }

    public String getTopLocations(List<Client> list) {

    }
}
