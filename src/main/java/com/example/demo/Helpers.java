package com.example.demo;

public class Helpers {
    public static String IndexPage() {
        String html = "<html>Hello!, </br></br>"
                + "Check all the previous sent messages to kafka here <a href=\"kafka/messages\">link<a/>,</br>"
                + "Want to submit a new message? use this form </br>"
                + "<form id=\"form\" action=\"/kafka/publish/\"  method=\"post\" onsubmit=\"myLazyDoAllFunction()\">"
                + "<input type=\"text\" name=\"fname\" value=\"\"><br>"
                + "<input type=\"submit\" value=\"Submit\">"
                + "</form>";

        String javascript = "<script>"
                + "function myLazyDoAllFunction() {"
                + "form = document.getElementById(\"form\");"
                + "window.location.href=\"/kafka/publish/\" + form.fname.value;"
                + "event.preventDefault();"
                + "}"
                + "</script></html>";
        return html + javascript;
    }

    public static String returnHome(){
        return "</br> <a href=\"/\">return home<a/>";
    }
}