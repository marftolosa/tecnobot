public class Cart {
    // Atributos (Propiedades) de la clase Cart
    private int cartId; // ID único del carrito
    private int productId; // ID del producto en el carrito
    private int quantity; // Cantidad del producto en el carrito
    private int userId; // ID del usuario propietario del carrito
 
    /**
     * Constructor sin parámetros
     * Este constructor se utiliza para crear un objeto Cart sin asignar valores
     * iniciales a los atributos.
     */
    public Cart() {
    }
 
    /**
     * Constructor con parámetros
     * Este constructor se utiliza para crear un objeto Cart con valores
     * iniciales para todos sus atributos.
     * 
     * @param cartId    ID único del carrito
     * @param productId ID del producto en el carrito
     * @param quantity  Cantidad del producto en el carrito
     * @param userId    ID del usuario propietario del carrito
     */
    public Cart(int cartId, int productId, int quantity, int userId) {
        this.cartId = cartId;
        this.productId = productId;
        this.quantity = quantity;
        this.userId = userId;
    }
 
    // Getters
    public int getCartId() {
        return cartId;
    }
 
    public int getProductId() {
        return productId;
    }
 
    public int getQuantity() {
        return quantity;
    }
 
    public int getUserId() {
        return userId;
    }
 
    // Setters
    public void setCartId(int cartId) {
        this.cartId = cartId;
    }
 
    public void setProductId(int productId) {
        this.productId = productId;
    }
 
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
 
    public void setUserId(int userId) {
        this.userId = userId;
    }
}
