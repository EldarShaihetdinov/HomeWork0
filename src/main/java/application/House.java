package application;

public class House {
    final private int STAGE;
    private String Colour;
    private String address;
    private Owner owner;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public House(int Stage, String colour, String address) {
        this.STAGE = Stage;
        this.Colour = colour;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
