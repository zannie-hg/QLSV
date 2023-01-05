import Controller.HomeController;
import View.AddSinhVien;
import View.Home;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        HomeController homeController = new HomeController();
        homeController.ShowHomeView();
    }
}
