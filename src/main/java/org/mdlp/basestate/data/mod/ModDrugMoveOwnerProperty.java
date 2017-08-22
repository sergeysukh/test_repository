package org.mdlp.basestate.data.mod;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.mdlp.basestate.data.DrugProperty;

/**
 * Short description text.
 * <p>
 * Long detailed description text for the specific class file.
 *
 * @author SSukhanov
 * @version 26.05.2017
 * @package org.mdlp.basestate.data.mod
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModDrugMoveOwnerProperty extends DrugProperty {
    // Дата и время совершения операции
    @NonNull
    @JsonProperty("op_date")
    private BrokenOpDate opDate;

    // Идентификатор собственника в ИС "Маркировка товаров"
    @NonNull
    @JsonProperty("owner_id")
    private String ownerId;

    // Регистрационный номер документа, подтверждающего собственность
    @NonNull
    @JsonProperty("doc_num")
    private String docNum;

    // Дата регистрации документа, подтверждающего собственность
    @NonNull
    @JsonProperty("doc_date")
    private String docDate;

    // Признак осуществления изменения места хранения
    @NonNull
    @JsonProperty("relocation")
    private Integer relocation;

    @Override
    public String getOpDate() {
        return opDate.getOpDate();
    }

    @Override
    @JsonIgnore
    public String getMemberId() {
        return getSystemSubjId();
    }

    @Override
    public String getReceiverId() {
        return getOwnerId();
    }
}
