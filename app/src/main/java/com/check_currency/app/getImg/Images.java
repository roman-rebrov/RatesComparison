
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
    "original",
    "downsized",
    "downsized_large",
    "downsized_medium",
    "downsized_small",
    "downsized_still",
    "fixed_height",
    "fixed_height_downsampled",
    "fixed_height_small",
    "fixed_height_small_still",
    "fixed_height_still",
    "fixed_width",
    "fixed_width_downsampled",
    "fixed_width_small",
    "fixed_width_small_still",
    "fixed_width_still",
    "looping",
    "original_still",
    "original_mp4",
    "preview",
    "preview_gif",
    "preview_webp",
    "480w_still",
    "hd"
})
@Generated("jsonschema2pojo")
public class Images {

    @JsonProperty("original")
    public Original original;
    @JsonProperty("downsized")
    public Downsized downsized;
    @JsonProperty("downsized_large")
    public DownsizedLarge downsizedLarge;
    @JsonProperty("downsized_medium")
    public DownsizedMedium downsizedMedium;
    @JsonProperty("downsized_small")
    public DownsizedSmall downsizedSmall;
    @JsonProperty("downsized_still")
    public DownsizedStill downsizedStill;
    @JsonProperty("fixed_height")
    public FixedHeight fixedHeight;
    @JsonProperty("fixed_height_downsampled")
    public FixedHeightDownsampled fixedHeightDownsampled;
    @JsonProperty("fixed_height_small")
    public FixedHeightSmall fixedHeightSmall;
    @JsonProperty("fixed_height_small_still")
    public FixedHeightSmallStill fixedHeightSmallStill;
    @JsonProperty("fixed_height_still")
    public FixedHeightStill fixedHeightStill;
    @JsonProperty("fixed_width")
    public FixedWidth fixedWidth;
    @JsonProperty("fixed_width_downsampled")
    public FixedWidthDownsampled fixedWidthDownsampled;
    @JsonProperty("fixed_width_small")
    public FixedWidthSmall fixedWidthSmall;
    @JsonProperty("fixed_width_small_still")
    public FixedWidthSmallStill fixedWidthSmallStill;
    @JsonProperty("fixed_width_still")
    public FixedWidthStill fixedWidthStill;
    @JsonProperty("looping")
    public Looping looping;
    @JsonProperty("original_still")
    public OriginalStill originalStill;
    @JsonProperty("original_mp4")
    public OriginalMp4 originalMp4;
    @JsonProperty("preview")
    public Preview preview;
    @JsonProperty("preview_gif")
    public PreviewGif previewGif;
    @JsonProperty("preview_webp")
    public PreviewWebp previewWebp;
    @JsonProperty("480w_still")
    public com.check_currency.app.getImg._480wStill _480wStill;
    @JsonProperty("hd")
    public Hd hd;
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
