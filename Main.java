public class main {
    public static void main(String[] args) {
        // In tiêu đề bảng
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-25s | %-12s | %-15s | %-20s |\n", 
                          "Mã SP", "Tên sản phẩm", "Loại", "Giá", "Thương hiệu");
        System.out.println("-----------------------------------------------------------------------------------------------");

        // In dữ liệu
        System.out.printf("| %-10s | %-25s | %-12s | %-15.0f | %-20s |\n", 
                          "SP01", "Laptop Dell XPS", "Laptop", 25990000.0, "Dell");
        System.out.printf("| %-10s | %-25s | %-12s | %-15.0f | %-20s |\n", 
                          "SP02", "iPhone 15 Pro Max", "Điện thoại", 33990000.0, "Apple");
        System.out.printf("| %-10s | %-25s | %-12s | %-15.0f | %-20s |\n", 
                          "SP03", "Samsung Galaxy S24", "Điện thoại", 29990000.0, "Samsung");
        System.out.printf("| %-10s | %-25s | %-12s | %-15.0f | %-20s |\n", 
                          "SP04", "Asus ROG Strix", "Laptop", 39990000.0, "Asus");

        System.out.println("-----------------------------------------------------------------------------------------------");
    }
}
