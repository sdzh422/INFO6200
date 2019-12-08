package API;

public abstract class AbstractPersonFactoryAPI {
	public abstract AbstractPersonAPI getObject();
	public abstract AbstractPersonAPI getObject(String csvData);
}
