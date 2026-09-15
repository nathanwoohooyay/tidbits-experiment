public class Player {
    private String name;
    private double salary;
    private Team currentTeam;

    public Player(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Team getCurrentTeam() {
        return currentTeam;
    }

    public void requestTrade(Team targetTeam){
        this.currentTeam = targetTeam;
    }

    public void changeSalary(double newSalary){
        this.salary = newSalary;
    }
}


