package org.dal.demo.report.page.home;

import org.dal.demo.report.ReportPage;
import org.unidal.web.mvc.view.BaseJspViewer;

public class JspViewer extends BaseJspViewer<ReportPage, Action, Context, Model> {
    @Override
    protected String getJspFilePath(Context ctx, Model model) {
//        Action action = model.getAction();
//
//        switch (action) {
//            case VIEW:
//            case CHECKPOINT:
//            case THREAD_DUMP:
//                return JspFile.VIEW.getPath();
//        }
//
//        throw new RuntimeException("Unknown action: " + action);
        return "";
    }
}
