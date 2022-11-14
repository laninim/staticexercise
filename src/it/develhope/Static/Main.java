package it.develhope.Static;

import it.develhope.Class.Badge;
import it.develhope.Class.Employee;

public class Main {
    public static void main(String[] args) {

        Employee david = new Employee("David","Ricchiuti","Garbatella street 23");
        Employee bruss = new Employee("Bruss","Kett", "Sira street 18");

        Badge davidBadge = new Badge(david);
        Badge brussBadge = new Badge(bruss);

        davidBadge.showBadgeDetails();
        brussBadge.showBadgeDetails();
    }
}