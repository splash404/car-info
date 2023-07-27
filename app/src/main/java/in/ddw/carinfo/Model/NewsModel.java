package in.ddw.carinfo.Model;

public class NewsModel {

    int Image;
    String title;
    String date;
    String createdBy;

    public NewsModel(int image, String title, String date, String createdBy) {
        Image = image;
        this.title = title;
        this.date = date;
        this.createdBy = createdBy;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }


}
