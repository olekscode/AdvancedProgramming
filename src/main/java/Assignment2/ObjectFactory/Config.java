package Assignment2.ObjectFactory;

public interface Config {
    <T> Class<T> getImpl(Class<T> ifc);
}
