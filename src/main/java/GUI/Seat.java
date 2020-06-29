package GUI;


public class Seat {

    private int seat1;
    private String name1;

    private int seat2;
    private String name2;

    private int seat3;
    private String name3;

    private int seat4;
    private String name4;

    private int seat5;
    private String name5;


    public Seat(int seat1, String name1, int seat2, String name2, int seat3, String name3, int seat4, String name4, int seat5, String name5) {
        this.seat1 = seat1;
        this.name1 = name1;
        this.seat2 = seat2;
        this.name2 = name2;
        this.seat3 = seat3;
        this.name3 = name3;
        this.seat4 = seat4;
        this.name4 = name4;
        this.seat5 = seat5;
        this.name5 = name5;
    }

    public Seat() {}

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5;
    }

    public int getSeat1() {
        return seat1;
    }

    public void setSeat1(int seat1) {
        this.seat1 = seat1;
    }

    public int getSeat2() {
        return seat2;
    }

    public void setSeat2(int seat2) {
        this.seat2 = seat2;
    }

    public int getSeat3() {
        return seat3;
    }

    public void setSeat3(int seat3) {
        this.seat3 = seat3;
    }

    public int getSeat4() {
        return seat4;
    }

    public void setSeat4(int seat4) {
        this.seat4 = seat4;
    }

    public int getSeat5() {
        return seat5;
    }

    public void setSeat5(int seat5) {
        this.seat5 = seat5;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "Seat1='" + seat1 + '\'' +
                "Name1='" + name1 + '\'' +
                ", Seat2='" + seat2 + '\'' +
                "Name2='" + name2 + '\'' +
                ", Seat3='" + seat3 + '\'' +
                "Name3='" + name3 + '\'' +
                ", Seat4='" + seat4 + '\'' +
                "Name4='" + name4 + '\'' +
                ", Seat5='" + seat5 + '\'' +
                "Name5='" + name5 + '\'' +
                '}';
    }
}
