package Person;


// Singleton
public class Farmer extends People{
    private String name;
    private int employeeNumber;
    private static Farmer instance = new Farmer("Farmer509");

    private Farmer(String name){
        this.name = name;
        System.out.println("Person.Farmer \"" + this.name + "\" is successfully created!");
    }

    public static Farmer getTheFarmer(){
        return instance;
    }

    public Employee employSomeOne(){
        employeeNumber++;
        return Employee.getEmployee();
    }

    public void acceptEmployeeVisit(EmloyeeNumberVisitor visitor){
        visitor.visit(employeeNumber);
    }

    public void raiseEveryAnimal(){ // facade
        Employee employee = employSomeOne();
        System.out.println("The farmer find himself an employee to help him");
        employee.raisePig();
        employee.raiseChicken();
        employee.raiseFish();
        employee.raiseSheep();
    }

    public void produceAnimal(String method){ // proxy
        Employee employee = employSomeOne();
        System.out.println("An employee become the proxy of the farmer");
        employee.produceAnimal(method);
    }


    public void shopSomeSeeds(){ // shop all kinds of seeds

    }


}