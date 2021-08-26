package interfaces;

import java.util.List;

public interface Acciones <T> {
    public boolean agregar (T objeto);
    public List <T> consultar ();
}
