class Main {
    public static void main(String[] args) {
        // Crear instancias de Ingrediente
        Ingrediente harina = new Ingrediente(250, "Harina");
        Ingrediente azucar = new Ingrediente(500, "Azúcar");
        Ingrediente levadura = new Ingrediente(10, "Levadura");
        Ingrediente tomate = new Ingrediente(300, "Tomate");
        Ingrediente agua = new Ingrediente(500, "Agua");
        Ingrediente albahaca = new Ingrediente(10, "Albahaca");
        Ingrediente mozzarella = new Ingrediente(200, "Mozzarella");
        Ingrediente huevo = new Ingrediente(2, "Huevo");
        Ingrediente aceiteOliva = new Ingrediente(30, "Aceite de oliva");

        // Mostrar los ingredientes por pantalla
        System.out.println("Ingredientes:");
        System.out.println(harina);
        System.out.println(azucar);
        System.out.println(levadura);
        System.out.println(tomate);
        System.out.println(agua);
        System.out.println(albahaca);
        System.out.println(mozzarella);
        System.out.println(huevo);
        System.out.println(aceiteOliva);

        // Crear despensa
        Despensa despensa = new Despensa(9);

        // Agregar ingredientes a la despensa
        despensa.addIngrediente(harina, 0);
        despensa.addIngrediente(azucar, 1);
        despensa.addIngrediente(levadura, 2);
        despensa.addIngrediente(tomate, 3);
        despensa.addIngrediente(agua, 4);
        despensa.addIngrediente(albahaca, 5);
        despensa.addIngrediente(mozzarella, 6);
        despensa.addIngrediente(huevo, 7);
        despensa.addIngrediente(aceiteOliva, 8);

        // Sacar ingredientes de la despensa
        despensa.getIngrediente("azucar");
        despensa.getIngrediente("agua"); // No hay suficiente cantidad de azúcar
        despensa.getIngrediente("mozzarella");

        // Crear las recetas
        HuevoDuro huevoDuro = new HuevoDuro();
        MasaPizza masaDePizza = new MasaPizza();
        PizzaMargarita pizzaMargarita = new PizzaMargarita();

        // Mostrar las recetas por pantalla
        System.out.println("\nReceta de Huevo Duro:");
        System.out.println("Tiempo de Cocción: " + huevoDuro.getTiempoCoccion() + " minutos");
        System.out.println("Ingredientes:");
        for (Ingrediente ingrediente : huevoDuro.getIngredientes()) {
            System.out.println(ingrediente);
        }
        System.out.println("Preparación: " + huevoDuro.getPreparacion());

        System.out.println("\nReceta de Masa de Pizza:");
        System.out.println("Tiempo de Cocción: " + masaDePizza.getTiempoCoccion() + " minutos");
        System.out.println("Ingredientes:");
        for (Ingrediente ingrediente : masaDePizza.getIngredientes()) {
            System.out.println(ingrediente);
        }
        System.out.println("Preparación: " + masaDePizza.getPreparacion());

        System.out.println("\nReceta de Pizza Margarita:");
        System.out.println("Tiempo de Cocción: " + pizzaMargarita.getTiempoCoccion() + " minutos");
        System.out.println("Ingredientes:");
        for (Ingrediente ingrediente : pizzaMargarita.getIngredientes()) {
            System.out.println(ingrediente);
        }
        System.out.println("Preparación: " + pizzaMargarita.getPreparacion());
    }
}
