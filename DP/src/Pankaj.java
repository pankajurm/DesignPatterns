
class Ram{
    int x = 10;
    String name = "Ramji";

    public Ram () {

    }

    public Ram(int x, String name) {
        this.x = x;
        this.name = name;
    }
}
public class Pankaj {
    public static void main(String[] args) {
        Ram r = new Ram(12,"dev");
        System.out.println(r.x);
        System.out.println(r.name);
    }
}
