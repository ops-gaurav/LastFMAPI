package lastfm.util;

import java.io.IOException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * deserializer for classes.. you don't have to use deserializer to deserialize a class
 * instead each package contains the necessary classes that would automatically deserialize
 * the JSON to you
 * @author gaurav
 *
 * @param <T>
 */
public class DeserializeObject<T> {

	public T deserealize(String json, Class<T> targetClass){
		ObjectMapper mapper = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		try {
			T object = (T) mapper.readValue(json, targetClass);
			return object;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
