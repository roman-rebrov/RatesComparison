
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
    "avatar_url",
    "banner_image",
    "banner_url",
    "profile_url",
    "username",
    "display_name",
    "description",
    "instagram_url",
    "website_url",
    "is_verified"
})
@Generated("jsonschema2pojo")
public class User {

    @JsonProperty("avatar_url")
    public String avatarUrl;
    @JsonProperty("banner_image")
    public String bannerImage;
    @JsonProperty("banner_url")
    public String bannerUrl;
    @JsonProperty("profile_url")
    public String profileUrl;
    @JsonProperty("username")
    public String username;
    @JsonProperty("display_name")
    public String displayName;
    @JsonProperty("description")
    public String description;
    @JsonProperty("instagram_url")
    public String instagramUrl;
    @JsonProperty("website_url")
    public String websiteUrl;
    @JsonProperty("is_verified")
    public Boolean isVerified;
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
