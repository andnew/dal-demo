package org.dal.demo.report.page.home;

import org.dal.demo.mvc.AbstractReportPayload;
import org.dal.demo.report.ReportPage;
import org.unidal.web.mvc.ActionContext;
import org.unidal.web.mvc.payload.annotation.FieldMeta;

public class Payload extends AbstractReportPayload<Action, ReportPage> {

	@FieldMeta("op")
	private Action m_action;

	public Payload() {
		super(ReportPage.HOME);
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
		m_page = ReportPage.getByName(page, ReportPage.HOME);
	}

	@Override
	public void validate(ActionContext<?> ctx) {

	}

}
