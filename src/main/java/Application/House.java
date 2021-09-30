package Application;

public class House {
    final private int STAGE = 3;
    private String OwnerName;
    private String Colour;

    public House(String OwnerName, String colour) {

        this.OwnerName = OwnerName;
        this.Colour = colour;
    }


    public String getOwnerName(){
        return OwnerName;
    }
    public void setOwnerName(String name){
        this.OwnerName = name;
    }


    public int getSTAGE() {
        return STAGE;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        this.Colour = colour;
    }
}
