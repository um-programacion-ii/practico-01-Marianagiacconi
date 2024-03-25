class Recetas {
    private String nombre;
    private int tiempoCoccion;
    private Ingrediente[] ingredientes;
    private String preparacion;

    public Recetas(String nombre, int tiempoCoccion, Ingrediente[] ingredientes, String preparacion) {
        this.nombre = nombre;
        this.tiempoCoccion = tiempoCoccion;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }
}

class HuevoDuro extends Recetas {
    public HuevoDuro() {
        super("Huevo Duro", 10, new Ingrediente[]{new Ingrediente(1, "Huevo"), new Ingrediente(1, "Agua")}, "Poner un huevo en agua hirviendo durante 10 minutos");
    }
}

class MasaPizza extends Recetas {
    public MasaPizza() {
        super("Masa de Pizza", 0, new Ingrediente[]{new Ingrediente(500, "Harina"), new Ingrediente(300, "Agua"), new Ingrediente(7, "Levadura"), new Ingrediente(30, "Aceite"), new Ingrediente(5, "Sal"), new Ingrediente(5, "Azúcar")}, "Preparar la masa de pizza mezclando todos los ingredientes y amasando hasta obtener una masa suave. Dejar reposar la masa durante una hora antes de usarla.");
    }
}

class PizzaMargarita extends Recetas {
    public PizzaMargarita() {
        super("Pizza Margarita", 20, new Ingrediente[]{new Ingrediente(300, "Harina"), new Ingrediente(200, "Agua"), new Ingrediente(5, "Levadura"), new Ingrediente(30, "Aceite de oliva"), new Ingrediente(5, "Sal"), new Ingrediente(2, "Tomate"), new Ingrediente(200, "Mozzarella"), new Ingrediente(10, "Albahaca")}, "Preparar la masa de pizza mezclando todos los ingredientes y amasando hasta obtener una masa suave. Dejar reposar la masa durante una hora antes de usarla. Extender la masa en una bandeja para pizza y cubrirla con salsa de tomate. Cubrir con rodajas de mozzarella y hojas de albahaca fresca. Hornear a 220°C durante 15-20 minutos, o hasta que la masa esté dorada y el queso se haya derretido y esté burbujeante.");
    }
}
