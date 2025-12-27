package lesson79;

class BankingSystem {

	public static void main(String[] args) {
		// mainメソッドでBankAccountのインスタンスを生成する。
		// 初期値は「"田中太郎", 50000」とする。
		BankAccount tanaka = new BankAccount("田中太郎", 50000);

		// deposit(2000);を実行する処置を書いて、2000円入金する。
		tanaka.deposit(2000);
		
		// account.withdraw(10000);を実行する処理を書いて、10000円出金する。
		try {
			tanaka.withdraw(10000);
			
		} catch (ZandakaBusokuException e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("取引ありがとうございました。");
		}
		
		// 例外処理を実装してください。catchブロックでZandakaBusokuExceptionをキャッチし、e.getMessage()を呼び出して画面に表示する
		
		// finallyブロックを追加し、例外の有無に関わらず「取引ありがとうございました。」と表示する

	}

}
