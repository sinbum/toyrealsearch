package vo;

public class MemoVO {
String content;
public MemoVO() {

}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public MemoVO(String content) {
	super();
	this.content = content;
}
@Override
public String toString() {
	return "MemoVO [content=" + content + "]";
}


}
