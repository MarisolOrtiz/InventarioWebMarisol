package Model;


public class Producto {
    private int id_producto;
    private String nom_producto;
    private int categoria_id;
    private float stock;
    private float precio;
    private String unidad_de_medida;
    private int estado_producto;
    private Categoria categoria;

    public Producto() {
        this.id_producto = 0;
        this.categoria = new Categoria();
    }

    public Producto(int id_producto, String nom_producto, int categoria_id, float stock, float precio, String unidad_de_medida, int estado, Categoria categoria) {
        this.id_producto = id_producto;
        this.nom_producto = nom_producto;
        this.categoria_id = categoria_id;
        this.stock = stock;
        this.precio = precio;
        this.unidad_de_medida = unidad_de_medida;
        this.estado_producto = estado_producto;
        this.categoria = categoria;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getUnidadMedida() {
        return unidad_de_medida;
    }

    public void setUnidad_de_medida(String unidad_de_medida) {
        this.unidad_de_medida = unidad_de_medida;
    }

    public int getEstado() {
        return estado_producto;
    }

    public void setEstado(int estado) {
        this.estado_producto = estado_producto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
   
    
}
