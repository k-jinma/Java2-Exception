package lesson75;

class Ex75 {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		try {
			restaurant.order();
			
		} catch (Exception e) {
			System.out.println( e.getMessage() );
		} // 注文開始
	}
}

class Restaurant {
	public void order() throws Exception {

		// シェフが料理する
		Chef chef = new Chef();
		chef.cook();

		boolean isError = false; // 提供中にエラーが発生したか
		if (!isError) { // 提供中にエラーが発生した場合
			throw new Exception("料理の提供に失敗しました");
		}

		System.out.println("料理提供完了");

	}
}

// シェフクラス
class Chef {

	// 料理するメソッド
	public void cook() throws Exception {

		// 材料担当に材料チェックを依頼する
		Ingredient ingredient = new Ingredient();
		ingredient.check();

		boolean isError = false; // 料理中にエラーが発生したか

		if (!isError) { // 料理中にエラーが発生した場合
			throw new Exception("料理が失敗しました");
		}

		System.out.println("料理完成");

	}
}

// 材料担当クラス
class Ingredient {
	// 材料チェックする
	public void check() throws Exception {

		// 材料があるかどうかのフラグ
		boolean hasIngredient = false;

		// 材料がない場合は例外を投げる
		if (!hasIngredient) {
			throw new Exception("材料なし");
		}

		System.out.println("材料チェック完了");

	}
}