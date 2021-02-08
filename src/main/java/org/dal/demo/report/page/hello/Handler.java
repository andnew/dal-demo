package org.dal.demo.report.page.hello;

import org.dal.demo.report.ReportPage;
import org.unidal.lookup.annotation.Inject;
import org.unidal.web.mvc.PageHandler;
import org.unidal.web.mvc.annotation.InboundActionMeta;
import org.unidal.web.mvc.annotation.OutboundActionMeta;
import org.unidal.web.mvc.annotation.PayloadMeta;

import javax.servlet.ServletException;
import java.io.IOException;

public class Handler implements PageHandler<Context> {

    @Inject
    private JspViewer m_jspViewer;

    @Override
    @PayloadMeta(Payload.class)
    @InboundActionMeta(name = "hello")
    public void handleInbound(Context ctx) throws ServletException, IOException {
        System.out.println("Hello handle Inbound");
    }

    @Override
    @OutboundActionMeta(name = "hello")
    public void handleOutbound(Context ctx) throws ServletException, IOException {
        System.out.println("Hello handle Outbound");

        Model model = new Model(ctx);
        Payload payload = ctx.getPayload();

        model.setAction(payload.getAction());
        model.setPage(ReportPage.HELLO);
        model.setDate(payload.getDate());
        model.setDomain(payload.getDomain());

        model.setData("业务逻辑结果");

        m_jspViewer.view(ctx, model);
    }

}
