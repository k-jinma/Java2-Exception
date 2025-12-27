package lesson78.kai;

// 独自例外クラスの定義①
class DataAccessException extends Exception {
	// データアクセスに関する一般的な例外
	DataAccessException() {

	}
	DataAccessException(String message) {
		super(message);
	}
}

// 独自例外クラスの定義②
class FileDataAccessException extends DataAccessException {
	// ファイルデータアクセスに関する例外
	FileDataAccessException() {

	}
	
	FileDataAccessException(String message) {
		super(message);
	}
	
}

// スーパークラス
class DataProcessor {
	// このメソッドはDataAccessExceptionをスローする可能性がある
	public void process() throws DataAccessException {
		System.out.println("データ処理を実行します。");
		throw new DataAccessException("データ処理エラー");
	}
}

// サブクラス
class FileDataProcessor extends DataProcessor {
	// processメソッドをオーバーライドする
	
	
	
	
	
	
}


public class Ex3Kai {
	public static void main(String[] args) {
		DataProcessor processor = new FileDataProcessor();
		
		// 例外処理を実装してください
		processor.process();
		

	}

}
