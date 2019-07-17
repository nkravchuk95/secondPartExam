package changeSymbols;

public class ChangeSymbols {

	public static void main(String[] args) {
		String str = "Это ##тестовый пример## для задачи ##на## строки";
		str = str.replaceAll("\\##(.*?)\\##", "<$1>");
		System.out.println(str);
	}

}
