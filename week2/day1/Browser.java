package week2.day1;

public class Browser {

 
    public String launchBrowser() {
        System.out.println("Launching Browser...");
        return "Browser launched successfully";
    }


    public void loadURL() {
        System.out.println("URL Loaded Successfully");
    }

 
    public static void main(String[] args) {
        Browser browserObj = new Browser();

        String message = browserObj.launchBrowser();
        System.out.println(message);

        browserObj.loadURL();
    }
}
