
import java.util.Scanner;
import product.Product;
import user.CustomerAccount;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanaw
 */
public class FoodDeliverySystem {
    private AdmidAccount testAdmin;
    private CustomerAccount testCustomer;
    private Product[] testProduct;
    private Order[] testOrder;
    private Restuarant testRestuarant;
    private static final Scanner sc = new Scanner(System.in);

    public FoodDeliverySystem(CustomerAccount testCustomer, Product[] testProduct) {
        this.testCustomer = testCustomer;
        this.testProduct = testProduct;
    }
    
    
//    admid{addProduct, showItem, showMember, exit}
//    member{login, placeOrder, checkOutOrder, exit}
    public void adminMenu(){
        int menuId;
        do {
            System.out.println("<<Admin Menu>>");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Show Product");
            System.out.println("4. Set Price Product");
//            System.out.println("3. Show Customer"); set Price
            System.out.println("0. Exit ");
            System.out.println("Enter your menu [0-4]: ");
            menuId = sc.nextInt();
            switch (menuId) {
                case 0:
                    break;
                case 1:
                    addProduct();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    showProduct();
                    break;
                case 4:
                    setPriceProduct();
                    break;
                    
            }
        } while (menuId != 0);
    }
    
    
    public void customerMenu(){
        int menuId;
        do {
            System.out.println("<<Customer Menu>>");
            System.out.println("1. Select Product");//{show basket(), addProduct, removeProduct}
            System.out.println("2. Remove Product Form Cart");
            System.out.println("3. check Price Form Cart");
            System.out.println("4. checkout Order");
            
            System.out.println("0. Exit ");
            System.out.println("Enter your menu [0-3]: ");
            menuId = sc.nextInt();
            switch (menuId) {
                case 0:
                    break;                
                case 1:
                    addProductToCart();
                    break;
                case 2:
                    removeProductFormCart();//into DB
                    break;
                case 3:
                    checkPriceFormCart();
                    break;
                case 4:
                    checkoutOrder();
                    break;
                    
            }
        } while (menuId != 0);
    }
    
    public void signIn() {
        int menuId;
        do {
            System.out.println("<<Choose your account>>");
            System.out.println("1. Admin Sign In ");
            System.out.println("2. Customer Sign In ");
           
            System.out.println("0. Exit ");

            System.out.print("Enter your menu [0-2]: ");
            menuId = sc.nextInt();
            switch (menuId) {
                case 0:
                    break;
                    
                case 1:
                    loginAdmin();
                    adminMenu();
                    break;

                case 2:
                    loginCustomer();
                    customerMenu();
                    break;

            }

        } while (menuId != 0);
        System.out.println("good bye!");
    }
    
    public static void main(String[] args) {
        Product pdt1 = new Product();
        Product pdt2 = new Product();
        Product pdt3 = new Product();
        
        Product[] pdts = {pdt1,pdt2,pdt3};
        
        
        
    }

    private void loginAdmin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void loginCustomer() {
        int menuId;
        do {
            System.out.println("<<Customer Menu>>");
            System.out.println("1. Login");
            System.out.println("2. Register");//{show basket(), addProduct, removeProduct}

            System.out.println("0. Exit ");
            System.out.println("Enter your menu [0-2]: ");
            menuId = sc.nextInt();
            switch (menuId) {
                case 0:
                    break;
                case 1:
                    login();
                    break;
                case 2:
                    registerCustomer();
                    break;
                    
            }
        } while (menuId != 0);
    }

    private void login() {//DB
        String username;
        String password;
        boolean checkLogin;
        do {
            System.out.println("<<Login>>");
            System.out.println("Enter Username : ");
            username = sc.nextLine();
            System.out.println("Enter Password : ");
            password = sc.nextLine();
            
            checkLogin = customer.login(username, password);
            if (checkLogin != true) {
                System.out.println("Login Fail! Login again");
            }
        } while (checkLogin != true);
        
        customerMenu();
        
        
    }

    private void registerCustomer() {//DB
        String username;
        String password;
        do {
            System.out.println("<<Register>>");
            System.out.println("Enter Username : ");
            username = sc.nextLine();
            System.out.println("Enter Password : ");
            password = sc.nextLine();
            
            customer.register(username, password);
        } while (customer.register(username, password) != true);
        
        customerMenu();
    }
    
}
