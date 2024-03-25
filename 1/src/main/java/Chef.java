
class Chef {
    private String nombre;
    private int estrellasMichelin;

    public Chef(String nombre, int estrellasMichelin) {
        this.nombre = nombre;
        this.estrellasMichelin = estrellasMichelin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellasMichelin() {
        return estrellasMichelin;
    }

    public void setEstrellasMichelin(int estrellasMichelin) {
        this.estrellasMichelin = estrellasMichelin;
    }

    @Override
    public String toString() {
        return "Chef{" +
            "nombre='" + nombre + '\'' +
            ", estrellasMichelin=" + estrellasMichelin +
            '}';
    }
}

class CocinaService {
public static void prepararReceta(Recetas receta, Despensa despensa) {
    boolean tieneIngredientes = true;

    // Verificar si la despensa tiene todos los ingredientes necesarios
    for (Ingrediente ingrediente : receta.getIngredientes()) {
        Ingrediente[] ingredientesEnDespensa = despensa.getIngrediente(ingrediente.getNombre());
        if (ingredientesEnDespensa == null || ingredientesEnDespensa.length == 0) {
            tieneIngredientes = false;
            System.out.println("No hay suficiente cantidad de " + ingrediente.getNombre() + " en la despensa.");
        } else {
            boolean ingredienteEncontrado = false;
            for (Ingrediente ingredienteEnDespensa : ingredientesEnDespensa) {
                if (ingredienteEnDespensa.getCantidad() >= ingrediente.getCantidad()) {
                    ingredienteEncontrado = true;
                    break;
                }
            }
            if (!ingredienteEncontrado) {
                tieneIngredientes = false;
                System.out.println("No hay suficiente cantidad de " + ingrediente.getNombre() + " en la despensa.");
            }
        }
    }

    // Si tiene todos los ingredientes, proceder con la preparación
    if (tieneIngredientes) {
        System.out.println("Preparando receta: " + receta.getNombre());
        for (Ingrediente ingrediente : receta.getIngredientes()) {
            Ingrediente[] ingredientesEnDespensa = despensa.getIngrediente(ingrediente.getNombre());
            for (Ingrediente ingredienteEnDespensa : ingredientesEnDespensa) {
                if (ingredienteEnDespensa.getCantidad() >= ingrediente.getCantidad()) {
                    ingredienteEnDespensa.setCantidad(ingredienteEnDespensa.getCantidad() - ingrediente.getCantidad());
                    break;
                }
            }
        }
        System.out.println("Preparación: " + receta.getPreparacion());
// Mostrar la cantidad de ingredientes restantes en la despensa
        System.out.println("Cantidad de ingredientes restantes en la despensa:");
        for (Ingrediente ingrediente : receta.getIngredientes()) {
            Ingrediente[] ingredientesEnDespensa = despensa.getIngrediente(ingrediente.getNombre());
            for (Ingrediente ingredienteEnDespensa : ingredientesEnDespensa) {
                if (ingredienteEnDespensa != null) {
                    System.out.println(ingredienteEnDespensa);
                }
            }
        }

}
}  }
