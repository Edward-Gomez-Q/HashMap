package bo.edu.ucb.est;
import bo.edu.ucb.est.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student edward= new Student("Edward");
        Student hillary= new Student("Hillary");
        Student carlos= new Student("Carlos");
        Student natalia= new Student("Natalia");
        HashMap<String,Student> ListaStudents= new HashMap<>();
        ListaStudents.put("EG", edward);
        ListaStudents.put("HC", hillary);
        ListaStudents.put("CA", carlos);
        ListaStudents.put("NA", natalia);
        ListaStudents.put("HC", hillary);
        ListaStudents.print();
        System.out.println(ListaStudents.contains("IM"));
        System.out.println(ListaStudents.contains("HC"));
        
        System.out.println(ListaStudents.get("CA"));
        ListaStudents.getKeySet();
        ListaStudents.remove("NA");
        ListaStudents.print();
        ListaStudents.getKeySet();
        
        HashMap<Integer,Planet> ListaPlanetas= new HashMap<>();
        Planet tierra= new Planet ("Tierra",3.0);
        Planet saturno= new Planet ("Saturno",6.0);
        Planet mercurio= new Planet ("Mercurio",1.0);
        Planet neptuno= new Planet ("Neptuno",8.0);
        ListaPlanetas.put(1, mercurio);
        ListaPlanetas.put(2, tierra);
        ListaPlanetas.put(3, saturno);
        ListaPlanetas.put(4, neptuno);
        ListaPlanetas.print();
    }
}
