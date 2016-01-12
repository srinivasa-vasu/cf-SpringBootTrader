package io.pivotal.quotes.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YahooQuoteResponse {

	@JsonProperty("query")
	private YahooResult result;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YahooQuoteResponse [result=").append(result)
				.append("]");
		return builder.toString();
	}

	public YahooResult getResult() {
		return result;
	}

	public void setResult(YahooResult result) {
		this.result = result;
	}
}
