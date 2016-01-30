package ua.npu.project.library;



public class Magazine extends Publication{

    public int Namber();
    public double lenght;

    public Video(String format, double lenght) {
        this.format = format;
        this.lenght = lenght;
    }

    public Video() {
        this.format = "";
        this.lenght = 0;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
}
