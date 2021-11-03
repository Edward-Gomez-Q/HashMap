package bo.edu.ucb.est;

public class Student {

    private String name;
    // En el ejemplo con alumno, aquí tenía que ponber el apuntador a siguiente 
    
    public  Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student ["+ name + "]";
    }
    @Override
    public boolean equals (Object obj){
        
        boolean result=false;
        //verificamos que no sea nulo y que sea instancia de planet
        if(obj != null && obj instanceof Student)
        {
            Student other=(Student)obj;
            if(this.getName().equals(other.getName()))
            {
                result=true;
            }
        }
        return result;
    }
    
}
