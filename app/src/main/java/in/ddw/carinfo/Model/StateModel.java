package in.ddw.carinfo.Model;

public class StateModel {

    public int image;
    public String statename;

    public StateModel(int image, String statename) {
        this.image = image;
        this.statename = statename;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }




}
