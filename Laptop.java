public class Laptop {
    private String name;
    private String color;
    private int ram;
    private int memory;

    public Laptop(String name, String color, int  ram, int memory){
        this.name = name;
        this.color = color;
        this.ram = ram;
        this.memory = memory;
    }

    public void Boot(){
        System.out.println(this.name+ " is booting...");
    }

    public void shutDown(){
        System.out.println(this.name+ " is shuting down..");
    }
}
