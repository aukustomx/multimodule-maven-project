package mx.com.interware.iwcfd.domain.external.repository;

import mx.com.interware.iwcfd.domain.model.CfdiSummary;

import java.util.Optional;

/**
 * Created by j49u4r on 10/13/16.
 */
public interface CfdiSummaryRepository {

    Optional<CfdiSummary> all();
}
