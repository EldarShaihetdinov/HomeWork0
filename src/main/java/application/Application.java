package application;

public class Application {
    public static void main(String[] args) {
        House house0 = new House(3,"Белый","Ул.Пушкина");
        Owner owner0 = new Owner("Лупа","Пупкин",11);
        house0.setOwner(owner0);
        System.out.println(house0.getOwner());


    }



}
