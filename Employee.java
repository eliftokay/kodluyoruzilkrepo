public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    
    public Employee(String name, int salary,int workHours, int hireYear){
    this.name=name;
    this.salary=salary;
    this.workHours=workHours;
    this.hireYear=hireYear;
    
    }
    
    int tax(){
        if(salary<1000){
            return 0;
        }
        else{
            return (salary*3/100);
        }
    }
    
    int bonus(){
        if(workHours<=40){
            return 0;
        }
        else{
            return (30*(workHours-40));
        }
    }
    
    int raiseSalary(){
        if((2021-hireYear)<10){
            return salary/20;
        }
        else if((2021-hireYear)<20){
            return salary/10;
        }
        else{
            return (salary*3/20);
        }
    }
    
    @Override
    public String toString(){
        return 
        "Adı: "+name+"Maaşı: "+salary
        +"Çalışma saati: "+workHours
        +"Başlangıç yılı: "+hireYear
        +"Vergi: "+tax()
        +"Bonus: "+bonus()
        +"Maaş artışı: "+raiseSalary()
        +"Vergi ve bonuslar ile maaş: "+(salary-tax()+bonus())
        +"Toplam maaş: "+(salary-tax()+bonus()+raiseSalary());
    }
}
