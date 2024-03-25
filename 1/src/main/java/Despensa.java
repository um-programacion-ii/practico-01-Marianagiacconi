import java.util.List;
import java.util.ArrayList;
class Despensa {
    private Ingrediente[] ingredientes;

    public Despensa(int cantidad) {
        ingredientes = new Ingrediente[cantidad];
    }

    public void addIngrediente(Ingrediente ingrediente, int indice) {
        if (indice < ingredientes.length) {
            ingredientes[indice] = ingrediente;
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public Ingrediente[] getIngrediente(String nombre) {
        List<Ingrediente> ingredientesEncontrados = new ArrayList<>();
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente != null && ingrediente.getNombre().equals(nombre)) {
                ingredientesEncontrados.add(ingrediente);
            }
        }
        return ingredientesEncontrados.toArray(new Ingrediente[ingredientesEncontrados.size()]);
    }


}
