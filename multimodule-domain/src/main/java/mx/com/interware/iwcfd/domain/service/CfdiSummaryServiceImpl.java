package mx.com.interware.iwcfd.domain.service;

import javax.json.Json;

/**
 * Created by j49u4r on 10/13/16.
 */
public class CfdiSummaryServiceImpl implements CfdiSummaryService {

    @Override
    public Object all() {

        return Json.createObjectBuilder()
                .add("rfc", "ERDF3456781W3")
                .add("name", "Ernesto")
                .build();
    }
}
