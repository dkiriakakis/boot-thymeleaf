package main.domain;

import java.util.Map;

public class Pictures {

    private String main;
    private Map<String,String> thumbnail;

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public Map<String, String> getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Map<String, String> thumbnail) {
        this.thumbnail = thumbnail;
    }
}
