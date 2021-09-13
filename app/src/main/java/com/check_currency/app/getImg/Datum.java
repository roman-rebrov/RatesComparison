
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
    "type",
    "id",
    "url",
    "slug",
    "bitly_gif_url",
    "bitly_url",
    "embed_url",
    "username",
    "source",
    "title",
    "rating",
    "content_url",
    "source_tld",
    "source_post_url",
    "is_sticker",
    "import_datetime",
    "trending_datetime",
    "images",
    "user",
    "analytics_response_payload",
    "analytics"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("type")
    public String type;
    @JsonProperty("id")
    public String id;
    @JsonProperty("url")
    public String url;
    @JsonProperty("slug")
    public String slug;
    @JsonProperty("bitly_gif_url")
    public String bitlyGifUrl;
    @JsonProperty("bitly_url")
    public String bitlyUrl;
    @JsonProperty("embed_url")
    public String embedUrl;
    @JsonProperty("username")
    public String username;
    @JsonProperty("source")
    public String source;
    @JsonProperty("title")
    public String title;
    @JsonProperty("rating")
    public String rating;
    @JsonProperty("content_url")
    public String contentUrl;
    @JsonProperty("source_tld")
    public String sourceTld;
    @JsonProperty("source_post_url")
    public String sourcePostUrl;
    @JsonProperty("is_sticker")
    public Integer isSticker;
    @JsonProperty("import_datetime")
    public String importDatetime;
    @JsonProperty("trending_datetime")
    public String trendingDatetime;
    @JsonProperty("images")
    public Images images;
    @JsonProperty("user")
    public User user;
    @JsonProperty("analytics_response_payload")
    public String analyticsResponsePayload;
    @JsonProperty("analytics")
    public Analytics analytics;
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
