package br.edu.danilo.enums.map.domain;

import java.util.EnumMap;

import org.apache.log4j.Logger;

import br.edu.danilo.enums.map.enums.MapKeyName;
import br.edu.danilo.enums.map.interfaces.MapKey;

public class MapUsingEnumAsKeyName implements MapKey<MapKeyName> {

    private static final Logger LOGGER = Logger.getLogger(MapUsingEnumAsKeyName.class);

    private EnumMap<MapKeyName, String> names;

    public MapUsingEnumAsKeyName() {
	names = new EnumMap<MapKeyName, String>(MapKeyName.class);
    }

    public void addValue(MapKeyName enumKey, String value) {
	names.put(enumKey, value);

	LOGGER.info("KEY: " + enumKey + " Value: " + value);
    }

    public void showValues() {
	LOGGER.info("Names: " + names);
    }

    public String getValue(MapKeyName enumKey) {
	return names.get(enumKey);
    }

}
