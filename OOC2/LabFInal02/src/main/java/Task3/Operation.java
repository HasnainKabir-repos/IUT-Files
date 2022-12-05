package Task3;

public interface Operation<T extends Number> {

    T add(T t1, T t2);
    T subtract(T t1, T t2);
    T multiply(T t1, T t2);
    T divide(T t1, T t2);
}
