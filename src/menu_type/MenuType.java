package menu_type;

public enum MenuType {
    BREAKFAST("07:00", "11:00"),
    LUNCH("12:00", "15:00"),
    DINNER("18:00", "22:00");

    private String startTime;
    private String endTime;

    MenuType(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }
}
