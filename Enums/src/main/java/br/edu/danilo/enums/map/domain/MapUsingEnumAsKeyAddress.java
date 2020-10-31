package br.edu.danilo.enums.map.domain;

import java.util.EnumMap;

import org.apache.log4j.Logger;

import br.edu.danilo.enums.map.enums.MapKeyAddress;
import br.edu.danilo.enums.map.interfaces.MapKey;

public class MapUsingEnumAsKeyAddress implements MapKey<MapKeyAddress> {

    private static final Logger LOGGER = Logger.getLogger(MapUsingEnumAsKeyAddress.class);

    private EnumMap<MapKeyAddress, String> address;

    public MapUsingEnumAsKeyAddress() {
	address = new EnumMap<MapKeyAddress, String>(MapKeyAddress.class);
    }

    public void addValue(MapKeyAddress enumKey, String value) {
	address.put(enumKey, value);

	LOGGER.info("KEY: " + enumKey + " Value: " + value);
    }

    public void showValues() {
	LOGGER.info("Address: " + address);
    }

    public String getValue(MapKeyAddress enumKey) {
	return address.get(enumKey);
    }

}
