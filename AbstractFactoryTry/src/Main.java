public class Main {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        Checkboxes windowsCheckbox = windowsFactory.createCheckbox();

        System.out.println(windowsButton.paint());
        System.out.println(windowsCheckbox.create());
    }
}
