package hr.java.webshop.pagerduty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties
public class Incident {

    private String type;
    private String title;
    private Service service;
}
