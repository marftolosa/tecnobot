public class producto {
    private int productId;
    private String image; // Considera cambiar a String imageUrl o usar una biblioteca de imágenes
    private int categoryId;
    private int supplierId;
    private String name;
    private String description;
    private int  price; // Usando BigDecimal para mayor precisión

    // Constructor sin parámetros
    public producto() {
    }

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
