package io.rscale.training.attendeeviewer;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "company")
public interface CompanyClient {

	Company getCompany(String id);
	
	
}
