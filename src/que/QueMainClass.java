package que;

public class QueMainClass {
public static void main(String[] args) {
	MyQue mq=new MyQue(5);
	//System.out.println(mq.size());
	mq.enQue(43);
	mq.enQue(44);
	mq.enQue(45);
	mq.enQue(46);
	mq.enQue(47);
	System.out.println(mq);
	System.out.println(mq.deQue());
	System.out.println(mq);
	
}
}
