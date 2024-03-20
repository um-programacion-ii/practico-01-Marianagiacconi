public class Despensa {
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
    public void getIngrediente(int indice, int cantidad){
        if (indice < ingredientes.length && ingredientes[indice] != null) {
            ingredientes[indice].sacar(indice, cantidad);
        } else {
            System.out.println("Ingrediente no encontrado en la despensa.");
        }
        System.out.println("Estado de la despensa:");

    }
}
