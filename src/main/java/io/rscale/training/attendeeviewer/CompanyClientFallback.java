package io.rscale.training.attendeeviewer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.PagedResources.PageMetadata;
import org.springframework.stereotype.Component;



@Component
public class CompanyClientFallback implements CompanyClient {


	@Override
	public Company getCompany(String Company) {
		return new Company();
	}

}
