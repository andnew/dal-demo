package org.dal.demo.report;

import org.unidal.web.mvc.AbstractModule;
import org.unidal.web.mvc.annotation.ModuleMeta;
import org.unidal.web.mvc.annotation.ModulePagesMeta;

@ModuleMeta(name = "r", defaultInboundAction = "hello", defaultTransition = "default", defaultErrorAction = "default")
@ModulePagesMeta({
//        org.dal.demo.report.page.home.Handler.class,
        org.dal.demo.report.page.hello.Handler.class
})
public class ReportModule extends AbstractModule {


}
