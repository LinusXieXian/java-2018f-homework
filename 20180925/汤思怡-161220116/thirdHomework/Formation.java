package thirdHomework;

public enum Formation {
	/*
	 * �任���Σ����������С�������ߡ����ۡ����ҡ����¡���ʧ
	 */
	CRANE("����"), GOOSE("����"), YOKE("����"), SNAKE("����"), FISH("����"), SQAURE("����"), MOON("����"), FRONT("��ʧ");
	private String name;

	private Formation(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public String toString() {
		return name;
	}
}
