class Main{
    public static void main(String[] args){
        // Crear instancias de Ingrediente
        Ingrediente ingrediente1 = new Ingrediente(250, "Harina");
        Ingrediente ingrediente2 = new Ingrediente(500,"Azúcar");
        Ingrediente ingrediente3 = new Ingrediente(10, "Levadura");
        Ingrediente ingrediente4 = new Ingrediente(300, "Tomate");
        Ingrediente ingrediente5 = new Ingrediente(500,"Carne");
        Ingrediente ingrediente6 = new Ingrediente(10, "Lechuga");

        // Mostrar los ingredientes por pantalla
        System.out.println("Ingredientes:");
        System.out.println(ingrediente1);
        System.out.println(ingrediente2);
        System.out.println(ingrediente3);
        System.out.println(ingrediente4);
        System.out.println(ingrediente5);
        System.out.println(ingrediente6);

        // Crear despensa
        Despensa despensa = new Despensa(3);

        // Crear ingredientes
        Ingrediente harina = new Ingrediente(2000,"Harina");
        Ingrediente azucar = new Ingrediente(40,"Azúcar");
        Ingrediente sal = new Ingrediente(100,"Sal");
        Ingrediente levadura = new Ingrediente(10, "Levadura");
        Ingrediente tomate = new Ingrediente(300, "Tomate");
        Ingrediente carne = new Ingrediente(500,"Carne");
        Ingrediente lechuga = new Ingrediente(10, "Lechuga");

        // Agregar ingredientes a la despensa
        despensa.addIngrediente(harina, 0);
        despensa.addIngrediente(azucar, 1);
        despensa.addIngrediente(sal, 2);
        despensa.addIngrediente(levadura, 1);
        despensa.addIngrediente(tomate, 2);
        despensa.addIngrediente(carne, 1);
        despensa.addIngrediente(lechuga, 2);

        // Sacar ingredientes de la despensa
        despensa.getIngrediente(0, 500);
        despensa.getIngrediente(1, 600); // No hay suficiente cantidad de azúcar
        despensa.getIngrediente(2, 150);

        }
    }



