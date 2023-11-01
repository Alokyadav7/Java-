package objectoriented;

public class Abstraction {
    public static void main(String[] args) {

    }
}

abstract class employee {
    private int salary;
    public abstract void setSalary(int salary);
    public abstract void getSalary();
}
/**class employee {
    private int salary;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary=salary;
    }
}**/

class MonthyEmployee {
    private int salary;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

}

class HourlyWorked {
    private int salary;

    private int hourWorked;
    public int getSalary() {
        return salary*hourWorked;
    }
    public void setSalary(int salary, int hourWorked) {
        this.salary = salary;
        this.hourWorked = hourWorked;
    }
}