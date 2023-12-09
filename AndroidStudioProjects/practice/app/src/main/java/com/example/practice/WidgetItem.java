package com.example.practice;

public class WidgetItem {
    private String widgetTitle;
    private String widgetType;

    public WidgetItem(String widgetTitle, String widgetType) {
        this.widgetTitle = widgetTitle;
        this.widgetType = widgetType;
    }

    public String getWidgetTitle() {
        return widgetTitle;
    }

    public String getWidgetType() {
        return widgetType;
    }
}
