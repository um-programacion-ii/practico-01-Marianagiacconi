class Main{
    public static void main(String[] args){
        // Crear instancias de Ingrediente
        Ingrediente ingrediente1 = new Ingrediente(250, "Harina");
        Ingrediente ingrediente2 = new Ingrediente(500,"Azúcar");
        Ingrediente ingrediente3 = new Ingrediente(10, "Levadura");

        // Mostrar los ingredientes por pantalla
        System.out.println("Ingredientes:");
        System.out.println(ingrediente1);
        System.out.println(ingrediente2);
        System.out.println(ingrediente3);
    }
}
