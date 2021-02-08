package org.dal.demo.mvc;

import org.unidal.lookup.util.StringUtils;
import org.unidal.web.mvc.Action;
import org.unidal.web.mvc.ActionPayload;
import org.unidal.web.mvc.Page;
import org.unidal.web.mvc.payload.annotation.FieldMeta;

import java.text.SimpleDateFormat;

public abstract class AbstractReportPayload<A extends Action, P extends Page> implements ActionPayload<P, A> {

    protected P m_page;


    @FieldMeta("domain")
    private String m_domain = "demo";

    @FieldMeta("date")
    protected long m_date;

    private SimpleDateFormat m_hourlyFormat = new SimpleDateFormat("yyyyMMddHH");

    private SimpleDateFormat m_dayFormat = new SimpleDateFormat("yyyyMMdd");

    protected P m_defaultPage;

    public AbstractReportPayload(P defaultPage) {
        m_defaultPage = defaultPage;
    }

    @Override
    public P getPage() {
        return m_page;
    }


    public void setPage(P page) {
        m_page = page;
    }

    public String getDomain() {
        return m_domain;
    }

    public void setDomain(String domain) {
        if (StringUtils.isNotEmpty(domain)) {
            m_domain = domain;
        }
    }

    public long getDate() {
        return this.m_date;
    }

    public void setDate(String date) {
        if(null != date && 0 < date.length()){
            this.m_date = Long.valueOf(date);
        }

    }
}
