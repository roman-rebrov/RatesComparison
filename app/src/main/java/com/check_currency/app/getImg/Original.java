
package com.check_currency.app.getImg;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "height",
    "width",
    "size",
    "url",
    "mp4_size",
    "mp4",
    "webp_size",
    "webp",
    "frames",
    "hash"
})
@Generated("jsonschema2pojo")
public class Original {

    @JsonProperty("height")
    public String height;
    @JsonProperty("width")
    public String width;
    @JsonProperty("size")
    public String size;
    @JsonProperty("url")
    public String url;
    @JsonProperty("mp4_size")
    public String mp4Size;
    @JsonProperty("mp4")
    public String mp4;
    @JsonProperty("webp_size")
    public String webpSize;
    @JsonProperty("webp")
    public String webp;
    @JsonProperty("frames")
    public String frames;
    @JsonProperty("hash")
    public String hash;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
