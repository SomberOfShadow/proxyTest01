public class TomSay implements Say {
    private String name;

    public TomSay() {
    }


    public TomSay(String name) {
        this.name = name;
    }

    public void sayYes() {
        System.out.println("Tom say yes!");
    }
}


