package run;

import jakarta.persistence.EntityManager;
import util.JPAConexion;

public class Main {

    public static void main(String[] args) {
        EntityManager em = JPAConexion.getEntityManager();

        System.out.println("Creando entidades");


    }
}
