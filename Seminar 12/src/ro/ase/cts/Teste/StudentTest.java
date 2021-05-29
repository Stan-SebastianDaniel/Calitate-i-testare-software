package ro.ase.cts.Teste;

import org.junit.Test;
import ro.ase.cts.Clase.Student;

import static org.junit.Assert.*;

public class StudentTest {

    @org.junit.Test
    public void getNume() {
    }

    @org.junit.Test
    public void testConstructorWorksCorectlyForName(){
        String nume="Gigel";
        Student student=new Student(nume);
        //if-ul face ce face assertEquals
//        if (nume.equals(student.getNume())){
//            System.out.println(" e ok");
//        }
//        else {
//            System.out.println("nu e ok");
//        }

        assertEquals(nume,student.getNume());
    }

    @org.junit.Test
    public void testNume(){
        String nume="Popescu";
        Student student=new Student();
        student.setNume(nume);
        assertEquals(nume,student.getNume());
    }

    @org.junit.Test
    public void testConstructorWorksCorrectly(){
        Student student=new Student();

        assertNotNull("nu a fost initializat numele",student.getNume());
        assertNotNull("nu a fost initializate notele",student.getNote());
    }

    @org.junit.Test
    public void testAdaugaNota(){
        Student student=new Student();
        int nota=10;
        student.adaugaNota(nota);

        assertEquals(nota,student.getNota(0));
    }

    @org.junit.Test
    public void testGetNota(){
        Student student=new Student();
        student.adaugaNota(1);
        student.adaugaNota(4);
        student.adaugaNota(3);
        student.adaugaNota(2);

        assertEquals(4,student.getNota(1));
    }

    @org.junit.Test
    public void testAdaugaOSinguraNota(){
        Student student=new Student();
        int nota=10;
        student.adaugaNota(nota);

        assertEquals(nota,student.getNota(0));
        assertEquals(1,student.getNote().size());
    }

    @org.junit.Test
    public void testAdaugaNotaIncorecta(){
        Student student=new Student();

//1
        try{
            //2
            student.adaugaNota(-1);
            //3 -> nu ajunge aici
            fail("nu trebuia as ajunga aici. Metoda nu arunca exceptii");
        }
        catch (IllegalArgumentException ex){
            //4
        }
        catch (Exception e){
            //5->nu ajuge aici
            fail("Nu arunca exceptie de tipul Illegal Argument");
        }
        //6
    }
    @org.junit.Test
    public void testStudentAreRestanta(){
        Student student=new Student();
        student.adaugaNota(3);
        boolean rezultat=student.areRestante();
        assertFalse(rezultat);
    }

    @org.junit.Test
    public void testCalculeazaMedieCorect()
    {
        Student student=new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
        //assertEquals(9.5,student.calculeazaMedie()); depricated
        assertEquals(9.5,student.calculeazaMedie(),0.000001);
    }

}