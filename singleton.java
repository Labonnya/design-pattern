public class Configuration {
    private static Configuration instance = null;
    private Properties configProperties;
    private String configFilePath;

    private Configuration() {
        configProperties = new Properties();
        configFilePath = "config.properties";
        try {
            configProperties.load(new FileInputStream(configFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getProperty(String key) {
        return configProperties.getProperty(key);
    }

    public void setProperty(String key, String value) {
        configProperties.setProperty(key, value);
    }
}
