package com.in28minutes.java.beginners.simple.design.patterns;

public class BuilderPattern {

	static class Coffee {
		private Coffee(Builder builder) {
			this.type = builder.type;
			this.sugar = builder.sugar;
			this.milk = builder.milk;
			this.size = builder.size;
		}

		private String type;//Should be a enum Lazy bum
		private boolean sugar;
		private boolean milk;
		private String size;//Should be a enum Lazy bum

		public static class Builder {
			private String type;//Should be a enum Lazy bum
			private boolean sugar;
			private boolean milk;
			private String size;//Should be a enum Lazy bum

			public Builder(String type) {
				this.type = type;
			}

			public Builder sugar(boolean value) {
				sugar = value;
				return this;
			}

			public Builder milk(boolean value) {
				milk = value;
				return this;
			}

			public Builder size(String value) {
				size = value;
				return this;
			}

			public Coffee build() {
				return new Coffee(this);
			}
		}

		@Override
		public String toString() {
			return String.format(
					"Coffee [type=%s, sugar=%s, milk=%s, size=%s]", type,
					sugar, milk, size);
		}

	}

	public static void main(String[] args) {
		Coffee coffee = new Coffee.Builder("Mocha").sugar(false)
				.size("Large").build();
		System.out.println(coffee);

		//Simplifies Creation
		//More Readable Code
		//Values cannot be modified
	}
}
