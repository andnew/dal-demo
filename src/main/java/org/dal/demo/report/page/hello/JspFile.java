package org.dal.demo.report.page.hello;

public enum JspFile {
	VIEW("/hello.jsp"),

	;

	private String m_path;

	private JspFile(String path) {
		m_path = path;
	}

	public String getPath() {
		return m_path;
	}
}
