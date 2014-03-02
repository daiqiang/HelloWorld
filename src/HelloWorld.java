import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;




public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Timer timer = new Timer();
		//Timer在1000ms后任务执行，每隔24小时执行一次
		System.out.println("11111111111");
		timer.scheduleAtFixedRate(new DownAndUploadTask(),1000, 86400000L);
		System.out.println("2222222222222");
	}

}
