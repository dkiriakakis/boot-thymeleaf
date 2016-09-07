package main.domain;

import java.util.Map;

public class Specifications {
    private Map<String, String> technical;
    private Map<String, String> other;

    public Specifications() {
    }

    public Map<String, String> getTechnical() {
        return technical;
    }

    public void setTechnical(Map<String, String> technical) {
        this.technical = technical;
    }

    public Map<String, String> getOther() {
        return other;
    }

    public void setOther(Map<String, String> other) {
        this.other = other;
    }
}
