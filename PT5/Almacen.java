package PT5;

import java.util.ArrayList;

public class Almacen {
    private ArrayList<Producto> Productos;

    public Almacen(ArrayList<Producto> Productos) {
        this.Productos = Productos;
    }


    //Metodo//
    public void agregarPorducto( Producto nuevoProducto) {
        Productos.add(nuevoProducto);
    }

    public void quitarProducto(String codigo) {
        Producto productoAEliminar = buscaProducto(codigo);
        if (productoAEliminar != null) {
            Productos.remove(productoAEliminar);
        }
    }

    public Producto buscaProducto(String codigo) {

        Producto encontrado = null;

        for (int i = 0; i < Productos.size() && encontrado == null; i++) {
            Producto ProductoActual = Productos.get(i);
            if (ProductoActual.getCodigo() == codigo) {
                encontrado = ProductoActual;
            }
        }

        return encontrado;

    }

    public String toString () {
        String resultado = "";
        for (int i = 0; i < Productos.size(); i++) {
            Producto ProductoActual = Productos.get(i);
            resultado += ProductoActual.toString() + "\n";
        }
        return resultado;
    }

}
