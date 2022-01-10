package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    public List<Client> readFromFile(String fileName, String character) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        String[] attributes;
        Client client;
        List<Client> clientList = new ArrayList<>();
        while (line != null) {
            attributes = line.split(character);
            client = new Client(Integer.parseInt(attributes[0]), attributes[1],
                    BusinessSize.valueOf(attributes[2]), Integer.parseInt(attributes[3]),
                    Integer.parseInt(attributes[4]), attributes[5]);
            clientList.add(client);

            line = bufferedReader.readLine();
        }
        return clientList;
    }
    public void writeToFile (String fileName, List<Client> list, String character) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Client client : list) {
            String line = client.getId() + character + client.getBusinessName() + character + client.getBusinessSize()
                    + character + client.getNumberOfEmployees() + character
                    + client.getIncome() + character + client.getLocation();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

    public void writeLocationAndIncome (String fileName, List<Client> list, String character) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Client client : list) {
            String line = client.getLocation() + character + client.getIncome();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
    }

}
