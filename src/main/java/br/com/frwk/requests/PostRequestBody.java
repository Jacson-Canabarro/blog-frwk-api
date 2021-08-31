package br.com.frwk.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Data
public class PostRequestBody {


    @NotEmpty(message = "the post creator id is required")
    private UUID userId;

    @NotEmpty(message = "the post text is required")
    private String text;

}
