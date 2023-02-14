package com.example.escaperoom;

import org.hibernate.Session;
import org.hibernate.query.Query;


public class EscapeRoom {
    public  static Session session1 = HibernateUtil.getSessionFactory().getCurrentSession();
    public static void main(String[] args) {

        int x=codigo1();
        int y=codigo2();
        int z=codigo3();
        int w=codigo4();
        System.out.println("El código descubierto es :" +x+y+z+w);
        session1.close();
    }

    public static int codigo1() {
        //TO-DO
        session1.getTransaction().begin();
        Query query = session1.createQuery("SELECT (m.idModulo) from ModuloEntity m");
        int x  = query.getResultList().size();
        session1.getTransaction().commit();
        return x;
    }
    public static int codigo2() {
        //TO-DO
        return 0;
    }
    public static int codigo3() {
        //TO-DO
        return 0;
    }
    public static int codigo4() {
        //TO-DO
        return 0;
    }

}
