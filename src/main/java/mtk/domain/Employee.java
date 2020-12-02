package mtk.domain;

public class Employee
{
    private String id;
    private String name;
    private double salary;
    private int age;

    public Employee(String newId, String newName, double newSalary)
    {
        this(newId,newName,newSalary,0);
    }

    public Employee(String newId, String newName, double newSalary, int age) {
        this.id = newId;
        this.setName(newName);
        this.setSalary(newSalary);
        this.age = age;
    }

    public String getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    /**
     * Set the employee name after removing leading and trailing spaces, which could be left by upstream system
     * @param newName the new name for the employee, possibly with leading and trailing white space to be removed
     */
    public void setName(String newName)
    {
        this.name = newName.replaceAll(" ", "");
    }

    public double getSalary()
    {
        return this.salary;
    }

    public void setSalary(double newSalary)
    {
        this.salary = newSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        if (age != employee.age) return false;
        if (id != null ? !id.equals(employee.id) : employee.id != null) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + age;
        return result;
    }

    public int getAge() {
        return age;
    }
}
