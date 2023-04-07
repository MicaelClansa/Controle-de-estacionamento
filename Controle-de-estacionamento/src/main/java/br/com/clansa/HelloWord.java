package br.com.clansa;

public class HelloWord {

	private final long id;
	private final String content;
	public HelloWord(long id, String content) {
		this.id = id;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
}
