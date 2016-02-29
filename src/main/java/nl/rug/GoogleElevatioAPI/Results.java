/**
 * 
 */
package nl.rug.GoogleElevatioAPI;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Georgios Digkas <digasgeo@gmail.com>
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"results",
	"status"
})
public class Results {

	@JsonProperty("results")
	private List<Elevation> results;
	@JsonProperty("status")
	private String status;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Results() {
	}

	/**
	 * 
	 * @param results
	 * @param status
	 */
	public Results(List<Elevation> results, String status) {
		this.results = results;
		this.status = status;
	}

	/**
	 * 
	 * @return
	 * the results
	 */
	public List<Elevation> getResults() {
		return results;
	}

	/**
	 * 
	 * @param results
	 * the results
	 */
	public void setResults(List<Elevation> results) {
		this.results = results;
	}

	/**
	 * 
	 * @return
	 * the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 
	 * @param status
	 * the status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
