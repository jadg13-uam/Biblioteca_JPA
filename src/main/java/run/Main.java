package run;

import entities.Autor;
import jakarta.persistence.EntityManager;
import services.dao.MyDao;
import services.interfaces.ICRUD;
import util.JPAConexion;

import java.util.List;

public class Main {

    public static final ICRUD dao = new MyDao();

    public static void insertarAutor(){
        Autor a = new Autor();
        a.setNombre("Gabriel Garcia Marquez");
        a.setNacionalidad("Colombiana");
        dao.insert(a);
        System.out.println("Registro Almacenados:");
        List<Autor> autores = dao.getAll("autores.All", Autor.class);
        autores.forEach(autor -> System.out.println(autor.getNombre()));
    }

    public static void main(String[] args) {
        insertarAutor();


    }
}
