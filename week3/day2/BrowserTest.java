package week3.day2;

public class BrowserTest {
    public static void main(String[] args) {
     
        System.out.println("=== Chrome Browser ===");
        Chrome chrome = new Chrome();
        chrome.openURL("https://www.google.com");
        chrome.openIncognito();
        chrome.clearCache();
        chrome.navigateBack();
        chrome.closeBrowser();
        
        System.out.println("----------------------");
 
        
        System.out.println("=== Edge Browser ===");
        Edge edge = new Edge();
        edge.openURL("https://www.microsoft.com");
        edge.takeSnap();
        edge.clearCookies();
        edge.navigateBack();
        edge.closeBrowser();
        
        System.out.println("----------------------");

   
        System.out.println("=== Safari Browser ===");
        Safari safari = new Safari();
        safari.openURL("https://www.apple.com");
        safari.readerMode();
        safari.fullScreenMode();
        safari.navigateBack();
        safari.closeBrowser();
    }
}
