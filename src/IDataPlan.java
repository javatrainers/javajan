
public abstract interface IDataPlan {
	public abstract void browse();
	public abstract void call();
	public default void payment() {
		System.out.println("pay by internet plan");
	}
}
