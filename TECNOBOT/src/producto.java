/**
 * Clase Producto
 * 
 * Representa un producto en el sistema de comercio electrónico.
 * Contiene toda la información relacionada con los productos disponibles para la venta.
 */
public class producto {
      // Atributos (Propiedades) de la clase Producto
    private int productId; // ID único del producto
    private String image; // URL o representación de la imagen del producto (puede cambiarse)
    private int categoryId; // ID de la categoría a la que pertenece el producto
    private int supplierId; // ID del proveedor del producto
    private String name; // Nombre del producto
    private String description; // Descripción del producto
    private int  price; // Precio del producto (puedes usar BigDecimal si necesitas precisión)

    /**
     * Constructor sin parámetros
     * Este constructor se utiliza para crear un objeto Producto sin asignar valores
     * iniciales a los atributos.
     */

    // Constructor sin parámetros
    public producto() {
    }
// Atributos (Propiedades) de la clase Producto
    // Constructor con parámetros
    public producto(int productId, String image, int categoryId, int supplierId, String name, String description, int  price) {
        this.productId = productId;
        this.image = image;
        this.categoryId = categoryId;
        this.supplierId = supplierId;
        this.name = name;
        this.description = description;
        this.price = price;
    }    
    
    public int getProductId() {
        return productId;
    }

    public String getImage() {
        return image;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
