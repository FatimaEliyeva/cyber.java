abstract class Device {
    String brand;
    int year;

    public Device(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    abstract void turnOn();

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

class Laptop extends Device {
    int ramSize;

    public Laptop(String brand, int year, int ramSize) {
        super(brand, year);
        this.ramSize = ramSize;
    }

    @Override
    void turnOn() {
        System.out.println(brand + " laptop is booting up...");
    }

    public void code() {
        System.out.println(brand + " laptop is being used for programming.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("RAM Size: " + ramSize + "GB");
    }
}

class Smartphone extends Device {
    boolean has5G;

    public Smartphone(String brand, int year, boolean has5G) {
        super(brand, year);
        this.has5G = has5G;
    }

    @Override
    void turnOn() {
        System.out.println(brand + " smartphone is powering on...");
    }

    public void makeCall() {
        System.out.println(brand + " smartphone is making a call.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("5G Support: " + (has5G ? "Yes" : "No"));
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell", 2023, 16);
        myLaptop.displayInfo();
        myLaptop.turnOn();
        myLaptop.code();

        System.out.println();

        Smartphone myPhone = new Smartphone("Samsung", 2022, true);
        myPhone.displayInfo();
        myPhone.turnOn();
        myPhone.makeCall();
    }
}
