public enum DDV {
	A(0.18), B(0.05), C(0);
}

class Item {
	int id;
	String name;
	double price;
	DDV ddv;

	public Item(int id, String name, double price, DDV ddv) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.ddv = ddv;
	}

	void setId(int id){
		this.id = id;
	}

	void setName(String name){
		this.name = name;
	}

	void setPrice(double price){
		this.price = price;
	}

	int getId(int id){
		return id;
	}

	String getName(String name) {
		return name;
	}

	double getPrice(double price){
		return price;
	}


	double taxReturn (double price) {
		return price * 0.15;
	}
}