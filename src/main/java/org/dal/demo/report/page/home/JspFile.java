package org.dal.demo.report.page.home;

public enum JspFile {
	VIEW("/index.html"),

	;

	private String m_path;

	private JspFile(String path) {
		m_path = path;
	}

	public String getPath() {
		return m_path;
	}
}
