package edu.neu.csye7374.Factory;

import edu.neu.csye7374.Builder.BuilderAPI;

public interface CarFactoryAPI<T> {
	public T getObject(BuilderAPI<T> builder);
}
