package oops;

public class Developer extends EmployeeManagement {

    String programmingLanguage;

    void displayDeveloper(String name,int id,double salary,String programmingLanguage) {
    	super.displayEmployee(name, id, salary);
    	this.programmingLanguage=programmingLanguage;
        System.out.println("Programming Language: " +this.programmingLanguage);
    }

    public static void main(String[] args) {
    	

        Developer d = new Developer();

      
        d.displayDeveloper("sakthivel", 6748 ,100000,"java");
    }
}
