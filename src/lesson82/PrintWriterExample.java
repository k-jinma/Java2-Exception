package lesson82;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class PrintWriterExample {

	public static void main(String[] args) {
		// ファイル名を変数で定義
		String fileName = "output.txt";

		// try-with-resources文でリソースをまとめて管理
		try ( PrintWriter pw = new PrintWriter( new BufferedWriter( new FileWriter(fileName))); ) {

		    // printlnメソッドが使える！改行を含む
		    pw.println("寄せ鍋");
		    pw.println("炊き込みピラフ");
		    pw.println("シーザーサラダ");
		    pw.println("ローストビーフ");
		    pw.println("カットステーキ");
		    pw.println("ボロネーゼパスタ");
			
			
		} catch (IOException e) {
		    // ファイル操作中にエラーが発生した場合の処理
			System.out.println("ファイル操作中にエラーが発生しました");
		}
		// tryブロックを抜けると、pwが自動的にcloseされる。
		// そして、pwが内包するBufferedWriterやFileWriterも連鎖的にcloseされる。

	}

}
