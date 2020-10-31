package br.edu.danilo.enums.map.main;

import org.apache.log4j.Logger;

import br.edu.danilo.enums.map.domain.MapUsingEnumAsKeyAddress;
import br.edu.danilo.enums.map.domain.MapUsingEnumAsKeyName;
import br.edu.danilo.enums.map.enums.MapKeyAddress;
import br.edu.danilo.enums.map.enums.MapKeyName;

public class MapUsingEnumAsKey {

    private static final Logger LOGGER = Logger.getLogger(MapUsingEnumAsKey.class);

    public static void main(String[] args) {
	LOGGER.info("Starting");

	MapUsingEnumAsKeyAddress mapUsingEnumAsKeyAddress = new MapUsingEnumAsKeyAddress();

	mapUsingEnumAsKeyAddress.addValue(MapKeyAddress.COUNTRY, "Brazil");
	mapUsingEnumAsKeyAddress.addValue(MapKeyAddress.REGION, "SRS");

	mapUsingEnumAsKeyAddress.showValues();

	MapUsingEnumAsKeyName mapUsingEnumAsKeyName = new MapUsingEnumAsKeyName();

	mapUsingEnumAsKeyName.addValue(MapKeyName.NAME, "Danilo");
	mapUsingEnumAsKeyName.addValue(MapKeyName.LAST_NAME, "Carvalho");

	mapUsingEnumAsKeyName.showValues();

	String country = mapUsingEnumAsKeyAddress.getValue(MapKeyAddress.COUNTRY);
	String name = mapUsingEnumAsKeyName.getValue(MapKeyName.NAME);

	LOGGER.info("Country: " + country);
	LOGGER.info("Name: " + name);

	LOGGER.info("Ending");

    }

}
