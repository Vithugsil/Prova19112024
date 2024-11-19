
public class Main {
    public static void main(String[] args) {
        SettingsManager.getInstance().addDeviceSetting("AppNube", "No control config");
        SettingsManager.getInstance().addDeviceSetting("AppKanban", "Major Router");

        SettingsManager.getInstance().getSettings();

        SettingsManager.getInstance().setSettings("AppNube", "No more config");

        SettingsManager.getInstance().getSettings();

    }
}