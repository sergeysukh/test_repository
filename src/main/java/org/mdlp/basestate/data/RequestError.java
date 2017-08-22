package org.mdlp.basestate.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by SSuvorov on 30.03.2017.
 */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestError {
    @JsonProperty("errorDescription")
    private ErrorDescription errorDescription;

    @Data
    public static class ErrorDescription {
        @JsonProperty("code")
        private int code;
        @JsonProperty("error")
        private String error;
    }
}
