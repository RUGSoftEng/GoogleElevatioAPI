/**
 * 
 */
package nl.rug.GoogleElevatioAPI;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author Georgios Digkas <digasgeo@gmail.com>
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"lat",
	"lng"
})
public class Location {

	@JsonProperty("lat")
	private Double lat;
	@JsonProperty("lng")
	private Double lng;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Location() {
	}

	/**
	 *
	 * @param lng
	 * @param lat
	 */
	public Location(Double lat, Double lng) {
		this.lat = lat;
		this.lng = lng;
	}

	/**
	 *
	 * @return
	 * The lat
	 */
	@JsonProperty("lat")
	public Double getLat() {
		return lat;
	}

	/**
	 *
	 * @param lat
	 * The lat
	 */
	@JsonProperty("lat")
	public void setLat(Double lat) {
		this.lat = lat;
	}

	/**
	 *
	 * @return
	 * The lng
	 */
	@JsonProperty("lng")
	public Double getLng() {
		return lng;
	}

	/**
	 *
	 * @param lng
	 * The lng
	 */
	@JsonProperty("lng")
	public void setLng(Double lng) {
		this.lng = lng;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
