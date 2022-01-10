package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Repository repository = new Repository();
        Service service = new Service();

        //a)
        List<Client> clientList = repository.readFromFile("kundendaten.txt", ",");
        System.out.println(clientList);

        //b), c)
        List<Client> sortedList = service.sortListByNumberOfEmployeesDescending(clientList);
        System.out.println(sortedList);
        repository.writeToFile("kundensortiert.txt", sortedList, ",");

        //d)
        HashMap<String, Integer> map = service.getTopLocations(clientList);
        repository.writeLocationAndIncome("statistik.txt", map);

    }
}
