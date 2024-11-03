package com.futurelabs.polimorfismo;

class Notification {

    protected String msg;

    public Notification(String msg) {
        this.msg = msg;
    }

    public void show() {
        System.out.println(getMsg());
    }

    public String getMsg() {
        return msg;
    }
}

class Warning extends Notification {

    public Warning(String msg) {
        super(msg);
    }
    @Override
    public String getMsg() {
        return "WARN: " + msg;
    }
}

class Alarm extends Notification {

    public Alarm(String msg) {
        super(msg);
    }
    @Override
    public void show() {
        System.out.println("ALARM: " + msg);
    }
}

public class Main {
    public static void main(String[] args) {
        Notification notif = new Notification("No problems");

        Notification warn = new Warning("Money ends");

        Notification alarm = new Alarm("The ship sank");

        System.out.println("==== warn.getMsg");
        warn.getMsg();
        System.out.println("==== warn.show");
        warn.show();
        System.out.println("==== alarm.show");
        alarm.show();
        System.out.println("==== alarm.getMsg");
        alarm.getMsg();
        System.out.println("==== notif.show");
        notif.show();
        System.out.println("====");
    }
}
