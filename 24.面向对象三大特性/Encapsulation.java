/** create with Shendi */
public class Encapsulation {
	/** �����շ�ʽ����,֮ǰ�����׵���Сд,�������ʵĵ�һ����ĸ��д
	 * ���� */
	private String bookName = "�������";
	// ����
	private String author = "��Ȼ������";
	// ������
	private int cNum = 0;
	// ����
	private int goodNum = 0;
	// ������
	private int noGoodNum = 0;
	
	// ����
	public void comment(String c) {
		System.out.println("������: " + c);
		// ����������Ҫ+1, �˷��������������˷�װ
		cNum++;
	}
	
	public void good() {
		System.out.println("������������" + bookName);
		// ����++
		goodNum++;
	}
	
	public void noGood() {
		System.out.println("����������ô˲���: " + bookName);
		// no����++
		noGoodNum++;
	}
	
	// ��ȡ����,���������Ա��û��޸�,��װ������
	// �����get�ǻ�ȡ����˼,���ڱ����ķ�װ�Ļ�ȡ����,ǰ׺��Ӧ��Ϊget(��һ�ֹ淶)
	public String getBookName() {
		return bookName;
	}
	
	// ��ȡ����
	public String getAuthor() {
		return author;
	}
}