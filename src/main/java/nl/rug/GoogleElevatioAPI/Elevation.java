/**
 * 
 */
package nl.rug.GoogleElevatioAPI;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Georgios Digkas <digasgeo@gmail.com>
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"elevation",
	"resolution",
	"location"
})
public class Elevation {

	@JsonProperty("elevation")
	private Double elevation;
	@JsonProperty("resolution")
	private Double resolution;
	@JsonProperty("location")
	private Location location;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return
	 * The elevation
	 */
	@JsonProperty("elevation")
	public Double getElevation() {
		return elevation;
	}

	/**
	 * 
	 * @param elevation
	 * The elevation
	 */
	@JsonProperty("elevation")
	public void setElevation(Double elevation) {
		this.elevation = elevation;
	}

	/**
	 * 
	 * @return
	 * The resolution
	 */
	@JsonProperty("resolution")
	public Double getResolution() {
		return resolution;
	}

	/**
	 * 
	 * @param resolution
	 * The resolution
	 */
	@JsonProperty("resolution")
	public void setResolution(Double resolution) {
		this.resolution = resolution;
	}

	/**
	 * 
	 * @return
	 * The location
	 */
	@JsonProperty("location")
	public Location getLocation() {
		return location;
	}

	/**
	 * 
	 * @param location
	 * The location
	 */
	@JsonProperty("location")
	public void setLocation(Location location) {
		this.location = location;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
