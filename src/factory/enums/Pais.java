package factory.enums;

public enum Pais {
	BRASIL {
		@Override
		public Moeda getPais() {
			return new Real();
		}
	},
	EUA

	{
		@Override
		public Moeda getPais() {
			return new Dolar();
		}
	},
	CANADA

	{
		@Override
		public Moeda getPais() {
			return new DolarCanadense();
		}
	};
	public abstract Moeda getPais();
}
