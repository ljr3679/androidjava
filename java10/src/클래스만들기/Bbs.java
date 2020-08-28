package 클래스만들기;

public class Bbs {
	public int id;
	public String title;
	public String content;
	public String writer;
	
	public void 글을쓰다() {
		System.out.println("글을쓰다");
	}
	public void 글을삭제하다() {
		System.out.println("글을삭제하다");
	}
	public void 글을읽다() {
		System.out.println("글을읽다");
	}
	public void 글을수정하다() {
		System.out.println("글을수정하다");
	}
	public String toString() {
		return "id=" + id + "title=" + title + "content=" + content + "writer=" + writer;
	}
	
	
}
