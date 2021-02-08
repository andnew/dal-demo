package org.dal.demo.report.page.hello;

import org.dal.demo.mvc.AbstractReportPayload;
import org.dal.demo.report.ReportPage;
import org.unidal.web.mvc.ActionContext;
import org.unidal.web.mvc.payload.annotation.FieldMeta;

public class Payload extends AbstractReportPayload<Action, ReportPage> {

    @FieldMeta("op")
    private Action m_action;

    public Payload() {
        super(ReportPage.HELLO);
    }

    @Override
    public Action getAction() {
        return m_action;
    }

    public void setAction(String action) {
        m_action = Action.getByName(action, Action.VIEW);
    }

    @Override
    public void setPage(String page) {
        m_page = ReportPage.getByName(page, ReportPage.HELLO);
    }

    @Override
    public void validate(ActionContext<?> ctx) {
        if (m_action == null) {
            m_action = Action.VIEW;
        }
    }
}
