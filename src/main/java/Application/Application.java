package Application;

public class Application {
    public static void main(String[] args) {
       House house0 = new House("Лупа","Белый");
       System.out.println(house0.getSTAGE());
       System.out.println(house0.getOwnerName()+" "+"Цвет: "+house0.getColour());

        System.out.println();
       house0.setOwnerName("Пупа");
       house0.setColour("Чёрный");
       System.out.println(house0.getOwnerName()+" "+"Цвет: "+house0.getColour());

    }



}
