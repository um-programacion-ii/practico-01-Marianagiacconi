    class Ingrediente {
        protected int cantidad= 0;
        protected String nombre;

        public Ingrediente(int cantidad, String nombre){
            this.cantidad= cantidad;
            this.nombre= nombre;

        }


        public void mostrarDatos() {
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Nombre: " + nombre);
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
        // Sobrecarga del método toString()
        @Override
        public String toString() {
            return "Ingrediente{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}

