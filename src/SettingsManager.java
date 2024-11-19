import java.util.HashMap;
import java.util.Map;

public class SettingsManager {

    private static SettingsManager instance;

    private Map<String, String> settings;

    private SettingsManager() {
        settings = new HashMap<>();
    }

    public static SettingsManager getInstance(){
        if(instance == null){
            synchronized (SettingsManager.class){
                if(instance == null){
                    instance = new SettingsManager();
                }
            }
        }
        return instance;
    }

    public void addDeviceSetting(String applicationName, String config){
        if(!settings.containsKey(applicationName)){
            settings.put(applicationName, config);
        }
    }

    public void getSettings(){
        for (Map.Entry<String, String> entry : settings.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        System.out.println();
    }

    public void setSettings(String applicationName, String config) {
        settings.replace(applicationName, config);
    }
}
