package test.org.dal.demo;

import org.eclipse.jetty.servlets.GzipFilter;
import org.eclipse.jetty.webapp.WebAppContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.unidal.test.jetty.JettyServer;

import javax.servlet.DispatcherType;
import java.util.EnumSet;

@RunWith(JUnit4.class)
public class TestServer extends JettyServer {

    @Override
    protected String getContextPath() {
        return "/demo";
    }

    @Override
    protected int getServerPort() {
        return 2281;
    }

    @Override
    protected void postConfigure(WebAppContext context) {
        context.addFilter(GzipFilter.class, "/*", EnumSet.of(DispatcherType.REQUEST));
    }

    @Test
    public void startWebApp() throws Exception {
        // open the page in the default browser
        display("/demo");
        waitForAnyKey();
    }
}
