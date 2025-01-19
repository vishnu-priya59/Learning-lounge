
package SOLID;
/*
// Single responsibility priciple: Every Java class must perform a single responsibility

public class Student {
    public void addstudent(){

    }
}
public class Printstudentdetails(){
    public void getstudentdetails(){

    }
}

public class percentage{
    public void getpercentage(){

    }
}


//Open-closed principle: The module should be open for extension and closed for modification

public class Vehicleinfo{
    public double vehicleNumber(){
    }
}

public class car extends Vehicleinfo{
   public double vehicleNumber(){
   return this.getValue();
   }
}

public class truck extends Vehicleinfo{
    public double vehicleNumber(){
    return this.getValue();
    }
}



//Liskov Substitution Principle: Derived classes must be completely substitutable with base class.
//Be able to replace the parent class without affecting the functionality




//Interface Segregation Principle: Larger interfaces split into smaller ones

public interface ConvertInttoDouble{
   public void inttodouble();
}
public interface ConvertInttochar{
   public void inttochar();
}
public interface ConvertchartoString{
   public void chartoString();
}

Now we can use only two methods instead of using all 3

public class conversion implements ConvertInttochar,ConvertchartoString{
   public void inttochar(){
   //conversion logic
   }
   public void chartoString(){
   //conversion logic
   }
}


//Dependency inversion Principle: High-level modules should not depend on the low-level module but both should depend on the abstraction.
Loosely coupled code should be written

public class WindowsMachine{
   private final Keyword keyword;
   private final Montior monitor;

public WindowsMachine(Keyword keyword, Montior monitor){
    this.keyword=keyword;
    this.monitor=montior;
}
}

 */



//SINGLE RESPOSIBILITY MODEL
public class Student{
    String name;
    int id;

}
class StudentData{
    void studentDatabase(Student student){

    }
}
class StudentReport{
    void studentReport(Student student){

    }
}










