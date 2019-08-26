package proxy.code.jdk;

public class JavaDeveloper implements Develpoer{
    private String name;

    public JavaDeveloper() {

    }
    public JavaDeveloper(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void code() {
        System.out.println(this.name + " is coding java.");
    }

    public void debug() {

        System.out.println(this.name + " is debuging java.");
    }
}
