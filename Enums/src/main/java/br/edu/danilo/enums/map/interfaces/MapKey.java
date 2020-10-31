package br.edu.danilo.enums.map.interfaces;

public interface MapKey<T extends Enum<?>> {

    void addValue(T enumKey, String value);

    String getValue(T enumKey);

}
