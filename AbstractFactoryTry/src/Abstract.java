interface Button{
    String paint();
}

interface Checkboxes{
    String create();
}

class WindowsButton implements Button{
    @Override
    public String paint() {
        return "This is a Windows Button";
    }
}

class IOSButton implements Button{
    @Override
    public String paint() {
        return "This is an IOS Button";
    }
}


class WindowsCheckbox implements Checkboxes{
    @Override
    public String create() {
        return "This is a Windows Checkbox";
    }
}

class IOSCheckbox implements Checkboxes{
    @Override
    public String create() {
        return "This is an IOS Checkbox";
    }
}

interface GUIFactory {
    Checkboxes createCheckbox();
    Button createButton();
}

class WindowsFactory implements GUIFactory{
    public WindowsFactory() {
        super();
    }

    @Override
    public Checkboxes createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

class IOSFactory implements GUIFactory{
    public IOSFactory() {
        super();
    }

    @Override
    public Checkboxes createCheckbox() {
        return new IOSCheckbox();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }
}