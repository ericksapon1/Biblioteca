
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static ArrayList<Libro> libros = new ArrayList();
    private static HashMap<String, Usuario> usuarios = new HashMap();
    private static Queue<Prestamo> prestamos = new LinkedList();

    public Main() {
    }

    public static void main(String[] args) {
        libros.add(new Libro("El Quijote", "Miguel de Cervantes", "Editorial A", 1605, 1345));
        libros.add(new Libro("Cien Años de Soledad", "Gabriel García Márquez", "Editorial B", 1967, 417));
        usuarios.put("123", new Usuario("Juan", "Pérez", "juan.perez@example.com", "123"));
        usuarios.put("456", new Usuario("Ana", "García", "ana.garcia@example.com", "456"));
        Prestamo prestamo1 = new Prestamo((Libro)libros.get(0), (Usuario)usuarios.get("123"), LocalDate.now(), LocalDate.now().plusDays(14L));
        prestamos.add(prestamo1);
        System.out.println("Prestamo realizado: " + String.valueOf(prestamo1));
        Prestamo prestamoDevuelto = (Prestamo)prestamos.poll();
        if (prestamoDevuelto != null) {
            System.out.println("Libro devuelto: " + String.valueOf(prestamoDevuelto));
        }

        Iterator var3 = libros.iterator();

        while(var3.hasNext()) {
            Libro libro = (Libro)var3.next();
            System.out.println(libro);
        }

        var3 = usuarios.values().iterator();

        while(var3.hasNext()) {
            Usuario usuario = (Usuario)var3.next();
            System.out.println(usuario);
        }

    }
}
