package org.example;

public interface Calculator<T> {
    public T sum(T a, T b);

    public T difference(T a, T b);

    public T multiply(T a, T b);

    public T divide(T a, T b);
}
