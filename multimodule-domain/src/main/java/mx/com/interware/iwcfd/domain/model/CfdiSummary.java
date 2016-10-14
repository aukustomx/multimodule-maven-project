package mx.com.interware.iwcfd.domain.model;

import java.time.LocalDateTime;

/**
 * Created by j49u4r on 10/13/16.
 */
public class CfdiSummary {

    private LocalDateTime dateOfIssue;
    private LocalDateTime dateOfTimbrado;
    private Operation operation;
    private String issuer_rfc;
    private String receiver_rfc;
    private double iva;


}
