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
public class DrugResponse {
    @JsonProperty("requestStatus")
    private RequestStatus requestStatus;
    @JsonProperty("requestResult")
    private RequestResult requestResult;
    @JsonProperty("requestError")
    private RequestError requestError;
}
