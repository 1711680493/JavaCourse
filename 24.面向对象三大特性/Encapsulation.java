/** create with Shendi */
public class Encapsulation {
	/** 采用驼峰式命名,之前讲过首单词小写,后续单词的第一个字母大写
	 * 书名 */
	private String bookName = "神奇的书";
	// 作者
	private String author = "当然是神仙";
	// 评论数
	private int cNum = 0;
	// 赞数
	private int goodNum = 0;
	// 不赞数
	private int noGoodNum = 0;
	
	// 评论
	public void comment(String c) {
		System.out.println("评论了: " + c);
		// 这里评论数要+1, 此方法对评论数做了封装
		cNum++;
	}
	
	public void good() {
		System.out.println("神奇人物赞了" + bookName);
		// 赞数++
		goodNum++;
	}
	
	public void noGood() {
		System.out.println("神奇人物觉得此不行: " + bookName);
		// no赞数++
		noGoodNum++;
	}
	
	// 获取书名,书名不可以被用户修改,封装了书名
	// 这里的get是获取的意思,对于变量的封装的获取操作,前缀都应该为get(是一种规范)
	public String getBookName() {
		return bookName;
	}
	
	// 获取作者
	public String getAuthor() {
		return author;
	}
}