package org.example;

import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Lizge", "Evcin"));
        employees.add(new Employee(2, "Melisa", "Kabasakal"));
        employees.add(new Employee(3, "Didem", "Ogur"));
        employees.add(new Employee(4, "Onur", "Olgac"));
        employees.add(new Employee(2, "Melisa", "Kabasakal"));
        employees.add(new Employee(1, "Lizge", "Evcin"));
        employees.add(new Employee(4, "Onur", "Olgac"));




    }

    public static List<Employee> findDuplicates(List<Employee> list) {
        Set<Employee> uniqueSet = new HashSet<>();
        List<Employee> duplicates = new ArrayList<>();

        for (Employee employee : list) {
            if (!uniqueSet.add(employee)) {  // If add returns false, it's a duplicate
                duplicates.add(employee);
            }
        }
        return duplicates;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> list) {
        Map<Integer, Employee> uniqueEmployees = new HashMap<>();
        Map<Integer, Integer> idCountMap = new HashMap<>();

        for (Employee employee : list) {
            if (employee != null) {
                int id = employee.getId();
                idCountMap.put(id, idCountMap.getOrDefault(id, 0) + 1);
            }
        }

        for (Employee employee : list) {
            if (employee != null && idCountMap.get(employee.getId()) == 1) {
                uniqueEmployees.put(employee.getId(), employee);
            }
        }

        return uniqueEmployees;
    }




    public static LinkedList<Employee> removeDuplicates(List<Employee> list) {
        Set<Employee> seen = new HashSet<>();
        LinkedList<Employee> result = new LinkedList<>();

        for (Employee employee : list) {
            if (employee != null && seen.add(employee)) {
                result.add(employee);
            }
        }
        return result;
    }

}
