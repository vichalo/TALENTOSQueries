# TALENTOSQueries :)
public static int codigo1() {
        //TO-DO
        Query query = session1.createQuery("SELECT COUNT(m.idModulo) from ModuloEntity m");
        long x  = (long) query.getResultList().get(0);
        return (int)x;
    }
    public static int codigo2() {
        //TO-DO
        Query query = session1.createQuery("SELECT DISTINCT (e.idModul) from ExamenEntity e where e.idModul > 0");
        int x  = query.getResultList().size();
        return x;

    }
    public static int codigo3() {
        //TO-DO
        Query query = session1.createQuery("SELECT ROUND(AVG(e.nota),0) FROM ExamenEntity e JOIN ModuloEntity m WHERE m.id = e.idModul AND m.nombre LIKE '%PRG%'");
        double result = (double) query.getResultList().get(0);
        return (int) result;
    }
    public static int codigo4() {
        //TO-DO0
        Query query =  session1.createQuery("SELECT (e) FROM AlumnoEntity e WHERE e.apellidos LIKE '%z%'");
        int x  = query.getResultList().size();
        return x;
    }
    
    El codi es 6473
    :)
