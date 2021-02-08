package org.dal.demo.report.page.hello;

public enum Action implements org.unidal.web.mvc.Action{

    CHECKPOINT("checkpoint"),

    THREAD_DUMP("threadDump"),

    VIEW("view");

    private String name;

    public static Action getByName(String name, Action defaultAction) {
        for (Action action : Action.values()) {
            if (action.getName().equals(name)) {
                return action;
            }
        }

        return defaultAction;
    }

    private Action(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }


}
