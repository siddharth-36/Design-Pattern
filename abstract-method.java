// Abstract product A
interface Button {
    void paint();
}

// Abstract product B
interface Checkbox {
    void paint();
}

// Windows variants
class WindowsButton implements Button {
    public void paint() { System.out.println("Rendering Windows Button"); }
}

class WindowsCheckbox implements Checkbox {
    public void paint() { System.out.println("Rendering Windows Checkbox"); }
}

// Mac variants
class MacButton implements Button {
    public void paint() { System.out.println("Rendering Mac Button"); }
}

class MacCheckbox implements Checkbox {
    public void paint() { System.out.println("Rendering Mac Checkbox"); }
}

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class WindowsFactory implements GUIFactory {
    public Button createButton() { return new WindowsButton(); }
    public Checkbox createCheckbox() { return new WindowsCheckbox(); }
}

class MacFactory implements GUIFactory {
    public Button createButton() { return new MacButton(); }
    public Checkbox createCheckbox() { return new MacCheckbox(); }
}

public class Main {
    public static void main(String[] args) {
        // Suppose the environment is Windows
        GUIFactory factory = new WindowsFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();

        // Output:
        // Rendering Windows Button
        // Rendering Windows Checkbox
    }
}
